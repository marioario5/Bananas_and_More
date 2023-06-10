package io.github.bananamod.client.renderer;

import io.github.bananamod.BananaMod;
import io.github.bananamod.client.renderer.model.EntityBananaBossModel;
import io.github.bananamod.common.GorrillaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class EntityBananaBossRenderer<Type extends GorrillaEntity> extends MobRenderer<Type, EntityBananaBossModel<Type>>{
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(BananaMod.MODID,
			"textures/entities/example_entity.png");

	public EntityBananaBossRenderer(Context context) {
		super(context, new EntityBananaBossModel<>(context.bakeLayer(EntityBananaBossModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type p_114482_) {
		return TEXTURE;
	}

}
