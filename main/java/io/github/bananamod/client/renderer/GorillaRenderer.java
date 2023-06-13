package io.github.bananamod.client.renderer;

import io.github.bananamod.BananaMod;
import io.github.bananamod.client.renderer.model.GorillaModel;
import io.github.bananamod.common.GorillaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GorillaRenderer<Type extends GorillaEntity> extends MobRenderer<Type, GorillaModel<Type>>{
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(BananaMod.MODID,
			"textures/entities/example_entity.png");

	public GorillaRenderer(Context context) {
		super(context, new GorillaModel<>(context.bakeLayer(GorillaModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type p_114482_) {
		return TEXTURE;
	}

}
