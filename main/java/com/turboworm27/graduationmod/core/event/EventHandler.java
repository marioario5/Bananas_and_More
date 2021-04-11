package com.turboworm27.graduationmod.core.event;

import java.util.Random;

import com.turboworm27.graduationmod.GraduationMod;
import com.turboworm27.graduationmod.core.init.BlockInit;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = GraduationMod.MOD_ID, bus = Bus.FORGE)
public class EventHandler {
	//Striped Wood	
	@SubscribeEvent
	public static void onPlayerInteract(BlockEvent.BlockToolInteractEvent event) {
		IWorld world = event.getWorld();
		BlockPos pos = event.getPos();
		if(event.getFinalState().equals(BlockInit.WASTED_WOOD.get().getDefaultState())) {
			EventHandler.setBlocks(world, pos, world.getRandom());
			//event.getWorld().playSound(event.getPlayer(), pos, Sound[].class, item, volume, pitch);
		}
    }
	private static void setBlocks(IWorld world, BlockPos pos, Random random) {
		world.setBlockState(pos.add(0,0,0), BlockInit.STRIPED_WASTED_WOOD.get().getDefaultState(), Constants.BlockFlags.BLOCK_UPDATE);
	}
}
