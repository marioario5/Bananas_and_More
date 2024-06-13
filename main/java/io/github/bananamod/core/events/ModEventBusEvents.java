package io.github.bananamod.core.events;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import io.github.bananamod.BananaMod;
import io.github.bananamod.common.entity.GorillaEntity;
import io.github.bananamod.common.entity.MonkeyEntity;
import io.github.bananamod.core.init.EntityInit;

@Mod.EventBusSubscriber(modid = BananaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
	
	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EntityInit.GORILLA.get(), GorillaEntity.createAttribues().build());
		event.put(EntityInit.MONKEY.get(), MonkeyEntity.createAttributes().build());
	}
	
	
}
