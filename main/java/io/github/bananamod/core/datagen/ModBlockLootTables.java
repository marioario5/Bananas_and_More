package io.github.bananamod.core.datagen;

import java.util.Set;

import io.github.bananamod.core.init.BlockInit;
import io.github.bananamod.core.init.ItemInit;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLootSubProvider{

	public ModBlockLootTables() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
	}
	
	@Override
	protected void generate() {
		dropSelf(BlockInit.BANANA_BLOCK.get());
			
		add(BlockInit.BANANA_ORE.get(),
				(block) -> createOreDrop(BlockInit.BANANA_ORE.get(), ItemInit.PERFECT_BANANA_PEEL.get()));
		add(BlockInit.DEEPSLATE_BANANA_ORE.get(),
                (block) -> createOreDrop(BlockInit.DEEPSLATE_BANANA_ORE.get(), ItemInit.PERFECT_BANANA_PEEL.get()));
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks() {
		return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
	}
	
}
