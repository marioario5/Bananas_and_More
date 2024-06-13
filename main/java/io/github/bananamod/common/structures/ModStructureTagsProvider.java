package io.github.bananamod.common.structures;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.levelgen.structure.Structure;

public class ModStructureTagsProvider extends TagsProvider<Structure>{
	@SuppressWarnings("deprecation")
	public ModStructureTagsProvider(PackOutput p_301607_, CompletableFuture<HolderLookup.Provider> p_301609_) {
	      super(p_301607_, Registries.STRUCTURE, p_301609_);
	   }

	@Override
	protected void addTags(Provider p_256380_) {
		this.tag(Structures.ON_BANANA_EXPLORER_MAPS).add(ModBuiltInStructures.BANANA_DUNGEON);
	}
}
