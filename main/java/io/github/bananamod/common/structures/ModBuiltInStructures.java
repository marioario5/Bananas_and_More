package io.github.bananamod.common.structures;

import io.github.bananamod.BananaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.Structure;

public class ModBuiltInStructures {
	public static final ResourceKey<Structure> BANANA_DUNGEON = createKey("banana_dungeon");
	
	private static ResourceKey<Structure> createKey(String p_209873_) {
	      return ResourceKey.create(Registries.STRUCTURE, new ResourceLocation(BananaMod.MOD_ID, p_209873_));
	   }
}
