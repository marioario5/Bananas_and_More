package io.github.bananamod.common;

import java.util.function.Supplier;

import com.google.common.base.Suppliers;

import io.github.bananamod.core.init.ItemInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class BasisToolMaterial {
	
	public static final Tier banana = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4062, 22f, 4.5, 35, () -> Ingredient.of(ItemInit.PERFECT_BANANA_PEEL.get()));
	
	private static class ToolMaterial implements Tier{

		private final TagKey<Block> incorrectBlocksForDrops;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
		private final Supplier<Ingredient> repair;

        public ToolMaterial(TagKey<Block> incorrectBlocksForDrops, int maxUses, float efficiency, double attackDamage, int enchantability,  Supplier<Ingredient> supplier) {
            this.incorrectBlocksForDrops = incorrectBlocksForDrops;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = (float)attackDamage;
            this.enchantability = enchantability;
            this.repair = Suppliers.memoize(supplier::get);
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
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return incorrectBlocksForDrops;
		}

		@Override
		public int getEnchantmentValue() {
			return enchantability;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return repair.get();
		}
	}
}