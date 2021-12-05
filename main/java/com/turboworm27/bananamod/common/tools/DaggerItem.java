package com.turboworm27.bananamod.common.tools;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;

public class DaggerItem extends SwordItem{
	public DaggerItem(Tier material, float speed) {
        super(material, 1, -1.0f, new Properties());
    }

    public DaggerItem(Tier material, float speed, Properties properties) {
        super(material, 3, -1.0f, properties);
    }
}
