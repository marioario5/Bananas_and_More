package com.turboworm27.bananamod.common.tools;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;

public class ScytheItem extends SwordItem{
	public ScytheItem(Tier material, float speed, Item.Properties properties) {
        super(material, 8, speed,properties);
    }

    public ScytheItem(Tier material, float speed, Properties properties, Item.Properties properties2) {
        super(material, 10, speed, properties);
    }
    
    @Override
    public boolean canDisableShield(ItemStack stack, ItemStack shield, LivingEntity entity, LivingEntity attacker) {
    	return super.canDisableShield(stack, shield, entity, attacker);
    }
}
