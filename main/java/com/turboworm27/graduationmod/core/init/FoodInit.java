package com.turboworm27.graduationmod.core.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {
	public static final Food PERFECT_BANANA = new Food.Builder().effect(() -> new EffectInstance(Effects.STRENGTH, 6000, 2), 1.0f).effect(() -> new EffectInstance(Effects.REGENERATION, 6000, 2), 1.0f).effect(() -> new EffectInstance(Effects.RESISTANCE, 6000, 2), 1.0f).effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 1), 1.0f).effect(() -> new EffectInstance(Effects.SPEED, 6000, 2), 1.0f).effect(() -> new EffectInstance(Effects.JUMP_BOOST, 6000, 2), 1.0f).effect(() -> new EffectInstance(Effects.DOLPHINS_GRACE, 6000, 2), 1.0f).effect(() -> new EffectInstance(Effects.HASTE, 6000, 2), 1.0f).effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 6000, 2), 1.0f).effect(() -> new EffectInstance(Effects.INVISIBILITY, 6000, 2), 1.0f).effect(() -> new EffectInstance(Effects.NIGHT_VISION, 6000, 2), 1.0f).hunger(8).saturation(1.5f).build();
	public static final Food GREEN_BANANA = new Food.Builder().hunger(5).saturation(0.9f).build();
	public static final Food YELLOW_BANANA = new Food.Builder().effect(() -> new EffectInstance(Effects.JUMP_BOOST, 3600, 1), 1.0f).effect(() -> new EffectInstance(Effects.REGENERATION, 3600, 1), 1.0f).effect(() -> new EffectInstance(Effects.SPEED, 3600, 1), 1.0f).hunger(7).saturation(1.2f).build();
	public static final Food ROTTEN_BANANA = new Food.Builder().effect(() -> new EffectInstance(Effects.POISON, 400, 1), 1.0f).effect(() -> new EffectInstance(Effects.NAUSEA, 400, 1), 1.0f).hunger(5).saturation(0.9f).build();
	public static final Food GREEN_BROWN_BANANA = new Food.Builder().effect(() -> new EffectInstance(Effects.INSTANT_DAMAGE, 400, 20), 1.0f).hunger(5).saturation(0.9f).build();
}
