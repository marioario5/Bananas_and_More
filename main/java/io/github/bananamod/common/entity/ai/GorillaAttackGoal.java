package io.github.bananamod.common.entity.ai;

import io.github.bananamod.common.entity.GorillaEntity;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;

public class GorillaAttackGoal extends MeleeAttackGoal {
	private final GorillaEntity mob;
    private int attackDelay = 10;
    private int ticksUntilNextAttack = 10;
    private boolean shouldCountTillNextAttack = false;

    public GorillaAttackGoal(PathfinderMob pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
        mob = ((GorillaEntity) pMob);
    }

    @Override
    public void start() {
        super.start();
        attackDelay = 10;
        ticksUntilNextAttack = 10;
    }

    @Override
    protected void checkAndPerformAttack(LivingEntity pEnemy) {
        if (canPerformAttack(pEnemy) && !mob.isPounding()) {
        	System.out.println("attack delay =" + attackDelay);
        	System.out.println("ticks till next atack =" + ticksUntilNextAttack);
            shouldCountTillNextAttack = true;

            if(isTimeToStartAttackAnimation()) {
                mob.setAttacking(true);
            }

            if(isTimeToAttack()) {
                this.mob.getLookControl().setLookAt(pEnemy.getX(), pEnemy.getEyeY(), pEnemy.getZ());
                performAttack(pEnemy);
            }
        } else {
            resetAttackCooldown();
            shouldCountTillNextAttack = false;
            mob.setAttacking(false);
            mob.attackAnimationTimeout = 0;
        }
    }
    
    @Override
    protected boolean canPerformAttack(LivingEntity p_301160_) {
    	LivingEntity entity = mob.getTarget();
        return this.mob.isWithinMeleeAttackRange(p_301160_) && this.mob.getSensing().hasLineOfSight(p_301160_)  && entity != null && entity.isAlive();
     }
    
    @Override
    protected void resetAttackCooldown() {
        this.ticksUntilNextAttack = this.adjustedTickDelay(attackDelay * 2);
    }

    @Override
    protected boolean isTimeToAttack() {
        return this.ticksUntilNextAttack <= 0;
    }

    protected boolean isTimeToStartAttackAnimation() {
        return this.ticksUntilNextAttack <= attackDelay;
    }

    @Override
    protected int getTicksUntilNextAttack() {
        return this.ticksUntilNextAttack;
    }

    protected void performAttack(LivingEntity pEnemy) {
        this.resetAttackCooldown();
        this.mob.swing(InteractionHand.MAIN_HAND);
        this.mob.doHurtTarget(pEnemy);
    }

    protected boolean isTimeToPound() {
    	return this.mob.getSensing().hasLineOfSight(this.mob.getTarget()) && this.mob.getTarget() != null && this.mob.getTarget().isAlive() && !this.mob.isWithinMeleeAttackRange(this.mob.getTarget());
    }
    
    @Override
    public void tick() {
        super.tick();
        if(shouldCountTillNextAttack) {
            this.ticksUntilNextAttack = Math.max(this.ticksUntilNextAttack - 1, 0);
        }
        
        if(isTimeToPound()) {
        	mob.setPounding(true);
        } else {
        	mob.setPounding(false);
        }
    }

}
