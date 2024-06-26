package io.github.bananamod.common;

import io.github.bananamod.core.init.ItemInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class BasisToolMaterial {
	public static final Tier BANANA = new ForgeTier(
			4062, 
			35f,
			5,
			20,
			null,
			() -> Ingredient.of(ItemInit.PERFECT_BANANA_PEEL.get()),
			BlockTags.INCORRECT_FOR_NETHERITE_TOOL);
}