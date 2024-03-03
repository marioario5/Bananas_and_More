package io.github.bananamod.common.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class GorillaModel<T extends Entity> extends HierarchicalModel<T> {
	
		private final ModelPart gorilla;
		//private final ModelPart head;

		public GorillaModel(ModelPart root) {
			this.gorilla = root.getChild("gorilla");
			//this.head = root.getChild("body").getChild("torso").getChild("head");
		}

		public static LayerDefinition createBodyLayer() {
			MeshDefinition meshdefinition = new MeshDefinition();
			PartDefinition partdefinition = meshdefinition.getRoot();

			PartDefinition gorilla = partdefinition.addOrReplaceChild("gorilla", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

			PartDefinition body = gorilla.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

			PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

			PartDefinition cube_r1 = torso.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 31).addBox(-5.0F, -18.0F, -8.0F, 10.0F, 1.0F, 19.0F, new CubeDeformation(0.0F))
			.texOffs(0, 0).addBox(-6.0F, -17.0F, -10.0F, 12.0F, 9.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

			PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(15, 0).addBox(5.0F, -25.0F, -10.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(0, 39).addBox(-6.0F, -25.0F, -10.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

			PartDefinition skull = head.addOrReplaceChild("skull", CubeListBuilder.create().texOffs(39, 31).addBox(-5.0F, -26.0F, -12.0F, 10.0F, 10.0F, 9.0F, new CubeDeformation(0.0F))
			.texOffs(36, 51).addBox(-4.0F, -27.0F, -11.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
			.texOffs(0, 31).addBox(-3.0F, -22.0F, -14.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

			PartDefinition front_left_leg = body.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(0, 51).addBox(3.0F, -15.0F, -11.0F, 4.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

			PartDefinition front_right_leg = body.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(18, 51).addBox(-7.0F, -15.0F, -11.0F, 4.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

			PartDefinition back_left_leg = body.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(0, 0).addBox(3.0F, -13.0F, 8.0F, 5.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

			PartDefinition back_right_leg = body.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(46, 0).addBox(-8.0F, -13.0F, 8.0F, 5.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

			return LayerDefinition.create(meshdefinition, 128, 128);
		}

		@Override
		public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

		}

		@Override
		public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
			gorilla.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		@Override
		public ModelPart root() {
			// TODO Auto-generated method stub
			return gorilla;
		}
}