package com.turboworm27.bananamod.core.event;

import com.turboworm27.bananamod.core.world.OreGeneration;
import com.turboworm27.bananamod.BananaMod;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = BananaMod.MOD_ID, bus = Bus.MOD)
public class CommonModEvents {
	@SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(OreGeneration::RegisterOres);
    }
}
