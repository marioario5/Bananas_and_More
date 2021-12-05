package com.turboworm27.bananamod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.turboworm27.bananamod.core.init.BlockInit;
import com.turboworm27.bananamod.core.init.ItemInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@SuppressWarnings("unused")
@Mod(BananaMod.MOD_ID)
public class BananaMod
{
    //Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "bananamod";

    public BananaMod() {
    	FMLJavaModLoadingContext.get().getModEventBus().register(this);
        IEventBus bus =  FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        //MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event){

    }
    
    @SubscribeEvent
    public void ready(FMLLoadCompleteEvent event) {
    	
    }
}