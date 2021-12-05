package com.turboworm27.bananamod.common.armor;

import com.turboworm27.bananamod.core.init.ArmorToolInit;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemArmor extends ArmorItem{ 
	public ItemArmor(ArmorMaterial materialIn, EquipmentSlot slots, Item.Properties properties) {
        super(materialIn, slots, properties);
    }
	
	@Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
		ItemArmor BANANA_HELMET = ArmorToolInit.BANANA_HELMET;
		ItemArmor BANANA_CHESTPLATE = ArmorToolInit.BANANA_CHESTPLATE;
		ItemArmor BANANA_LEGGINGS = ArmorToolInit.BANANA_LEGGINGS;
		ItemArmor BANANA_BOOTS = ArmorToolInit.BANANA_BOOTS;
		
		ItemArmor CRYSTAL_HELMET = ArmorToolInit.CRYSTAL_HELMET;
		ItemArmor CRYSTAL_CHESTPLATE = ArmorToolInit.CRYSTAL_CHESTPLATE;
		ItemArmor CRYSTAL_LEGGINGS = ArmorToolInit.CRYSTAL_LEGGINGS;
		ItemArmor CRYSTAL_BOOTS = ArmorToolInit.CRYSTAL_BOOTS;
		
		if(player.getItemBySlot(EquipmentSlot.FEET).getItem().equals(BANANA_BOOTS) && player.getItemBySlot(EquipmentSlot.LEGS).getItem().equals(BANANA_LEGGINGS) &&player.getItemBySlot(EquipmentSlot.CHEST).getItem().equals(BANANA_CHESTPLATE) && player.getItemBySlot(EquipmentSlot.HEAD).getItem().equals(BANANA_HELMET)) { 
			player.addEffect(new MobEffectInstance(MobEffect.byId(11), 10, 0));				
		}
		
		if(player.getItemBySlot(EquipmentSlot.FEET).getItem().equals(CRYSTAL_BOOTS) && player.getItemBySlot(EquipmentSlot.LEGS).getItem().equals(CRYSTAL_LEGGINGS) &&player.getItemBySlot(EquipmentSlot.CHEST).getItem().equals(CRYSTAL_CHESTPLATE) && player.getItemBySlot(EquipmentSlot.HEAD).getItem().equals(CRYSTAL_HELMET)) 
			player.addEffect(new MobEffectInstance(MobEffect.byId(5), 10, 0));				
		}
}

