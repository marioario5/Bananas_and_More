package com.turboworm27.graduationmod.common.armor;

import com.turboworm27.graduationmod.GraduationMod;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import java.util.function.Supplier;


public class BasisArmorMaterial {
	public static final IArmorMaterial banana = new ArmorMaterial(GraduationMod.MOD_ID + ":banana",33,new int[]{4, 5, 8, 3},12,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F,0.0F,() -> Ingredient.fromItems(Items.EMERALD));
	private static class ArmorMaterial implements IArmorMaterial{

		private static final int[] Max_Damage_Array = new int[] {13,15,16,11};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final float knochbackResistance;
        private final LazyValue<Ingredient> repairMaterial;

        public ArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, double toughness, float knochbackResistance, Supplier<Ingredient> supplier) {
            this.name = name;
            this.maxDamageFactor = maxDamageFactor;
            this.damageReductionAmountArray = damageReductionAmountArray;
            this.enchantability = enchantability;
            this.soundEvent = soundEvent;
            this.toughness = (float)toughness;
            this.knochbackResistance = knochbackResistance;
            this.repairMaterial = new LazyValue<Ingredient>(supplier);
        }

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return Max_Damage_Array[slotIn.getIndex()] * maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return repairMaterial.getValue();
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
		
	}
}
