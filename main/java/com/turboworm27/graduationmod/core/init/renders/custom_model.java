package com.turboworm27.graduationmod.core.init.renders;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer monkey;

	public custom_model() {
		textureWidth = 16;
		textureHeight = 16;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		

		monkey = new ModelRenderer(this);
		monkey.setRotationPoint(0.0F, 0.0F, 0.0F);
		rotation.addChild(monkey);
		monkey.setTextureOffset(0, 9).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		monkey.setTextureOffset(8, 0).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		monkey.setTextureOffset(0, 4).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		monkey.setTextureOffset(6, 7).addBox(-1.0F, -5.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		monkey.setTextureOffset(6, 4).addBox(-1.0F, -5.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		monkey.setTextureOffset(0, 0).addBox(-2.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		monkey.setTextureOffset(9, 6).addBox(-1.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		monkey.setTextureOffset(9, 3).addBox(-1.0F, -7.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}