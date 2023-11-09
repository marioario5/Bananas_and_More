package io.github.bananamod.core.datagen;

import io.github.bananamod.BananaMod;
import io.github.bananamod.core.init.BlockInit;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider{
	
	public ModBlockStateProvider(PackOutput output,  ExistingFileHelper exFileHelper) {
		super(output, BananaMod.MOD_ID, exFileHelper);

	}

	@Override
	protected void registerStatesAndModels() {
		blockWithItem(BlockInit.BANANA_BLOCK);
		blockWithItem(BlockInit.BANANA_ORE);
		blockWithItem(BlockInit.DEEPSLATE_BANANA_ORE);
	}
	
	private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
		simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
	}
	
}

