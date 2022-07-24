package io.github.bananamod.core.init;

import io.github.bananamod.BananaMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BananaMod.MODID);
	
	//food items
	public static final RegistryObject<Item> PERFECT_BANANA = ITEMS.register("perfect_banana", () -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON).food(new FoodProperties.Builder().effect(() ->new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.JUMP, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 6000, 9), 1.0F).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 6000, 2), 1.0F).nutrition(10).saturationMod(2.5F).build())));
	public static final RegistryObject<Item> GREEN_BANANA = ITEMS.register("green_banana", () -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.9F).build())));
	
	//normal items
	public static final RegistryObject<Item> PERFECT_BANANA_PEEL = ITEMS.register("perfect_banana_peel", () -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GREEN_BANANA_PEEL = ITEMS.register("green_banana_peel",() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> HEART_OF_BANANA = ITEMS.register("heart_of_banana", () -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	//public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
	//public static final RegistryObject<Item> CRYSTAL_INGOT = ITEMS.register("crystal_ingot",() -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
}