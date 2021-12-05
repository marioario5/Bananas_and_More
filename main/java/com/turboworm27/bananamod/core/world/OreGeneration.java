package com.turboworm27.bananamod.core.world;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.turboworm27.bananamod.BananaMod;
import com.turboworm27.bananamod.core.init.BlockInit;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class OreGeneration {
	public static final List<ConfiguredFeature<?, ?>> OVERWORLD_ORES = new ArrayList<>();
	public static final List<ConfiguredFeature<?, ?>> NETHER_ORES = new ArrayList<>();
	public static final List<ConfiguredFeature<?, ?>> END_ORES = new ArrayList<>();
	
	public static final RuleTest END_TEST = new BlockMatchTest(Blocks.END_STONE);
	
	public static void RegisterOres() {
		ConfiguredFeature<?, ?> bananaOre = Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(
				OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES, BlockInit.BANANA_ORE.get().defaultBlockState())), 3))
				.rangeTriangle(VerticalAnchor.absolute(30), VerticalAnchor.belowTop(10)).squared().count(1);
		
		NETHER_ORES.add(register("banana_ore", bananaOre));
		ConfiguredFeature<?, ?> crystalOre = Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(
				OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES, BlockInit.CRYSTAL_ORE.get().defaultBlockState())), 3))
				.rangeTriangle(VerticalAnchor.absolute(30), VerticalAnchor.belowTop(10)).squared().count(1);
		
		OVERWORLD_ORES.add(register("crystal_ore", crystalOre));		
		ConfiguredFeature<?, ?> andoriteOre = Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(
				OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, BlockInit.ANDORITE.get().defaultBlockState())), 10))
				.rangeTriangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(20)).squared().count(50);
		
		OVERWORLD_ORES.add(register("andorite_ore", andoriteOre));
	}
	
	public static <Config extends FeatureConfiguration> ConfiguredFeature<Config,?> register(String
			name, ConfiguredFeature<Config, ?> configuredFeature){
		
		return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation
				(BananaMod.MOD_ID, name), configuredFeature);
	}
	
	 @EventBusSubscriber(modid = BananaMod.MOD_ID, bus = Bus.FORGE)
	    public static class ForgeBusSubscriber {
	        @SubscribeEvent
	        public static void biomeLoading(BiomeLoadingEvent event) {
	            List<Supplier<ConfiguredFeature<?, ?>>> features = event.getGeneration()
	                    .getFeatures(Decoration.UNDERGROUND_ORES);

	            switch(event.getCategory()) {
	                case NETHER -> OreGeneration.NETHER_ORES.forEach(ore -> features.add(() -> ore));
	                case THEEND -> OreGeneration.END_ORES.forEach(ore -> features.add(() -> ore));
	                default -> OreGeneration.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
	            }
	        }
	    }
}
