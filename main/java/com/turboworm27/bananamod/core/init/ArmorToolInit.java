package com.turboworm27.bananamod.core.init;

import com.turboworm27.bananamod.BananaMod;
import com.turboworm27.bananamod.common.armor.BasisArmorMaterial;
import com.turboworm27.bananamod.common.armor.ItemArmor;
import com.turboworm27.bananamod.common.tools.Axe;
import com.turboworm27.bananamod.common.tools.BasisToolMaterial;
import com.turboworm27.bananamod.common.tools.DaggerItem;
import com.turboworm27.bananamod.common.tools.Hoe;
import com.turboworm27.bananamod.common.tools.Pickaxe;
import com.turboworm27.bananamod.common.tools.ScytheItem;
import com.turboworm27.bananamod.common.tools.Shovel;
import com.turboworm27.bananamod.common.tools.Sword;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = BananaMod.MOD_ID, bus = Bus.MOD)
public class ArmorToolInit {
	//weapons
	public static final Sword BANANA_SWORD = new Sword(BasisToolMaterial.banana, -1.5f, new Item.Properties().tab(CreativeTabInit.banana).fireResistant().rarity(Rarity.EPIC));
	public static final Pickaxe BANANA_PICKAXE = new Pickaxe(BasisToolMaterial.banana, -2.4F, new Item.Properties().tab(CreativeTabInit.banana).fireResistant().rarity(Rarity.EPIC));
	public static final Axe BANANA_AXE = new Axe(BasisToolMaterial.banana, -2.4F, new Item.Properties().tab(CreativeTabInit.banana).fireResistant().rarity(Rarity.EPIC));
	public static final Shovel BANANA_SHOVEL = new Shovel(BasisToolMaterial.banana, -2.4f, new Item.Properties().tab(CreativeTabInit.banana).fireResistant().rarity(Rarity.EPIC));
	public static final Hoe BANANA_HOE = new Hoe(BasisToolMaterial.banana, -3, -1f, new Item.Properties().tab(CreativeTabInit.banana).fireResistant().rarity(Rarity.EPIC));
	
	public static final Sword CRISTAL_SWORD = new Sword(BasisToolMaterial.crystal, -1.5f, new Item.Properties().tab(CreativeTabInit.crystal).fireResistant().rarity(Rarity.EPIC));
	public static final Pickaxe CRISTAL_PICKAXE = new Pickaxe(BasisToolMaterial.crystal, -2.4F, new Item.Properties().tab(CreativeTabInit.crystal).fireResistant().rarity(Rarity.EPIC));
	public static final Axe CRISTAL_AXE = new Axe(BasisToolMaterial.crystal, -2.4F, new Item.Properties().tab(CreativeTabInit.crystal).fireResistant().rarity(Rarity.EPIC));
	public static final Shovel CRISTAL_SHOVEL = new Shovel(BasisToolMaterial.crystal, -2.4f, new Item.Properties().tab(CreativeTabInit.crystal).fireResistant().rarity(Rarity.EPIC));
	public static final Hoe CRISTAL_HOE = new Hoe(BasisToolMaterial.crystal, -3, -1f, new Item.Properties().tab(CreativeTabInit.crystal).fireResistant().rarity(Rarity.EPIC));
	
	public static final DaggerItem BANANA_DAGGER = new DaggerItem(BasisToolMaterial.banana, -1.0f, new Item.Properties().tab(CreativeTabInit.banana).fireResistant().rarity(Rarity.EPIC));
	public static final DaggerItem CRISTAL_DAGGER = new DaggerItem(BasisToolMaterial.crystal, -1.7f, new Item.Properties().tab(CreativeTabInit.crystal).fireResistant().rarity(Rarity.EPIC));
	
	public static final ScytheItem BANANA_SCYTHE = new ScytheItem(BasisToolMaterial.banana, -3.2F, new Item.Properties().tab(CreativeTabInit.banana).fireResistant().rarity(Rarity.EPIC));
	public static final ScytheItem CRYSTAL_SCYTHE = new ScytheItem(BasisToolMaterial.crystal, -3.2F, new Item.Properties().tab(CreativeTabInit.crystal).fireResistant().rarity(Rarity.EPIC));
	
