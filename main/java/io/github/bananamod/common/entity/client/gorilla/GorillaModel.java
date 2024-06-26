package io.github.bananamod.common.entity.client.gorilla;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import io.github.bananamod.common.entity.GorillaEntity;
import io.github.bananamod.common.entity.animation.ModAnimationDefinitions;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class GorillaModel<T extends Entity> extends HierarchicalModel<T> {
	
		private final ModelPart gorilla;
		private final ModelPart head;

		public GorillaModel(ModelPart root) {
			this.gorilla = root.getChild("gorilla");
			this.head = gorilla.getChild("body").getChild("torso").getChild("head");
		}

		@SuppressWarnings("unused")
		public static LayerDefinition createBodyLayer() {
			MeshDefinition meshdefinition = new MeshDefinition();
			PartDefinition partdefinition = meshdefinition.getRoot();

			PartDefinition gorilla = partdefinition.addOrReplaceChild("gorilla", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

			PartDefinition body = gorilla.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, 10.0F));

			PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, -10.0F));

			PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(15, 0).addBox(5.0F, -7.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(38, 31).addBox(-6.0F, -7.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, -11.0F));

			PartDefinition skull = head.addOrReplaceChild("skull", CubeListBuilder.create().texOffs(46, 0).addBox(-5.0F, -26.0F, -12.0F, 10.0F, 10.0F, 9.0F, new CubeDeformation(0.0F))
			.texOffs(38, 31).addBox(-4.0F, -27.0F, -11.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
			.texOffs(0, 31).addBox(-3.0F, -22.0F, -14.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 11.0F));

			PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -8.0F, -9.0F, 12.0F, 9.0F, 22.0F, new CubeDeformation(0.0F))
			.texOffs(0, 31).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, -1.0F, -0.2182F, 0.0F, 0.0F));

			PartDefinition front_right_leg = body.addOrReplaceChild("front_right_leg", CubeListBuilder.create(), PartPose.offset(5.5F, -10.0F, -18.5F));

			PartDefinition front_right_hand = front_right_leg.addOrReplaceChild("front_right_hand", CubeListBuilder.create().texOffs(56, 39).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.5F, -1.0F));

			PartDefinition front_right_arm = front_right_leg.addOrReplaceChild("front_right_arm", CubeListBuilder.create().texOffs(20, 50).addBox(-2.5F, 0.0F, -3.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

			PartDefinition front_left_leg = body.addOrReplaceChild("front_left_leg", CubeListBuilder.create(), PartPose.offset(-5.5F, -10.0F, -18.5F));

			PartDefinition front_left_hand = front_left_leg.addOrReplaceChild("front_left_hand", CubeListBuilder.create().texOffs(55, 58).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.5F, -1.0F));

			PartDefinition front_left_arm = front_left_leg.addOrReplaceChild("front_left_arm", CubeListBuilder.create().texOffs(40, 50).addBox(-2.5F, 0.0F, -3.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

			PartDefinition back_left_leg = gorilla.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, -13.0F, 10.5F));

			PartDefinition back_right_leg = gorilla.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(0, 50).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.5F, -13.0F, 10.5F));

			return LayerDefinition.create(meshdefinition, 128, 128);
		}

		@Override
		public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);
			
			this.animate(((GorillaEntity) entity).idleAnimationState, ModAnimationDefinitions.gorilla_idle, ageInTicks, 1f);
			this.animateWalk(ModAnimationDefinitions.gorilla_walk, limbSwing, limbSwingAmount, 2f, 2.5f);
			this.animate(((GorillaEntity) entity).attackAnimationState, ModAnimationDefinitions.gorilla_attack, ageInTicks, 1f);
			this.animate(((GorillaEntity) entity).poundAnimationState, ModAnimationDefinitions.gorilla_pound, ageInTicks, 1f);
		}

		private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
			pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
			pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

			this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
			this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
		}
		
		@Override
		public void renderToBuffer(PoseStack p_170625_, VertexConsumer p_170626_, int p_170627_, int p_170628_,
			int p_342246_) {

			gorilla.render(p_170625_, p_170626_, p_170627_, p_170628_,p_342246_);
		}

		@Override
		public ModelPart root() {
			return gorilla;
		}
}