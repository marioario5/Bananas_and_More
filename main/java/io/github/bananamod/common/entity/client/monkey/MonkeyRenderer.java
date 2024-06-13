package io.github.bananamod.common.entity.client.monkey;

import com.mojang.blaze3d.vertex.PoseStack;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.entity.MonkeyEntity;
import io.github.bananamod.common.entity.client.ModModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MonkeyRenderer extends MobRenderer<MonkeyEntity, MonkeyModel<MonkeyEntity>>{
	
	public MonkeyRenderer(Context context) {
		super(context, new MonkeyModel<>(context.bakeLayer(ModModelLayers.MONKEY_LAYER)), 0.65f);
	}
	
	@Override
	public void render(MonkeyEntity p_115455_, float p_115456_, float p_115457_, PoseStack p_115458_, MultiBufferSource p_115459_, int p_115460_) {	
		
		p_115458_.scale(1.6f, 1.6f, 1.6f);
		
		if(p_115455_.isBaby()) {
			p_115458_.scale(1f, 1f, 1f);
		}
		
		super.render(p_115455_, p_115456_, p_115457_, p_115458_, p_115459_, p_115460_);
	}

	@Override
	public ResourceLocation getTextureLocation(MonkeyEntity p_114482_) {
		
		return new ResourceLocation(BananaMod.MOD_ID, "textures/entity/monkey.png");
	}
	
}
