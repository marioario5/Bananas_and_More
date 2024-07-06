package io.github.bananamod.core.init;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.BasisArmorMaterial;
import io.github.bananamod.common.BasisToolMaterial;
import io.github.bananamod.common.ItemArmor;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem.Type;
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
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BananaMod.MOD_ID);

	//food items
	public static final RegistryObject<Item> PERFECT_BANANA = ITEMS.register("perfect_banana", 
			() -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)
					.food(new FoodProperties.Builder().effect(null, 0).build())));

	public static final RegistryObject<Item> BANANA = ITEMS.register("banana", 
			() -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).food(new FoodProperties.Builder()
			.nutrition(3).saturationModifier(7F).build())));
	
	//normal items
	public static final RegistryObject<Item> PERFECT_BANANA_PEEL = ITEMS.register("perfect_banana_peel",
			() -> new Item(new Item.Properties().rarity(Rarity.RARE)));
	
	public static final RegistryObject<Item> HEART_OF_BANANA = ITEMS.register("heart_of_banana", 
			() -> new Item(new Item.Properties().rarity(Rarity.RARE)));

	//Tools/Armor
	public static final RegistryObject<SwordItem> BANANA_SWORD = ITEMS.register("banana_sword",
			() -> new SwordItem(BasisToolMaterial.banana, new Item.Properties().attributes(
					SwordItem.createAttributes(BasisToolMaterial.banana, 4, -1.5f))));

	public static final RegistryObject<PickaxeItem> BANANA_PICKAXE = ITEMS.register("banana_pickaxe",
			() -> new PickaxeItem(BasisToolMaterial.banana, new Item.Properties().attributes(
					PickaxeItem.createAttributes(BasisToolMaterial.banana, 2, -2.4f))));

	public static final RegistryObject<AxeItem> BANANA_AXE = ITEMS.register("banana_axe",
			() -> new AxeItem(BasisToolMaterial.banana, new Item.Properties().attributes(
					AxeItem.createAttributes(BasisToolMaterial.banana, 4.5f, -2.4f))));
	
	public static final RegistryObject<ShovelItem> BANANA_SHOVEL = ITEMS.register("banana_shovel", 
			() -> new ShovelItem(BasisToolMaterial.banana, new Item.Properties().attributes(
					ShovelItem.createAttributes(BasisToolMaterial.banana, 1.5f, -2.4f))));

	public static final RegistryObject<HoeItem> BANANA_HOE = ITEMS.register("banana_hoe", 
			() -> new HoeItem(BasisToolMaterial.banana, new Item.Properties().attributes(
					HoeItem.createAttributes(BasisToolMaterial.banana, 0, -1f))));
	
	
	public static final RegistryObject<ItemArmor> BANANA_CHESTPLATE = ITEMS.register("banana_chestplate",
			() -> new ItemArmor(BasisArmorMaterial.banana, Type.CHESTPLATE, 
					new Item.Properties().fireResistant())); 

	public static final RegistryObject<ItemArmor> BANANA_HELMET = ITEMS.register("banana_helmet",
	() -> new ItemArmor(BasisArmorMaterial.banana, Type.HELMET, 
			new Item.Properties().fireResistant()));

	public static final RegistryObject<ItemArmor> BANANA_LEGGINGS = ITEMS.register("banana_leggings",
			() -> new ItemArmor(BasisArmorMaterial.banana, Type.LEGGINGS, 
					new Item.Properties().fireResistant()));

	public static final RegistryObject<ItemArmor> BANANA_BOOTS = ITEMS.register("banana_boots",
			() -> new ItemArmor(BasisArmorMaterial.banana, Type.BOOTS, 
					new Item.Properties().fireResistant()));
}