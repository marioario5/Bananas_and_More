package io.github.bananamod.common;

import io.github.bananamod.core.init.ItemInit;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemArmor extends ArmorItem{ 
	public ItemArmor(Holder<ArmorMaterial> materialIn, Type slots, Item.Properties properties) {
        super(materialIn, slots, properties);
    }
	
	@Override
	public void onUseTick(Level p_41428_, LivingEntity p_41429_, ItemStack p_41430_, int p_41431_) {

		ItemArmor BANANA_HELMET = ItemInit.BANANA_HELMET.get();
		ItemArmor BANANA_CHESTPLATE = ItemInit.BANANA_CHESTPLATE.get();
		ItemArmor BANANA_LEGGINGS = ItemInit.BANANA_LEGGINGS.get();
		ItemArmor BANANA_BOOTS = ItemInit.BANANA_BOOTS.get();
		
		if(p_41429_.getItemBySlot(EquipmentSlot.FEET).getItem().equals(BANANA_BOOTS) && p_41429_.getItemBySlot(EquipmentSlot.LEGS).getItem().equals(BANANA_LEGGINGS) &&p_41429_.getItemBySlot(EquipmentSlot.CHEST).getItem().equals(BANANA_CHESTPLATE) && p_41429_.getItemBySlot(EquipmentSlot.HEAD).getItem().equals(BANANA_HELMET)) { 
			p_41429_.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,1,2,false,false));				
		}
	}
}