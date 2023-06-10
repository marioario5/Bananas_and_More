package io.github.bananamod;

import io.github.bananamod.core.init.BlockInit;
import io.github.bananamod.core.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BananaMod.MODID)

public class BananaMod {
	public static final String MODID = "bananamod";

	public BananaMod() {	
		IEventBus bus =  FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
	}

}