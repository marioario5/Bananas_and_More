package com.turboworm27.graduationmod.common.tools;

import com.turboworm27.graduationmod.GraduationMod;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ShovelItem;
import net.minecraftforge.common.ToolType;

public class Shovel extends ShovelItem {

    public Shovel(IItemTier material, float speed) {
        super(material, 1.5F, speed, new Properties().group(GraduationMod.BANANAGROUP).addToolType(ToolType.SHOVEL, material.getHarvestLevel()));
    }

    public Shovel(IItemTier material, float speed, Properties properties) {
        super(material, 1.5F, speed, properties.addToolType(ToolType.SHOVEL, material.getHarvestLevel()));
    }
}
