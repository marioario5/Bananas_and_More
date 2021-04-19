package com.turboworm27.graduationmod.common.tools;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class ScytheItem extends SwordItem{
	public ScytheItem(IItemTier material, float speed, Item.Properties properties) {
        super(material, 8, speed,properties);
    }

    public ScytheItem(IItemTier material, float speed, Properties properties, Item.Properties properties2) {
        super(material, 10, speed, properties);
    }
    @Override
    public boolean canDisableShield(ItemStack stack, ItemStack shield, LivingEntity entity, LivingEntity attacker) {
    	return super.canDisableShield(stack, shield, entity, attacker);
    }
}
