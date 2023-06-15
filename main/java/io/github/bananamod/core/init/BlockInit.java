package io.github.bananamod.core.init;

import com.google.common.base.Supplier;

import io.github.bananamod.BananaMod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BananaMod.MOD_ID);
	
	public static final RegistryObject<Block> BANANA_ORE = register("banana_ore",
			() -> new Block(BlockBehaviour.Properties.of().strength(70).explosionResistance(1200).requiresCorrectToolForDrops()),
			new Item.Properties());
	
	public static final RegistryObject<Block> DEEPSLATE_BANANA_ORE = register("deepslate_banana_ore", 
			() -> new Block(BlockBehaviour.Properties.of().strength(75).explosionResistance(1200).requiresCorrectToolForDrops()), 
			new Item.Properties());
	
	
	public static final RegistryObject<Block> BANANA_BLOCK = register("banana_block", 
			() ->new Block(BlockBehaviour.Properties.of().strength(80).explosionResistance(1200).requiresCorrectToolForDrops()),
			new Item.Properties().rarity(Rarity.RARE));


	private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
		RegistryObject<T> block = BLOCKS.register(name, supplier);
		ItemInit.ITEMS.register(name,() -> new BlockItem(block.get(), properties));
		return block;
	}
}