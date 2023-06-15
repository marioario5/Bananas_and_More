package io.github.bananamod.common;

import io.github.bananamod.BananaMod;
import io.github.bananamod.core.init.ItemInit;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;

import java.util.function.Supplier;


@SuppressWarnings("deprecation")
public class BasisArmorMaterial {
	public final static ArmorMaterial banana = new ArmorMaterialBasis(BananaMod.MOD_ID + ":banana",33,new int[]{5, 6, 9, 4}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.2F, () -> Ingredient.of(ItemInit.PERFECT_BANANA_PEEL.get()));
	
	private static class ArmorMaterialBasis implements ArmorMaterial{
		private static final int[] Max_Damage_Array = new int[] {13,15,16,11};
		private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final float knochbackResistance;
		private final LazyLoadedValue<Ingredient> repairMaterial;


		public ArmorMaterialBasis(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, double toughness, float knochbackResistance, Supplier<Ingredient> supplier) {
            this.name = name;
            this.maxDamageFactor = maxDamageFactor;
            this.damageReductionAmountArray = damageReductionAmountArray;
            this.enchantability = enchantability;
            this.soundEvent = soundEvent;
            this.toughness = (float)toughness;
            this.knochbackResistance = knochbackResistance;
            this.repairMaterial = new LazyLoadedValue<>(supplier);
        }

        @Override
        public int getEnchantmentValue() {
            return enchantability;
        }

        @Override
        public SoundEvent getEquipSound() {
            return soundEvent;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return repairMaterial.get();
        }

        @OnlyIn(Dist.CLIENT)
        @Override
        public String getName() {
            return name;
        }

        @Override
        public float getToughness() {
            return toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return this.knochbackResistance;
        }


		@Override
		public int getDurabilityForType(Type p_266807_) {

			if(p_266807_ == Type.HELMET){
				return Max_Damage_Array[0] * maxDamageFactor;
			} else if(p_266807_ == Type.CHESTPLATE) {
				return Max_Damage_Array[1] * maxDamageFactor;
			}else if(p_266807_ == Type.LEGGINGS) {
				return Max_Damage_Array[2] * maxDamageFactor;
			}else if(p_266807_ == Type.BOOTS) {
				return Max_Damage_Array[3] * maxDamageFactor;
			}
			
			else {
				return 1;
			}
			
			
		}


		@Override
		public int getDefenseForType(Type p_267168_) {

			if(p_267168_ == Type.HELMET){
				return damageReductionAmountArray[0];
			} else if(p_267168_ == Type.CHESTPLATE) {
				return damageReductionAmountArray[1];
			}else if(p_267168_ == Type.LEGGINGS) {
				return damageReductionAmountArray[2];
			}else if(p_267168_ == Type.BOOTS) {
				return damageReductionAmountArray[3];
			}
			
			else {
				return 1;
			}
		}
    }
		
}