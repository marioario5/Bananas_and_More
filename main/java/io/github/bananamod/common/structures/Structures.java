package io.github.bananamod.common.structures;

import io.github.bananamod.BananaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.structure.Structure;

public class Structures {
	public static final TagKey<Structure> ON_BANANA_EXPLORER_MAPS = create("on_banana_exporer_maps");
	
	private static TagKey<Structure> create(String p_215896_) {
	      return TagKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(BananaMod.MOD_ID, p_215896_));
	   }
}
