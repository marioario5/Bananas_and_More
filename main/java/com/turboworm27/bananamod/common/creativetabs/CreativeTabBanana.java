package com.turboworm27.bananamod.common.creativetabs;

import com.turboworm27.bananamod.core.init.ArmorToolInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

public class CreativeTabBanana extends CreativeModeTab {
	public CreativeTabBanana(){
        super("bananas");
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public ItemStack makeIcon(){
        return new ItemStack(ArmorToolInit.BANANA_SCYTHE);
    }
}
