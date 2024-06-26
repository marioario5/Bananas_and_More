package io.github.bananamod.common.entity.client;

import io.github.bananamod.BananaMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {

	public static final ModelLayerLocation GORILLA_LAYER = new ModelLayerLocation(
			ResourceLocation.fromNamespaceAndPath(BananaMod.MOD_ID, "gorilla_layer"), "main");
	
	public static final ModelLayerLocation MONKEY_LAYER = new ModelLayerLocation(
			ResourceLocation.fromNamespaceAndPath(BananaMod.MOD_ID, "monkey_layer"), "main");
}
