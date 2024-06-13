package io.github.bananamod;

import io.github.bananamod.common.entity.client.gorilla.GorillaRenderer;
import io.github.bananamod.common.entity.client.monkey.MonkeyRenderer;
import io.github.bananamod.core.init.BlockInit;
import io.github.bananamod.core.init.CreativeTabInit;
import io.github.bananamod.core.init.EntityInit;
import io.github.bananamod.core.init.ItemInit;
import io.github.bananamod.core.init.SoundInit;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(BananaMod.MOD_ID)
public class BananaMod {
	public static final String MOD_ID = "bananamod";

	public BananaMod() {	
		IEventBus bus =  FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		EntityInit.ENTITY_TYPES.register(bus);
		CreativeTabInit.CREATIVE_TABS.register(bus);
		SoundInit.SOUND_EVENTS.register(bus);
		
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
	
	@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientEvents {
		
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
			EntityRenderers.register(EntityInit.GORILLA.get(), GorillaRenderer::new);
			EntityRenderers.register(EntityInit.MONKEY.get(), MonkeyRenderer::new);
		}
	}
	
}