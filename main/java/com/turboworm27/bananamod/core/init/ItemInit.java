package com.turboworm27.bananamod.core.init;

import com.turboworm27.bananamod.BananaMod;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	//normal items
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,BananaMod.MOD_ID);
	public static final RegistryObject<Item> PERFECT_BANANA_PEEL = ITEMS.register("perfect_banana_peel",() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GREEN_BANANA_PEEL = ITEMS.register("green_banana_peel",() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> YELLOW_BANANA_PEEL = ITEMS.register("yellow_banana_peel",() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> ROTTEN_BANANA_PEEL = ITEMS.register("rotten_banana_peel",() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GREEN_BROWN_BANANA_PEEL = ITEMS.register("green_brown_banana_peel",() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> HEART_OF_BANANA = ITEMS.register("heart_of_banana", () -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard", () -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> CRYSTAL_INGOT = ITEMS.register("crystal_ingot",() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<Item> GLASS_SHARD = ITEMS.register("glass_shard", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	//food items
	public static final RegistryObject<Item> PERFECT_BANANA = ITEMS.register("perfect_banana", () -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON).food(new FoodProperties.Builder().effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.JUMP, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 6000, 9), 1.0F).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 6000, 2), 1.0F).nutrition(10).saturationMod(2.5F).build())));
	public static final RegistryObject<Item> GREEN_BANANA = ITEMS.register("green_banana", () -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.9F).build())));
	public static final RegistryObject<Item> YELLOW_BANANA = ITEMS.register("yellow_banana", () -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON).food(new FoodProperties.Builder().effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600, 1), 1.0F).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3600, 1), 1.0F).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1), 1.0F).nutrition(7).saturationMod(1.2F).build())));
	public static final RegistryObject<Item> ROTTEN_BANANA = ITEMS.register("rotten_banana", () -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON).food(new FoodProperties.Builder().effect(() -> new MobEffectInstance(MobEffects.POISON, 400, 20), 1f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 400, 1), 1F).nutrition(5).saturationMod(0.9F).build())));
	public static final RegistryObject<Item> GREEN_BROWN_BANANA = ITEMS.register("green_brown_banana", () -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON).food(new FoodProperties.Builder().effect(() -> new MobEffectInstance(MobEffects.HARM, 400, 20), 1f).nutrition(5).saturationMod(0.9F).build())));
	public static final RegistryObject<Item> BEANS = ITEMS.register("beans",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(5).saturationMod(4.5f).build())));
	
	//block items
	public static final RegistryObject<BlockItem> ANDORITE = ITEMS.register("andorite", () -> new BlockItem(BlockInit.ANDORITE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> POLISHED_ANDORITE = ITEMS.register("polished_andorite", () -> new BlockItem(BlockInit.POLISHED_ANDORITE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> ANDORITE_BRICKS = ITEMS.register("andorite_bricks", () -> new BlockItem(BlockInit.ANDORITE_BRICKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	//public static final RegistryObject<BlockItem> ANDORITE_SLAB = ITEMS.register("andorite_slab", () -> new BlockItem(BlockInit.ANDORITE_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	//public static final RegistryObject<BlockItem> POLSIHED_ANDORITE_SLAB = ITEMS.register("polished_andorite_slab", () -> new BlockItem(BlockInit.POLISHED_ANDORITE_SLAB.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	//public static final RegistryObject<BlockItem> ANDORITE_STAIRS = ITEMS.register("andorite_stairs", () -> new BlockItem(BlockInit.ANDORITE_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	//public static final RegistryObject<BlockItem> POLISHED_ANDORITE_STAIRS = ITEMS.register("polished_andorite_stairs", () -> new BlockItem(BlockInit.POLISHED_ANDORITE_STAIRS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> BANANA_ORE = ITEMS.register("banana_ore", () -> new BlockItem(BlockInit.BANANA_ORE.get(), new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON)));
	public static final RegistryObject<BlockItem> PERFECT_BANANA_BLOCK = ITEMS.register("perfect_banana_block", () -> new BlockItem(BlockInit.PERFECT_BANANA_BLOCK.get(), new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.EPIC)));
	public static final RegistryObject<BlockItem> WASTED_WOOD = ITEMS.register("wasted_wood", () -> new BlockItem(BlockInit.WASTED_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> STRIPED_WASTED_WOOD = ITEMS.register("striped_wasted_wood", () -> new BlockItem(BlockInit.STRIPED_WASTED_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> WASTED_PLANKS = ITEMS.register("wasted_planks", () -> new BlockItem(BlockInit.WASTED_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> WASTED_LEAVES = ITEMS.register("wasted_leaves", () -> new BlockItem(BlockInit.WASTED_LEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<BlockItem> CRYSTAL_BLOCK = ITEMS.register("crystal_block", () -> new BlockItem(BlockInit.CRYSTAL_BLOCK.get(),new Item.Properties().tab(CreativeTabInit.crystal).rarity(Rarity.EPIC)));
	public static final RegistryObject<BlockItem> CRYSTAL_ORE = ITEMS.register("crystal_ore", () -> new BlockItem(BlockInit.CRYSTAL_ORE.get(),new Item.Properties().tab(CreativeTabInit.crystal).rarity(Rarity.UNCOMMON)));
	
}