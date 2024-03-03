package io.github.bananamod.common.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class GorillaEntity extends Monster{

	public GorillaEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
		super(p_33002_, p_33003_);
	}

	public static AttributeSupplier.Builder createAttribues(){
		
		return Monster.createMonsterAttributes()
			.add(Attributes.MAX_HEALTH, 20D)
			.add(Attributes.MOVEMENT_SPEED, (double)0.3F)
			.add(Attributes.ATTACK_DAMAGE, 30D)
			.add(Attributes.FOLLOW_RANGE, 35D)
			.add(Attributes.ATTACK_DAMAGE, 6.0D)
			.add(Attributes.ARMOR, 2.0D);
	}
	
	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new FloatGoal(this));
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
		this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1D));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
	}
	
	
}
