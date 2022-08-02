package io.github.bananamod.common;

import io.github.bananamod.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CreativeTabBanana extends CreativeModeTab{

	public CreativeTabBanana() {
		super("bananas");
		
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.PERFECT_BANANA_PEEL.get());
	}
	
}
