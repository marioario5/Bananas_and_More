package com.turboworm27.bananamod.core.event;

import com.turboworm27.bananamod.BananaMod;

import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = BananaMod.MOD_ID, bus = Bus.FORGE)
public class EventHandler {
	//Striped Wood	
	@SubscribeEvent
	public static void onPlayerInteract(BlockEvent.BlockToolInteractEvent event) {
		/*
		IWorld Iworld = event.getWorld();
		BlockPos pos = event.getPos();
		if(event.getFinalState().equals(BlockInit.WASTED_WOOD.get().getDefaultState())) {
			EventHandler.setBlocks(Iworld, pos, Iworld.getRandom()); 
			event.getWorld().playSound(event.getPlayer(), pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
		 };
		}
	private static void setBlocks(IWorld world, BlockPos pos, Random random) {
		world.setBlockState(pos.add(0,0,0), BlockInit.STRIPED_WASTED_WOOD.get().getDefaultState(), Constants.BlockFlags.BLOCK_UPDATE);
	}
	*/

	}
}

//In Progress :)