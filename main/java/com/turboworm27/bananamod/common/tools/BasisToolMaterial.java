package com.turboworm27.bananamod.common.tools;

import java.util.function.Supplier;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;

@SuppressWarnings("deprecation")
public class BasisToolMaterial {
	public static final Tier banana = new ToolMaterial(5 ,4062, 22F, 4.5, 35, ()-> Ingredient.of(Items.DIAMOND));
	public static final Tier crystal = new ToolMaterial(5, 3035, 20f, 6, 30, ()-> Ingredient.of(Items.DIAMOND));

	private static class ToolMaterial implements Tier{

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
		private final LazyLoadedValue<Ingredient> repair;

        public ToolMaterial(int harvestLevel, int maxUses, float efficiency, double attackDamage, int enchantability, Supplier<Ingredient> supplier) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = (float)attackDamage;
            this.enchantability = enchantability;
            this.repair = new LazyLoadedValue<>(supplier);
        }

        @Override
        public int getUses() {
            return maxUses;
        }

        @Override
        public float getSpeed() {
            return efficiency;
        }

        @Override
        public float getAttackDamageBonus() {
            return attackDamage;
        }

        @Override
        public int getLevel() {
            return harvestLevel;
        }

        @Override
        public int getEnchantmentValue() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return this.repair.get();
        }
    }
}
