package com.turboworm27.graduationmod.common.tools;

import net.minecraft.item.IItemTier;
import net.minecraftforge.common.ToolType;

import com.turboworm27.graduationmod.GraduationMod;

import net.minecraft.item.*;

public class Pickaxe extends PickaxeItem{
	 public Pickaxe(IItemTier material, float speed) {
	        super(material, 1, speed, new Properties().group(GraduationMod.BANANAGROUP).addToolType(ToolType.PICKAXE, material.getHarvestLevel()));
	    }

	    public Pickaxe(IItemTier material, float speed, Properties properties) {
	        super(material, 1, speed, properties.addToolType(ToolType.PICKAXE, material.getHarvestLevel()));
	    }
}
