package com.turboworm27.graduationmod.common.tools;

import com.turboworm27.graduationmod.GraduationMod;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class Sword extends SwordItem{
	 public Sword(IItemTier material, float speed) {
	        super(material, 3, speed, new Properties().group(GraduationMod.BANANAGROUP));
	    }

	    public Sword(IItemTier material, float speed, Properties properties) {
	        super(material, 3, speed, properties);
	    }
}
