package io.github.bananamod.world;

import java.util.List;

import io.github.bananamod.BananaMod;
import io.github.bananamod.core.init.BlockInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {
	
	 public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BANANA_ORE_KEY = registerKey("banana_ore");
	 
	 public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
		 
		 RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
		 RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
		 
		 List<OreConfiguration.TargetBlockState> overworldBananaOres = List.of(OreConfiguration.target
				 (stoneReplaceables, BlockInit.BANANA_BLOCK.get().defaultBlockState()), OreConfiguration.target
				 (deepslateReplaceables, BlockInit.DEEPSLATE_BANANA_ORE.get().defaultBlockState()));
		 
		 register(context, OVERWORLD_BANANA_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBananaOres, 20, 0.5F));
		 
	 }
	 
	 private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
	     ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		 context.register(key, new ConfiguredFeature<>(feature, configuration));
}
	 
	 public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
	       return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(BananaMod.MOD_ID, name));
    }
}
