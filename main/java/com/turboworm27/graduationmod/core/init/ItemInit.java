package com.turboworm27.graduationmod.core.init;

import com.turboworm27.graduationmod.GraduationMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	//normal items
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,GraduationMod.MOD_ID);
	public static final RegistryObject<Item> PERFECT_BANANA_PEEL = ITEMS.register("perfect_banana_peel",() -> new Item(new Item.Properties().group(GraduationMod.BANANAGROUP).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GREEN_BANANA_PEEL = ITEMS.register("green_banana_peel",() -> new Item(new Item.Properties().group(GraduationMod.BANANAGROUP).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> YELLOW_BANANA_PEEL = ITEMS.register("yellow_banana_peel",() -> new Item(new Item.Properties().group(GraduationMod.BANANAGROUP).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROTTEN_BANANA_PEEL = ITEMS.register("rotten_banana_peel",() -> new Item(new Item.Properties().group(GraduationMod.BANANAGROUP).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GREEN_BROWN_BANANA_PEEL = ITEMS.register("green_brown_banana_peel",() -> new Item(new Item.Properties().group(GraduationMod.BANANAGROUP).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> HEART_OF_BANANA = ITEMS.register("heart_of_banana", () -> new Item(new Item.Properties().group(GraduationMod.BANANAGROUP).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard", () -> new Item(new Item.Properties().group(GraduationMod.CRYSTALGROUP).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> CRYSTAL_INGOT = ITEMS.register("crystal_ingot",() -> new Item(new Item.Properties().group(GraduationMod.CRYSTALGROUP).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GLASS_SHARD = ITEMS.register("glass_shard", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	//food items
	public static final RegistryObject<Item> PERFECT_BANANA = ITEMS.register("perfect_banana", () -> new Item(new Item.Properties().group(GraduationMod.BANANAGROUP).food(FoodInit.PERFECT_BANANA).rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> GREEN_BANANA = ITEMS.register("green_banana", () -> new Item(new Item.Properties().group(GraduationMod.BANANAGROUP).food(FoodInit.GREEN_BANANA).rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> YELLOW_BANANA = ITEMS.register("yellow_banana", () -> new Item(new Item.Properties().group(GraduationMod.BANANAGROUP).food(FoodInit.YELLOW_BANANA).rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> ROTTEN_BANANA = ITEMS.register("rotten_banana", () -> new Item(new Item.Properties().group(GraduationMod.BANANAGROUP).food(FoodInit.ROTTEN_BANANA).rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> GREEN_BROWN_BANANA = ITEMS.register("green_brown_banana", () -> new Item(new Item.Properties().group(GraduationMod.BANANAGROUP).food(FoodInit.GREEN_BROWN_BANANA).rarity(Rarity.EPIC)));
	
	//block items
	public static final RegistryObject<BlockItem> ANDORITE = ITEMS.register("andorite", () -> new BlockItem(BlockInit.ANDORITE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> POLISHED_ANDORITE = ITEMS.register("polished_andorite", () -> new BlockItem(BlockInit.POLISHED_ANDORITE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> ANDORITE_BRICKS = ITEMS.register("andorite_bricks", () -> new BlockItem(BlockInit.ANDORITE_BRICKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> ANDORITE_SLAB = ITEMS.register("andorite_slab", () -> new BlockItem(BlockInit.ANDORITE_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> POLSIHED_ANDORITE_SLAB = ITEMS.register("polished_andorite_slab", () -> new BlockItem(BlockInit.POLISHED_ANDORITE_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> ANDORITE_STAIRS = ITEMS.register("andorite_stairs", () -> new BlockItem(BlockInit.ANDORITE_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> POLISHED_ANDORITE_STAIRS = ITEMS.register("polished_andorite_stairs", () -> new BlockItem(BlockInit.POLISHED_ANDORITE_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BANANA_ORE = ITEMS.register("banana_ore", () -> new BlockItem(BlockInit.BANANA_ORE.get(), new Item.Properties().group(GraduationMod.BANANAGROUP).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<BlockItem> PERFECT_BANANA_BLOCK = ITEMS.register("perfect_banana_block", () -> new BlockItem(BlockInit.PERFECT_BANANA_BLOCK.get(), new Item.Properties().group(GraduationMod.BANANAGROUP).rarity(Rarity.EPIC)));
	public static final RegistryObject<BlockItem> WASTED_WOOD = ITEMS.register("wasted_wood", () -> new BlockItem(BlockInit.WASTED_WOOD.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> STRIPED_WASTED_WOOD = ITEMS.register("striped_wasted_wood", () -> new BlockItem(BlockInit.STRIPED_WASTED_WOOD.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> WASTED_PLANKS = ITEMS.register("wasted_planks", () -> new BlockItem(BlockInit.WASTED_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> WASTED_LEAVES = ITEMS.register("wasted_leaves", () -> new BlockItem(BlockInit.WASTED_LEAVES.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRYSTAL_BLOCK = ITEMS.register("crystal_block", () -> new BlockItem(BlockInit.CRYSTAL_BLOCK.get(),new Item.Properties().group(GraduationMod.CRYSTALGROUP).rarity(Rarity.EPIC)));
	public static final RegistryObject<BlockItem> CRYSTAL_ORE = ITEMS.register("crystal_ore", () -> new BlockItem(BlockInit.CRYSTAL_ORE.get(),new Item.Properties().group(GraduationMod.CRYSTALGROUP).rarity(Rarity.UNCOMMON)));
	
}