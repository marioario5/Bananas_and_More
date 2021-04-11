package com.turboworm27.graduationmod.common.tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.turboworm27.graduationmod.GraduationMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ToolType;

public class Dagger extends ToolItem{
	private static final Set<Block> EFFECTIVE_ON_ALL = Sets.newHashSet(Blocks.ACACIA_BUTTON);
	
	public boolean canHarvestBlock(BlockState blockIn) {
        int i = this.getTier().getHarvestLevel();
        if (blockIn.getHarvestTool() == net.minecraftforge.common.ToolType.HOE) {
            return i >= blockIn.getHarvestLevel();
        }
        Material material = blockIn.getMaterial();
        return material == Material.EARTH;
    }
	public Dagger(IItemTier tier, float attackSpeedIn) {
        super(1, attackSpeedIn, tier, EFFECTIVE_ON_ALL, new Properties().group(GraduationMod.BANANAGROUP).addToolType(ToolType.AXE, tier.getHarvestLevel()));
    }
}
