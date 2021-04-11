package com.turboworm27.graduationmod.common.tools;

import com.turboworm27.graduationmod.GraduationMod;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class Hoe extends HoeItem {

    public Hoe(IItemTier material, int p_i231595_2_, float speed) {
        super(material, p_i231595_2_, speed, new Properties().group(GraduationMod.BANANAGROUP));
    }

    public Hoe(IItemTier material, int p_i231595_2_, float speed, Properties properties) {
        super(material, p_i231595_2_, speed, properties);
    }


}
