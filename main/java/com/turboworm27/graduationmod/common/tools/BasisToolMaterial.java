package com.turboworm27.graduationmod.common.tools;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.item.Items;

public class BasisToolMaterial {
	
	public static final IItemTier banana = new ToolMaterial(5,4062,22F,4.5, 35, () -> Ingredient.fromItems(Items.DIAMOND));
	public static final IItemTier cristal = new ToolMaterial(3, 3035, 20F, 6, 30, () -> Ingredient.fromItems(Items.DIAMOND));
	
	private static class ToolMaterial implements IItemTier{
			private final int harvestLevel;
			private final int maxUses;
			private final float efficiency;
			private final float attackDamage;
			private final int enchantability;
			private final LazyValue<Ingredient> repair;
	 	 
			public ToolMaterial(int harvestLevel, int maxUses, float efficiency, double attackDamage, int enchantability, Supplier<Ingredient> supplier) {
				this.harvestLevel = harvestLevel;
				this.maxUses = maxUses;
				this.efficiency = efficiency;
				this.attackDamage = (float)attackDamage;
				this.enchantability = enchantability;
				this.repair = new LazyValue<Ingredient>(supplier);
			}
			@Override
			public int getMaxUses() {
				return maxUses;
			}

			@Override
			public float getEfficiency() {
				return efficiency;
			}

			@Override
			public float getAttackDamage() {
				return attackDamage;
			}

			@Override
			public int getHarvestLevel() {
				return harvestLevel;
			}

			@Override
			public int getEnchantability() {
				return enchantability;
			}

			@Override
			public Ingredient getRepairMaterial() {
				return repair.getValue();
			}
			
	}
}
