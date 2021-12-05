package com.turboworm27.bananamod.common.armor;

import com.turboworm27.bananamod.BananaMod;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;

import java.util.function.Supplier;


@SuppressWarnings("deprecation")
public class BasisArmorMaterial {
	public final static ArmorMaterial banana = new ArmorMaterialBasis(BananaMod.MOD_ID + ":banana",33,new int[]{5, 6, 9, 4}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.2F, () -> Ingredient.of(Items.DIAMOND));
	public static final ArmorMaterial crystal = new ArmorMaterialBasis(BananaMod.MOD_ID + ":crystal",33,new int[]{7, 8, 11, 6}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 5.0F, 0.2F, () -> Ingredient.of(Items.DIAMOND));
	
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
        public int getDurabilityForSlot(EquipmentSlot slotIn) {
            return Max_Damage_Array[slotIn.getIndex()] * maxDamageFactor;
        }

        @Override
        public int getDefenseForSlot(EquipmentSlot slotIn) {
            return damageReductionAmountArray[slotIn.getIndex()];
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
    }
		
}

