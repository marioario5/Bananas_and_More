package com.turboworm27.bananamod.core.init;

import com.turboworm27.bananamod.BananaMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	//Deferred Register
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,BananaMod.MOD_ID);
	
	//Registry Object
	public static final RegistryObject<Block> ANDORITE = BLOCKS.register("andorite", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5f, 6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> POLISHED_ANDORITE = BLOCKS.register("polished_andorite", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5f, 6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ANDORITE_BRICKS = BLOCKS.register("andorite_bricks", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5f, 6f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BANANA_ORE = BLOCKS.register("banana_ore", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL, MaterialColor.COLOR_LIGHT_GRAY).strength(1.5f, 6f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PERFECT_BANANA_BLOCK = BLOCKS.register("perfect_banana_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL, MaterialColor.COLOR_LIGHT_GRAY).strength(50f, 1200f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> WASTED_WOOD = BLOCKS.register("wasted_wood", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.15f, 0.15f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> STRIPED_WASTED_WOOD = BLOCKS.register("striped_wasted_wood", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.15f, 0.15f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> WASTED_PLANKS = BLOCKS.register("wasted_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.15f, 0.15f).sound(SoundType.WOOD).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> WASTED_LEAVES = BLOCKS.register("wasted_leaves", () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.COLOR_GRAY).sound(SoundType.ROOTS)));
	public static final RegistryObject<Block> CRYSTAL_ORE = BLOCKS.register("crystal_ore", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN).strength(45F, 1200F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CRYSTAL_BLOCK = BLOCKS.register("crystal_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN).strength(45F, 1200F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
}
