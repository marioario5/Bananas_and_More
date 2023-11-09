package io.github.bananamod;

import io.github.bananamod.core.init.BlockInit;
import io.github.bananamod.core.init.CreativeTabInit;
import io.github.bananamod.core.init.EntityInit;
import io.github.bananamod.core.init.ItemInit;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(BananaMod.MOD_ID)
public class BananaMod {
	public static final String MOD_ID = "bananamod";

	public BananaMod() {	
		IEventBus bus =  FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		EntityInit.ENTITIES.register(bus);
		CreativeTabInit.CREATIVE_TABS.register(bus);
		
		bus.addListener(this::addCreative);
	}

	private void addCreative(BuildCreativeModeTabContentsEvent event) {
		if(event.getTab() == CreativeTabInit.BANANA_TAB.get()) {
			
			event.accept(ItemInit.BANANA_AXE);
			event.accept(ItemInit.BANANA_BOOTS);
			event.accept(ItemInit.BANANA_CHESTPLATE);
			event.accept(ItemInit.BANANA_HELMET);
			event.accept(ItemInit.BANANA_HOE);
			event.accept(ItemInit.BANANA_LEGGINGS);
			event.accept(ItemInit.BANANA_PICKAXE);
			event.accept(ItemInit.BANANA_SHOVEL);
			event.accept(ItemInit.BANANA_SWORD);
			event.accept(ItemInit.HEART_OF_BANANA);
			event.accept(ItemInit.PERFECT_BANANA);
			event.accept(ItemInit.PERFECT_BANANA_PEEL);
			event.accept(BlockInit.BANANA_BLOCK);
			event.accept(BlockInit.BANANA_ORE);
			event.accept(BlockInit.DEEPSLATE_BANANA_ORE);
			
		}
	}
	
}