package com.turboworm27.graduationmod.common.tools;

import com.turboworm27.graduationmod.GraduationMod;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraftforge.common.ToolType;

public class Axe extends AxeItem {

    public Axe(IItemTier material, float speed) {
        super(material, 6, speed, new Properties().group(GraduationMod.BANANAGROUP).addToolType(ToolType.AXE, material.getHarvestLevel()));
    }

    public Axe(IItemTier material, float speed, Properties properties) {
        super(material, 6, speed, properties.addToolType(ToolType.AXE, material.getHarvestLevel()));
    }
}
