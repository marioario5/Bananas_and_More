package io.github.bananamod.core.events;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.entity.client.GorillaModel;
import io.github.bananamod.common.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = BananaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value= Dist.CLIENT)
public class ModEventBusClientEvents {
	@SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.GORILLA_LAYER, GorillaModel::createBodyLayer);
    }

}
