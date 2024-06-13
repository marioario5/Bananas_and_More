package io.github.bananamod.common.entity;

import io.github.bananamod.common.entity.ai.GorillaAttackGoal;
import io.github.bananamod.core.init.SoundInit;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;


public class GorillaEntity extends Monster{
	
	private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(GorillaEntity.class, EntityDataSerializers.BOOLEAN);
	
	public static final EntityDataAccessor<Boolean> POUNDING = 
			SynchedEntityData.defineId(GorillaEntity.class, EntityDataSerializers.BOOLEAN);

	public GorillaEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
		super(p_33002_, p_33003_);
	}
	
	public final AnimationState idleAnimationState = new AnimationState();
	public final AnimationState attackAnimationState = new AnimationState();
	public final AnimationState poundAnimationState = new AnimationState();
	
	private int idleAnimationTimeout = 0;
	public int attackAnimationTimeout = 0;
	public int poundAnimationTimeout = 0;
	
	@Override
	public void tick() {
		super.tick();
		
		if(this.level().isClientSide()) {
			setupAnimationStates();
		}
		
		
	}
	
	private void setupAnimationStates() {
		if(this.idleAnimationTimeout <=0) {
			this.idleAnimationTimeout = 80;
			this.idleAnimationState.start(this.tickCount);
		} else {
			--this.idleAnimationTimeout;
		}
		
		if(this.isAttacking() && attackAnimationTimeout <= 0) {
            attackAnimationTimeout = 20; // Length in ticks of your animation
            attackAnimationState.start(this.tickCount);
        } else {
            --this.attackAnimationTimeout;
        }

        if(!this.isAttacking()) {
            attackAnimationState.stop();
        }
        
        if(this.isPounding() && poundAnimationTimeout<= 0) {
        	poundAnimationTimeout = 40;
        	poundAnimationState.start(this.tickCount);
        }
        if(!this.isPounding()) {
        	poundAnimationState.stop();
        }
    }		
	
	@Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        f = Math.min(pPartialTick * 6F, 1f);

        this.walkAnimation.update(f, 0.2f);
    }

	public static AttributeSupplier.Builder createAttribues(){
		
		return Monster.createMonsterAttributes()
			.add(Attributes.MAX_HEALTH, 30D)
			.add(Attributes.MOVEMENT_SPEED, (double)0.35F)
			.add(Attributes.ATTACK_DAMAGE, 40D)
			.add(Attributes.ATTACK_SPEED, 35F)
			.add(Attributes.FOLLOW_RANGE, 35D)
			.add(Attributes.ATTACK_DAMAGE, 15.0D)
			.add(Attributes.ARMOR, 4.0D);
	}
	
	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new FloatGoal(this));
		this.goalSelector.addGoal(1, new GorillaAttackGoal(this, 1.0D, true));
		this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1D));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, Player.class, true));
		this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers());
	}
	
	public void setAttacking(boolean attacking) {
        this.entityData.set(ATTACKING, attacking);
    }
	
	public boolean isAttacking() {
        return this.entityData.get(ATTACKING);
    }
	
	public void setPounding(boolean pounding) {
        this.entityData.set(POUNDING, pounding);
    }
	
	public boolean isPounding() {
        return this.entityData.get(POUNDING);
    }
	
	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(POUNDING, false);
		this.entityData.define(ATTACKING, false);
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundInit.GORILLA_IDLE.get();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource p_33034_) {
		return SoundInit.GORILLA_HURTS.get();
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundInit.GORILLA_DIES.get();
	}
}