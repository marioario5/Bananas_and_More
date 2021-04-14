package com.turboworm27.graduationmod.core.init;

import com.turboworm27.graduationmod.GraduationMod;
import com.turboworm27.graduationmod.common.blocks.ModSlab;
import com.turboworm27.graduationmod.common.blocks.ModStair;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	//normal blocks
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,GraduationMod.MOD_ID);
	public static final RegistryObject<Block> ANDORITE = BLOCKS.register("andorite", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 6f).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> POLISHED_ANDORITE = BLOCKS.register("polished_andorite", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 6f).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> ANDORITE_BRICKS = BLOCKS.register("andorite_bricks", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f, 6f).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> BANANA_ORE = BLOCKS.register("banana_ore", () -> new Block(AbstractBlock.Properties.create(Material.MISCELLANEOUS, MaterialColor.IRON).hardnessAndResistance(1.5f, 6f).harvestTool(ToolType.PICKAXE).harvestLevel(4).sound(SoundType.ANCIENT_DEBRIS).setRequiresTool()));
	public static final RegistryObject<Block> PERFECT_BANANA_BLOCK = BLOCKS.register("perfect_banana_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(50f, 1200f).harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE).setRequiresTool()));
	public static final RegistryObject<Block> WASTED_WOOD = BLOCKS.register("wasted_wood", () -> new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.15f, 0.15f).harvestTool(ToolType.AXE).harvestLevel(1).sound(SoundType.WOOD).setRequiresTool()));
	public static final RegistryObject<Block> STRIPED_WASTED_WOOD = BLOCKS.register("striped_wasted_wood", () -> new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.15f, 0.15f).harvestTool(ToolType.AXE).harvestLevel(1).sound(SoundType.WOOD).setRequiresTool()));
	public static final RegistryObject<Block> WASTED_PLANKS = BLOCKS.register("wasted_planks", () -> new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(0.15f, 0.15f).harvestTool(ToolType.AXE).harvestLevel(1).sound(SoundType.WOOD).setRequiresTool()));
	public static final RegistryObject<Block> WASTED_LEAVES = BLOCKS.register("wasted_leaves", () -> new Block(AbstractBlock.Properties.create(Material.ORGANIC, MaterialColor.GREEN).hardnessAndResistance(0.15f, 0.15f).harvestTool(ToolType.HOE).harvestLevel(1).sound(SoundType.PLANT)));
	public static final RegistryObject<Block> CRYSTAL_ORE = BLOCKS.register("crystal_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).hardnessAndResistance(45F, 1200F).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(4).sound(SoundType.METAL)));
	public static final RegistryObject<Block> CRYSTAL_BLOCK = BLOCKS.register("crystal_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.LIGHT_BLUE).hardnessAndResistance(45F, 1200F).harvestTool(ToolType.PICKAXE).setRequiresTool().harvestLevel(4).sound(SoundType.METAL)));
	
	//custom blocks
	public static final RegistryObject<ModStair> ANDORITE_STAIRS = BLOCKS.register("andorite_stairs", () -> new ModStair(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool().hardnessAndResistance(1.5f, 6f)));
	public static final RegistryObject<ModStair> POLISHED_ANDORITE_STAIRS = BLOCKS.register("polished_andorite_stairs", () -> new ModStair(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool().hardnessAndResistance(1.5f, 6f)));
	public static final RegistryObject<ModSlab> ANDORITE_SLAB = BLOCKS.register("andorite_slab", () -> new ModSlab(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool().hardnessAndResistance(1.5f, 6f)));
	public static final RegistryObject<ModSlab> POLISHED_ANDORITE_SLAB = BLOCKS.register("polished_andorite_slab", () -> new ModSlab(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).setRequiresTool().hardnessAndResistance(1.5f, 6f)));
}
