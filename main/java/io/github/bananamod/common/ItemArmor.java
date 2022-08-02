package io.github.bananamod.common;

import io.github.bananamod.core.init.ItemInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
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
		ItemArmor BANANA_HELMET = ItemInit.BANANA_HELMET.get();
		ItemArmor BANANA_CHESTPLATE = ItemInit.BANANA_CHESTPLATE.get();
		ItemArmor BANANA_LEGGINGS = ItemInit.BANANA_LEGGINGS.get();
		ItemArmor BANANA_BOOTS = ItemInit.BANANA_BOOTS.get();
		
		if(player.getItemBySlot(EquipmentSlot.FEET).getItem().equals(BANANA_BOOTS) && player.getItemBySlot(EquipmentSlot.LEGS).getItem().equals(BANANA_LEGGINGS) &&player.getItemBySlot(EquipmentSlot.CHEST).getItem().equals(BANANA_CHESTPLATE) && player.getItemBySlot(EquipmentSlot.HEAD).getItem().equals(BANANA_HELMET)) { 
			player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,1,2,false,false));				
		}
		
	}
}