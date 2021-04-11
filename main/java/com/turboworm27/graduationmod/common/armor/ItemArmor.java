package com.turboworm27.graduationmod.common.armor;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

import com.turboworm27.graduationmod.core.init.ArmorToolInit;

public class ItemArmor extends ArmorItem{ 
	public ItemArmor(IArmorMaterial materialIn, EquipmentSlotType slots, Properties properties) {
        super(materialIn, slots, properties);
    }
	
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		ItemArmor BANANA_HELMET = ArmorToolInit.BANANA_HELMET;
		ItemArmor BANANA_CHESTPLATE = ArmorToolInit.BANANA_CHESTPLATE;
		ItemArmor BANANA_LEGGINGS = ArmorToolInit.BANANA_LEGGINGS;
		ItemArmor BANANA_BOOTS = ArmorToolInit.BANANA_BOOTS;
		
		if(player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem().equals(BANANA_BOOTS) && player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem().equals(BANANA_LEGGINGS) &&player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem().equals(BANANA_CHESTPLATE) && player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem().equals(BANANA_HELMET)) 
			player.addPotionEffect(new EffectInstance(Effect.get(11), 10, 0));				
	}
	
}

