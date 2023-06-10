package io.github.bananamod.core.init;

import com.google.common.base.Supplier;

import io.github.bananamod.BananaMod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BananaMod.MODID);
	
	public static final RegistryObject<Block> BANANA_ORE = register("banana_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)),
<<<<<<< HEAD
			new Item.Properties());
	
	public static final RegistryObject<Block> BANANA_BLOCK = register("banana_block", 
			() ->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)),
			new Item.Properties().rarity(Rarity.RARE));
=======
			new Item.Properties().tab(CreativeTabInit.banana));
	
	public static final RegistryObject<Block> BANANA_BLOCK = register("banana_block", 
			() ->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)),
			new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE));
	
	//awaiting development...
	/*
	public static final RegistryObject<Block> CRYSTAL_ORE = register("crystal_ore", 
			() ->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)),
			new Item.Properties());
	
	public static final RegistryObject<Block> CRYSTAL_BLOCK = register("crystal_block", 
			() ->new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)),
			new Item.Properties());
	*/
>>>>>>> 9d31e7a55f7e7723e4395c3f69d5f0c957b690e4
	
	private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
		RegistryObject<T> block = BLOCKS.register(name, supplier);
		ItemInit.ITEMS.register(name,() -> new BlockItem(block.get(), properties));
		return block;
	}
}