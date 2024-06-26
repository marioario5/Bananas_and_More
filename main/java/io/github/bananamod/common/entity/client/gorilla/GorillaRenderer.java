package io.github.bananamod.common.entity.client.gorilla;

import com.mojang.blaze3d.vertex.PoseStack;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.entity.GorillaEntity;
import io.github.bananamod.common.entity.client.ModModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GorillaRenderer extends MobRenderer<GorillaEntity, GorillaModel<GorillaEntity>>{
	
	public GorillaRenderer(Context context) {
		super(context, new GorillaModel<>(context.bakeLayer(ModModelLayers.GORILLA_LAYER)), 0.95f);
	}

	@Override
	public ResourceLocation getTextureLocation(GorillaEntity p_114482_) {
		return ResourceLocation.fromNamespaceAndPath(BananaMod.MOD_ID, "textures/entity/gorilla.png");
	}
	
	@Override
	public void render(GorillaEntity p_115455_, float p_115456_, float p_115457_, PoseStack p_115458_, MultiBufferSource p_115459_, int p_115460_) {
		p_115458_.scale(1.25F, 1.25F, 1.25F);
		
		super.render(p_115455_, p_115456_, p_115457_, p_115458_, p_115459_, p_115460_);
	}

}
