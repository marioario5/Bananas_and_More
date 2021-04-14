package com.turboworm27.graduationmod.common.tools;

import com.turboworm27.graduationmod.GraduationMod;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class DaggerItem extends SwordItem{
	public DaggerItem(IItemTier material, float speed) {
        super(material, 1, -1.0f, new Properties().group(GraduationMod.BANANAGROUP));
    }

    public DaggerItem(IItemTier material, float speed, Properties properties) {
        super(material, 3, -1.0f, properties);
    }
}
