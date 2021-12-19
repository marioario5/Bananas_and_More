package com.turboworm27.bananamod.core.world;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.turboworm27.bananamod.BananaMod;
import com.turboworm27.bananamod.core.init.BlockInit;

import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class OreGeneration {
	public static final List<PlacedFeature> OVERWORLD_ORES = new ArrayList<>();
	public static final List<PlacedFeature> NETHER_ORES = new ArrayList<>();
	public static final List<PlacedFeature> END_ORES = new ArrayList<>();
	
	public static final RuleTest END_TEST = new BlockMatchTest(Blocks.END_STONE);
	
	public static void RegisterOres() {
		ConfiguredFeature<?, ?> bananaOre = Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(
				OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.BANANA_ORE.get().defaultBlockState())), 3));	
		final PlacedFeature placedBananaOre = bananaOre.placed(HeightRangePlacement.triangle(VerticalAnchor.absolute(30), VerticalAnchor.aboveBottom(10)),
				InSquarePlacement.spread(), CountPlacement.of(2));
		
		
		ConfiguredFeature<?, ?> crystalOre = Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(
				OreFeatures.NETHER_ORE_REPLACEABLES, BlockInit.CRYSTAL_ORE.get().defaultBlockState())), 3));
		final PlacedFeature placedCrystalOre = crystalOre.placed(HeightRangePlacement.triangle(VerticalAnchor.absolute(30), VerticalAnchor.aboveBottom(10)),
				InSquarePlacement.spread(), CountPlacement.of(2));		
		
		
		
		ConfiguredFeature<?, ?> andoriteOre = Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(
				OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.ANDORITE.get().defaultBlockState())), 10));
		final PlacedFeature placedAndoriteOre = andoriteOre.placed(HeightRangePlacement.triangle(VerticalAnchor.absolute(30), VerticalAnchor.aboveBottom(10)),
				InSquarePlacement.spread(), CountPlacement.of(30)); 	
		
		OVERWORLD_ORES.add(placedCrystalOre);
		OVERWORLD_ORES.add(placedAndoriteOre);
		OVERWORLD_ORES.add(placedBananaOre);

	}
	
	 @EventBusSubscriber(modid = BananaMod.MOD_ID, bus = Bus.FORGE)
	    public static class ForgeBusSubscriber {
	        @SubscribeEvent
	        public static void biomeLoading(BiomeLoadingEvent event) {
	            List<Supplier<PlacedFeature>> features = event.getGeneration()
	                    .getFeatures(Decoration.UNDERGROUND_ORES);

	            switch(event.getCategory()) {
	                case NETHER -> OreGeneration.NETHER_ORES.forEach(ore -> features.add(() -> ore));
	                case THEEND -> OreGeneration.END_ORES.forEach(ore -> features.add(() -> ore));
	                default -> OreGeneration.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
	            }
	        }
	    }
}
