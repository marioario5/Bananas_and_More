package io.github.bananamod.core.datagen;

import java.util.function.Consumer;

import io.github.bananamod.core.init.BlockInit;
import io.github.bananamod.core.init.ItemInit;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipieProvider extends RecipeProvider implements IConditionBuilder{
	
	
	public ModRecipieProvider(PackOutput output) {
		super(output);

	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
		nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ItemInit.PERFECT_BANANA_PEEL.get(),
				RecipeCategory.BUILDING_BLOCKS, BlockInit.BANANA_BLOCK.get());
		
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.BANANA_AXE.get())
                 .define('B', ItemInit.PERFECT_BANANA_PEEL.get())
                 .pattern("BBB")
                 .pattern("BBB")
                 .pattern("BBB")
                 .unlockedBy("has_black_opal", inventoryTrigger(ItemPredicate.Builder.item()
                         .of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
                 .save(consumer);
	}
}
