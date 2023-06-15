package io.github.bananamod.core.datagen;

import io.github.bananamod.BananaMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BananaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		PackOutput packOutput = generator.getPackOutput();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		
		generator.addProvider(true, new ModRecipieProvider(packOutput));
		new ModLootTableProvider();
		generator.addProvider(true, ModLootTableProvider.create(packOutput));
		generator.addProvider(true, new ModBlockStateProvider(packOutput, existingFileHelper));
		generator.addProvider(true, new ModItemModelProvider(packOutput, existingFileHelper));
		
	}
	
}