	//armor
	public static final ItemArmor BANANA_HELMET = new ItemArmor(BasisArmorMaterial.banana, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeTabInit.banana).fireResistant().rarity(Rarity.EPIC));
	public static final ItemArmor BANANA_CHESTPLATE = new ItemArmor(BasisArmorMaterial.banana, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeTabInit.banana).fireResistant().rarity(Rarity.EPIC));
	public static final ItemArmor BANANA_LEGGINGS = new ItemArmor(BasisArmorMaterial.banana, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeTabInit.banana).fireResistant().rarity(Rarity.EPIC));
	public static final ItemArmor BANANA_BOOTS = new ItemArmor(BasisArmorMaterial.banana, EquipmentSlot.FEET, new Item.Properties().tab(CreativeTabInit.banana).fireResistant().rarity(Rarity.EPIC));
	
	public static final ItemArmor CRYSTAL_HELMET = new ItemArmor(BasisArmorMaterial.crystal, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeTabInit.crystal).fireResistant().rarity(Rarity.EPIC));
	public static final ItemArmor CRYSTAL_CHESTPLATE = new ItemArmor(BasisArmorMaterial.crystal, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeTabInit.crystal).fireResistant().rarity(Rarity.EPIC));
	public static final ItemArmor CRYSTAL_LEGGINGS = new ItemArmor(BasisArmorMaterial.crystal, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeTabInit.crystal).fireResistant().rarity(Rarity.EPIC));
	public static final ItemArmor CRYSTAL_BOOTS = new ItemArmor(BasisArmorMaterial.crystal, EquipmentSlot.FEET, new Item.Properties().tab(CreativeTabInit.crystal).fireResistant().rarity(Rarity.EPIC));
	
	@SubscribeEvent
	public static void register(Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		
	    BANANA_SWORD.setRegistryName(BananaMod.MOD_ID, "banana_sword");
		BANANA_PICKAXE.setRegistryName(BananaMod.MOD_ID, "banana_pickaxe"); 
		BANANA_AXE.setRegistryName(BananaMod.MOD_ID, "banana_axe");
		BANANA_SHOVEL.setRegistryName(BananaMod.MOD_ID, "banana_shovel");
		BANANA_HOE.setRegistryName(BananaMod.MOD_ID, "banana_hoe");
		
		registry.registerAll(BANANA_SWORD, BANANA_PICKAXE, BANANA_AXE, BANANA_SHOVEL,BANANA_HOE);

		//CRISTAL_SWORD.setRegistryName(BananaMod.MOD_ID, "cristal_sword");
		//CRISTAL_PICKAXE.setRegistryName(BananaMod.MOD_ID, "cristal_pickaxe");
		//CRISTAL_AXE.setRegistryName(BananaMod.MOD_ID, "cristal_axe");
		//CRISTAL_SHOVEL.setRegistryName(BananaMod.MOD_ID, "cristal_shovel");
		//CRISTAL_HOE.setRegistryName(BananaMod.MOD_ID, "cristal_hoe");
		
		//registry.registerAll(CRISTAL_SWORD, CRISTAL_PICKAXE, CRISTAL_AXE, CRISTAL_SHOVEL,CRISTAL_HOE);
		
		BANANA_DAGGER.setRegistryName(BananaMod.MOD_ID, "banana_dagger");
		//CRISTAL_DAGGER.setRegistryName(GraduationMod.MOD_ID, "cristal_dagger");
		
		registry.register(BANANA_DAGGER);
		
		BANANA_SCYTHE.setRegistryName(BananaMod.MOD_ID, "banana_scythe");
		CRYSTAL_SCYTHE.setRegistryName(BananaMod.MOD_ID, "crystal_scythe");
		
		registry.registerAll(BANANA_SCYTHE, CRYSTAL_SCYTHE);
		
		//armor
		BANANA_HELMET.setRegistryName(BananaMod.MOD_ID, "banana_helmet");
		BANANA_CHESTPLATE.setRegistryName(BananaMod.MOD_ID, "banana_chestplate");
		BANANA_LEGGINGS.setRegistryName(BananaMod.MOD_ID, "banana_leggings");
		BANANA_BOOTS.setRegistryName(BananaMod.MOD_ID, "banana_boots");
				
		registry.registerAll(BANANA_HELMET, BANANA_CHESTPLATE, BANANA_LEGGINGS, BANANA_BOOTS);
		
		CRYSTAL_HELMET.setRegistryName(BananaMod.MOD_ID, "crystal_helmet");
		CRYSTAL_CHESTPLATE.setRegistryName(BananaMod.MOD_ID, "crystal_chestplate");
		CRYSTAL_LEGGINGS.setRegistryName(BananaMod.MOD_ID,"crystal_leggings");
		CRYSTAL_BOOTS.setRegistryName(BananaMod.MOD_ID, "crystal_boots");
		
		
		registry.registerAll(CRYSTAL_HELMET, CRYSTAL_CHESTPLATE, CRYSTAL_LEGGINGS, CRYSTAL_BOOTS);
	}
	
}
