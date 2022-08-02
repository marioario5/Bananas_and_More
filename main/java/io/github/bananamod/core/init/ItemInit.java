package io.github.bananamod.core.init;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.BasisArmorMaterial;
import io.github.bananamod.common.BasisToolMaterial;
import io.github.bananamod.common.ItemArmor;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BananaMod.MODID);
	
	//food items
	public static final RegistryObject<Item> PERFECT_BANANA = ITEMS.register("perfect_banana", 
			() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON)
					.food(new FoodProperties.Builder().effect(() ->new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.JUMP, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 6000, 9), 1.0F).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 6000, 2), 1.0F).effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 6000, 2), 1.0F).nutrition(10).saturationMod(2.5F).build())));
	public static final RegistryObject<Item> GREEN_BANANA = ITEMS.register("green_banana", 
			() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.UNCOMMON)
					.food(new FoodProperties.Builder().nutrition(5).saturationMod(0.9F).build())));
	
	//normal items
	public static final RegistryObject<Item> PERFECT_BANANA_PEEL = ITEMS.register("perfect_banana_peel",
			() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> GREEN_BANANA_PEEL = ITEMS.register("green_banana_peel",
			() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	public static final RegistryObject<Item> HEART_OF_BANANA = ITEMS.register("heart_of_banana", 
			() -> new Item(new Item.Properties().tab(CreativeTabInit.banana).rarity(Rarity.RARE)));
	//public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard",
		//() -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
	//public static final RegistryObject<Item> CRYSTAL_INGOT = ITEMS.register("crystal_ingot",
		//() -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
	
	//Tools/Armor
	public static final RegistryObject<SwordItem> BANANA_SWORD = ITEMS.register("banana_sword",
			() -> new SwordItem(BasisToolMaterial.BANANA, 2, (float) -1.5, 
					new Item.Properties().tab(CreativeTabInit.banana)));
	
	public static final RegistryObject<PickaxeItem> BANANA_PICKAXE = ITEMS.register("banana_pickaxe",
			() -> new PickaxeItem(BasisToolMaterial.BANANA, -2, (float) -2.4, 
					new Item.Properties().tab(CreativeTabInit.banana)));
	
	public static final RegistryObject<AxeItem> BANANA_AXE = ITEMS.register("banana_axe",
			() -> new AxeItem(BasisToolMaterial.BANANA, 4, (float) -2.9, 
					new Item.Properties().tab(CreativeTabInit.banana)));
	
	public static final RegistryObject<ShovelItem> BANANA_SHOVEL = ITEMS.register("banana_shovel", 
			() -> new ShovelItem(BasisToolMaterial.BANANA, -2, (float) -2.5,
					new Item.Properties().tab(CreativeTabInit.banana)));
	
	public static final RegistryObject<HoeItem> BANANA_HOE = ITEMS.register("banana_hoe", 
			() -> new HoeItem(BasisToolMaterial.BANANA, -3, -2,
					new Item.Properties().tab(CreativeTabInit.banana)));
	
	
	public static final RegistryObject<ItemArmor> BANANA_CHESTPLATE = ITEMS.register("banana_chestplate",
			() -> new ItemArmor(BasisArmorMaterial.banana, EquipmentSlot.CHEST, 
					new Item.Properties().tab(CreativeTabInit.banana).fireResistant())); 
	
	public static final RegistryObject<ItemArmor> BANANA_HELMET = ITEMS.register("banana_helmet",
	() -> new ItemArmor(BasisArmorMaterial.banana, EquipmentSlot.HEAD, 
			new Item.Properties().tab(CreativeTabInit.banana).fireResistant()));
	
	public static final RegistryObject<ItemArmor> BANANA_LEGGINGS = ITEMS.register("banana_leggings",
			() -> new ItemArmor(BasisArmorMaterial.banana, EquipmentSlot.LEGS, 
					new Item.Properties().tab(CreativeTabInit.banana).fireResistant()));
	
	public static final RegistryObject<ItemArmor> BANANA_BOOTS = ITEMS.register("banana_boots",
			() -> new ItemArmor(BasisArmorMaterial.banana, EquipmentSlot.FEET, 
					new Item.Properties().tab(CreativeTabInit.banana).fireResistant()));
}