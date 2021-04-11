package com.turboworm27.graduationmod.core.init;

import com.turboworm27.graduationmod.GraduationMod;

import com.turboworm27.graduationmod.common.armor.BasisArmorMaterial;
import com.turboworm27.graduationmod.common.armor.ItemArmor;
import com.turboworm27.graduationmod.common.tools.Axe;
import com.turboworm27.graduationmod.common.tools.BasisToolMaterial;
//import com.turboworm27.graduationmod.common.tools.Dagger;
import com.turboworm27.graduationmod.common.tools.Hoe;
import com.turboworm27.graduationmod.common.tools.Pickaxe;
import com.turboworm27.graduationmod.common.tools.Scythe;
import com.turboworm27.graduationmod.common.tools.Shovel;
import com.turboworm27.graduationmod.common.tools.Sword;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = GraduationMod.MOD_ID, bus = Bus.MOD)
public class ArmorToolInit {
	//weapons
	public static final Sword BANANA_SWORD = new Sword(BasisToolMaterial.banana, -1.5f);
	public static final Pickaxe BANANA_PICKAXE = new Pickaxe(BasisToolMaterial.banana, -2.4F);
	public static final Axe BANANA_AXE = new Axe(BasisToolMaterial.banana, -2.4F);
	public static final Shovel BANANA_SHOVEL = new Shovel(BasisToolMaterial.banana, -2.4f);
	public static final Hoe BANANA_HOE = new Hoe(BasisToolMaterial.banana, -3, -1f);
	
	public static final Sword CRISTAL_SWORD = new Sword(BasisToolMaterial.cristal, -1.5f);
	public static final Pickaxe CRISTAL_PICKAXE = new Pickaxe(BasisToolMaterial.cristal, -2.4F);
	public static final Axe CRISTAL_AXE = new Axe(BasisToolMaterial.cristal, -2.4F);
	public static final Shovel CRISTAL_SHOVEL = new Shovel(BasisToolMaterial.cristal, -2.4f);
	public static final Hoe CRISTAL_HOE = new Hoe(BasisToolMaterial.cristal, -3, -1f);
	
	/*
	public static final Dagger BANANA_DAGGER = new Dagger(BasisToolMaterial.banana, -1.0f);
	public static final Dagger CRISTAL_DAGGER = new Dagger(BasisToolMaterial.cristal, -1.7f);
	*/
	public static final Scythe BANANA_SCYTHE = new Scythe(BasisToolMaterial.banana, 7, -3F, new Item.Properties().isImmuneToFire().maxStackSize(1).addToolType(ToolType.AXE, BasisToolMaterial.banana.getHarvestLevel()));
	//public static final Scythe CRISTAL_SCYTHE = new Scythe(BasisToolMaterial.cristal, 0, 0, null);
	
	
	//armor
	public static final ItemArmor BANANA_HELMET = new ItemArmor(BasisArmorMaterial.banana, EquipmentSlotType.HEAD, new Item.Properties().group(GraduationMod.BANANAGROUP));
	public static final ItemArmor BANANA_CHESTPLATE = new ItemArmor(BasisArmorMaterial.banana, EquipmentSlotType.CHEST, new Item.Properties().group(GraduationMod.BANANAGROUP));
	public static final ItemArmor BANANA_LEGGINGS = new ItemArmor(BasisArmorMaterial.banana, EquipmentSlotType.LEGS, new Item.Properties().group(GraduationMod.BANANAGROUP));
	public static final ItemArmor BANANA_BOOTS = new ItemArmor(BasisArmorMaterial.banana, EquipmentSlotType.FEET, new Item.Properties().group(GraduationMod.BANANAGROUP));
	
	@SubscribeEvent
	public static void register(Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		
	    BANANA_SWORD.setRegistryName(GraduationMod.MOD_ID, "banana_sword");
		BANANA_PICKAXE.setRegistryName(GraduationMod.MOD_ID, "banana_pickaxe"); 
		BANANA_AXE.setRegistryName(GraduationMod.MOD_ID, "banana_axe");
		BANANA_SHOVEL.setRegistryName(GraduationMod.MOD_ID, "banana_shovel");
		BANANA_HOE.setRegistryName(GraduationMod.MOD_ID, "banana_hoe");
		
		registry.registerAll(BANANA_SWORD, BANANA_PICKAXE, BANANA_AXE, BANANA_SHOVEL,BANANA_HOE);
		
		CRISTAL_SWORD.setRegistryName(GraduationMod.MOD_ID, "cristal_sword");
		CRISTAL_PICKAXE.setRegistryName(GraduationMod.MOD_ID, "cristal_pickaxe");
		CRISTAL_AXE.setRegistryName(GraduationMod.MOD_ID, "cristal_axe");
		CRISTAL_SHOVEL.setRegistryName(GraduationMod.MOD_ID, "cristal_shovel");
		CRISTAL_HOE.setRegistryName(GraduationMod.MOD_ID, "cristal_hoe");
		
		registry.registerAll(CRISTAL_SWORD, CRISTAL_PICKAXE, CRISTAL_AXE, CRISTAL_SHOVEL,CRISTAL_HOE);
		
		//BANANA_DAGGER.setRegistryName(GraduationMod.MOD_ID, "banana_dagger");
		BANANA_SCYTHE.setRegistryName(GraduationMod.MOD_ID, "banana_scythe");
		
		registry.register(/*BANANA_DAGGER,*/ BANANA_SCYTHE);
		
		//CRISTAL_DAGGER.setRegistryName(GraduationMod.MOD_ID, "cristal_dagger");
		//CRISTAL_SCYTHE.setRegistryName(GraduationMod.MOD_ID, "cristal_scythe");
		
		//registry.registerAll(CRISTAL_DAGGER, CRISTAL_SCYTHE);
		
		//armor
		BANANA_HELMET.setRegistryName(GraduationMod.MOD_ID, "banana_helmet");
		BANANA_CHESTPLATE.setRegistryName(GraduationMod.MOD_ID, "banana_chestplate");
		BANANA_LEGGINGS.setRegistryName(GraduationMod.MOD_ID, "banana_leggings");
		BANANA_BOOTS.setRegistryName(GraduationMod.MOD_ID, "banana_boots");
		
		registry.registerAll(BANANA_HELMET, BANANA_CHESTPLATE, BANANA_LEGGINGS, BANANA_BOOTS);
	}
	
}
