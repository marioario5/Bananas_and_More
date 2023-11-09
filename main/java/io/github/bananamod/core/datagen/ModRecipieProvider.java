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
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipieProvider extends RecipeProvider implements IConditionBuilder{
	
	
	public ModRecipieProvider(PackOutput output) {
		super(output);

	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
		
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.BANANA_BLOCK.get())
                 .define('#', ItemInit.PERFECT_BANANA_PEEL.get())
                 .pattern("###")
                 .pattern("###")
                 .pattern("###")
                 .unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
                         .of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
                 .save(consumer);
		
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemInit.PERFECT_BANANA_PEEL.get())
        		.requires(BlockInit.BANANA_BLOCK.get())
        		.unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
        				.of(BlockInit.BANANA_BLOCK.get()).build()))
        		.save(consumer);
		
		ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemInit.PERFECT_BANANA.get())
        		.define('#', ItemInit.PERFECT_BANANA_PEEL.get())
        		.define('}', ItemInit.HEART_OF_BANANA.get())
        		.pattern("###")
        		.pattern("#}#")
        		.pattern("###")
        		.unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
        				.of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
        		.save(consumer);
		

		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.BANANA_AXE.get())
                 .define('#', ItemInit.PERFECT_BANANA_PEEL.get())
                 .define('/', Items.STICK)
                 .pattern(" ##")
                 .pattern(" /#")
                 .pattern(" / ")
                 .unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
                         .of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
                 .save(consumer);
		
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.BANANA_SWORD.get())
        	     .define('#', ItemInit.PERFECT_BANANA_PEEL.get())
        	     .define('/', Items.STICK)
        	     .pattern(" # ")
        	     .pattern(" # ")
        	     .pattern(" / ")
        	     .unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
        	    		 .of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
        	     .save(consumer);
		
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ItemInit.BANANA_PICKAXE.get())
	     		.define('#', ItemInit.PERFECT_BANANA_PEEL.get())
	     		.define('/', Items.STICK)
	     		.pattern("###")
	     		.pattern(" / ")
	     		.pattern(" / ")
	     		.unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
	     				.of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
	     		.save(consumer);
		
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ItemInit.BANANA_SHOVEL.get())
	     		.define('#', ItemInit.PERFECT_BANANA_PEEL.get())
	     		.define('/', Items.STICK)
	     		.pattern(" # ")
	     		.pattern(" / ")
	     		.pattern(" / ")
	     		.unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
	     				.of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
	     		.save(consumer);
		
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ItemInit.BANANA_HOE.get())
     			.define('#', ItemInit.PERFECT_BANANA_PEEL.get())
     			.define('/', Items.STICK)
     			.pattern(" ##")
     			.pattern(" / ")
     			.pattern(" / ")
     			.unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
     					.of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
     			.save(consumer);
		
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.BANANA_HELMET.get())
     			.define('#', ItemInit.PERFECT_BANANA_PEEL.get())
     			.pattern("###")
     			.pattern("# #")
     			.unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
     					.of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
     			.save(consumer);
		
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.BANANA_CHESTPLATE.get())
				.define('#', ItemInit.PERFECT_BANANA_PEEL.get())
				.pattern("# #")
				.pattern("###")
				.pattern("###")
				.unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
						.of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
				.save(consumer);
		
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.BANANA_LEGGINGS.get())
				.define('#', ItemInit.PERFECT_BANANA_PEEL.get())
				.pattern("###")
				.pattern("# #")
				.pattern("# #")
				.unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
						.of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
				.save(consumer);
		
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.BANANA_BOOTS.get())
				.define('#', ItemInit.PERFECT_BANANA_PEEL.get())
				.pattern("   ")
				.pattern("# #")
				.pattern("# #")
				.unlockedBy("has_banana_peel", inventoryTrigger(ItemPredicate.Builder.item()
						.of(ItemInit.PERFECT_BANANA_PEEL.get()).build()))
				.save(consumer);
	}
}
