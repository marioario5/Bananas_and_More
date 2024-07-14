package io.github.bananamod.common.entity;

import java.util.EnumSet;

import javax.annotation.Nullable;

import io.github.bananamod.core.init.EntityInit;
import io.github.bananamod.core.init.ItemInit;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowParentGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class MonkeyEntity extends Animal {
	
	public final AnimationState idleAnimationState = new AnimationState();
	public int idleAnimationTimeout = 0;
	
	private static final EntityDataAccessor<Boolean> SITTING = 
			SynchedEntityData.defineId(MonkeyEntity.class, EntityDataSerializers.BOOLEAN);
	
	@SuppressWarnings("resource")
	@Override
	public void tick() {
		super.tick();
		
		if(this.level().isClientSide) {
			setupAnimationStates();
		}
	}
	
	private void setupAnimationStates() {
		if(this.idleAnimationTimeout <=0) {
			this.idleAnimationTimeout = 60;
			this.idleAnimationState.start(this.tickCount);
		} else {
			--this.idleAnimationTimeout;
		}
	}
	
    public MonkeyEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);

    }	

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));

        this.goalSelector.addGoal(1, new BreedGoal(this, 1.15D));
        this.goalSelector.addGoal(2, new PanicGoal(this, 1.2D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.2D, Ingredient.of(ItemInit.BANANA.get()), false));

        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(6, new SitGoal());
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.1D));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));

    }
    
    @Override
    protected void defineSynchedData(Builder p_333447_) {
    	super.defineSynchedData(p_333447_);
    	
    	p_333447_.define(SITTING, false);
    }
    
    public boolean isSitting() {
    	return this.entityData.get(SITTING);
    }
    
    public void setSitting(boolean sitting) {
    	this.entityData.set(SITTING, sitting);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 20D)
                .add(Attributes.FOLLOW_RANGE, 24D)
                .add(Attributes.MOVEMENT_SPEED, (double) 0.3F);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return EntityInit.MONKEY.get().create(pLevel);
    }

	@Override
	public boolean isFood(ItemStack p_27600_) {
		return p_27600_.is(ItemInit.BANANA.get());
	}

	
	class SitGoal extends Goal{

		private static final int WAIT_TIME_BEFORE_SIT = reducedTickDelay(140);
		private int countdown = MonkeyEntity.this.random.nextInt(WAIT_TIME_BEFORE_SIT);
		
		public SitGoal() {
            this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK, Goal.Flag.JUMP));
        }
		
		@Override
        public boolean canUse() {
            return MonkeyEntity.this.xxa == 0.0F && MonkeyEntity.this.yya == 0.0F && MonkeyEntity.this.zza == 0.0F ? this.canSit() || MonkeyEntity.this.isSitting() : false;
        }
		
		@Override
        public boolean canContinueToUse() {
            return this.canSit();
        }
		
		private boolean canSit() {
            if (this.countdown > 0) {
                this.countdown--;
                return false;
            } else {
                return !MonkeyEntity.this.isInPowderSnow;
            }
        }
		
		@Override
        public void stop() {
            this.countdown = MonkeyEntity.this.random.nextInt(WAIT_TIME_BEFORE_SIT);
            MonkeyEntity.this.setSitting(false);
        }
		
		@Override
		public void start() {
			MonkeyEntity.this.setSitting(true);
			MonkeyEntity.this.getNavigation().stop();
			MonkeyEntity.this.getMoveControl().setWantedPosition(MonkeyEntity.this.getX(), MonkeyEntity.this.getY(), MonkeyEntity.this.getZ(), 0.0);
		}
	}
}