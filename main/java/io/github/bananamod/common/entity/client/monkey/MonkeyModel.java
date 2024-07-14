package io.github.bananamod.common.entity.client.monkey;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import io.github.bananamod.common.entity.MonkeyEntity;
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

@SuppressWarnings("unused")
public class MonkeyModel<T extends MonkeyEntity> extends HierarchicalModel<T> {
	private final ModelPart monkey;
	private final ModelPart leftleg;
	private final ModelPart leftcalf;
	private final ModelPart leftquad;
	private final ModelPart rightleg;
	private final ModelPart rightcalf;
	private final ModelPart rightquad;
	private final ModelPart body;
	private final ModelPart torso;
	private final ModelPart head;
	private final ModelPart mouth;
	private final ModelPart jaw;
	private final ModelPart nose;
	private final ModelPart tail;
	private final ModelPart chest;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftarm;
	private final ModelPart frontleftupper;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightarm;
	private final ModelPart frontarmupper;


	public MonkeyModel(ModelPart root) {
		this.monkey = root.getChild("monkey");
		this.head = monkey.getChild("body").getChild("torso").getChild("head");
		this.leftleg = monkey.getChild("leftleg");
		this.leftquad = leftleg.getChild("leftquad");
		this.leftcalf = leftleg.getChild("leftcalf");
		this.rightleg = monkey.getChild("rightleg");
		this.rightquad = rightleg.getChild("rightquad");
		this.rightcalf = rightleg.getChild("rightcalf");
		this.body = monkey.getChild("body");
		this.torso = body.getChild("torso");
		this.mouth = head.getChild("mouth");
		this.jaw = mouth.getChild("jaw");
		this.nose = mouth.getChild("nose");
		this.tail = torso.getChild("tail");
		this.chest = torso.getChild("chest");
		this.frontleftleg = body.getChild("frontleftleg");
		this.frontleftarm = frontleftleg.getChild("frontleftarm");
		this.frontleftupper = frontleftleg.getChild("frontleftupper");
		this.frontrightleg = body.getChild("frontrightleg");
		this.frontrightarm = frontrightleg.getChild("frontrightarm");
		this.frontarmupper = frontrightleg.getChild("frontarmupper");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition monkey = partdefinition.addOrReplaceChild("monkey", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition leftleg = monkey.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(30, 13).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -1.0F, 2.0F));

		PartDefinition leftcalf = leftleg.addOrReplaceChild("leftcalf", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = leftcalf.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -3.2F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition leftquad = leftleg.addOrReplaceChild("leftquad", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftquad.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 27).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition rightleg = monkey.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(30, 8).addBox(3.0F, -1.0F, -5.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightcalf = rightleg.addOrReplaceChild("rightcalf", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = rightcalf.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, -3.2F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(5.0F, -1.0F, -4.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition rightquad = rightleg.addOrReplaceChild("rightquad", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = rightquad.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 27).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(4.0F, -4.0F, -4.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition body = monkey.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(5.0F, -7.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(-5.0F, 7.0F, 0.0F));

		PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(15, 16).addBox(-3.68F, -5.2F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(2, 2).addBox(-2.68F, -6.2F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 1).addBox(-0.68F, -7.2F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7566F, -9.0199F, -1.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 21).addBox(-1.0F, -1.5F, -5.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.98F, -2.7F, 2.5F, 0.0F, 0.0F, -0.0436F));

		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(4.32F, 8.8F, 1.0F));

		PartDefinition jaw = mouth.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -1.3199F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -8.1801F, -1.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition nose = mouth.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(14, 9).addBox(-9.5F, -11.5F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(2, 2).addBox(1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(2, 2).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(2, 2).addBox(2.0F, -3.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(2, 2).addBox(3.0F, -4.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -9.0F, -1.0F));

		PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 9).addBox(-4.5474F, -3.1647F, -2.95F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.4526F, -6.8353F, -1.05F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -3.5F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(4.4526F, 1.3353F, 0.05F, 0.0F, 0.0F, 0.0873F));

		PartDefinition frontleftleg = body.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offset(-8.3169F, 0.0F, 2.5F));

		PartDefinition frontleftarm = frontleftleg.addOrReplaceChild("frontleftarm", CubeListBuilder.create().texOffs(8, 30).addBox(-1.0659F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0828F, 3.0F, 0.0F));

		PartDefinition cube_r7 = frontleftarm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 27).addBox(-1.3F, -3.0F, 6.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.2341F, 3.0F, -7.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition frontleftupper = frontleftleg.addOrReplaceChild("frontleftupper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = frontleftupper.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 21).addBox(-3.0F, -4.0F, 6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(2.3169F, 3.0F, -7.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition frontrightleg = body.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offset(-8.3169F, 0.0F, -4.5F));

		PartDefinition frontrightarm = frontrightleg.addOrReplaceChild("frontrightarm", CubeListBuilder.create().texOffs(30, 16).addBox(-1.0659F, 2.5102F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0828F, 3.4898F, 0.0F));

		PartDefinition cube_r9 = frontrightarm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(6, 25).addBox(-1.3F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.2341F, 2.5102F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition frontarmupper = frontrightleg.addOrReplaceChild("frontarmupper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = frontarmupper.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 4).addBox(-3.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(2.3169F, 3.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 64, 64);



	}
	
	public void prepareMobModel(T entity) {
		if(entity.isSitting()) {
			this.leftquad.setPos(-6, 6, 1);
			this.leftquad.zRot = (-17.5F);
			
			
		}
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);
		
		this.prepareMobModel(entity);
		
		this.animate(((MonkeyEntity) entity).idleAnimationState, ModAnimationDefinitions.monkey_idle, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.zRot = pHeadPitch * ((float)Math.PI / 180F);
	}
	
	@Override
	public void renderToBuffer(PoseStack p_170625_, VertexConsumer p_170626_, int p_170627_, int p_170628_,
			int p_342246_) {
		monkey.render(p_170625_, p_170626_, p_170627_, p_170628_,p_342246_);
	}

	@Override
	public ModelPart root() {
		return monkey;
	}
}