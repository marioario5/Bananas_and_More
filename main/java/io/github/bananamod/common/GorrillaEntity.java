package io.github.bananamod.common;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class GorrillaEntity extends Monster{

	protected GorrillaEntity(EntityType<? extends Monster> entityType, Level level) {
		super(entityType, level);
	}
	
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new FloatGoal(this));
	}
	
}