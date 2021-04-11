package com.turboworm27.graduationmod.core.event;

import java.util.ArrayList;
import java.util.Random;

import com.turboworm27.graduationmod.core.init.ArmorToolInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.IntNBT;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ToolEventHandler {
	@SubscribeEvent
	public static void SuperAxeDestroyedBlock(BlockEvent.BreakEvent event){
        World world = (World)event.getWorld();
        PlayerEntity player = event.getPlayer();
        BlockPos pos = event.getPos();
        ItemStack stack = player.getHeldItem(Hand.MAIN_HAND);
        BlockState state = world.getBlockState(pos);

        Block startLog = state.getBlock();
        BlockPos currentPos = pos;
        ArrayList<BlockPos> brokenBlocks = new ArrayList<>();
        ArrayList<BlockPos> nextPos = new ArrayList<>();
        int blocksHarvested = 0;

        ArrayList<INBT> enchantments = new ArrayList<>();
        Random random = new Random();
        String unbreakingEnchantment = "";

        enchantments.add(IntNBT.valueOf(0));

        for(INBT enchantment : stack.getEnchantmentTagList()){
            enchantments.add(enchantment);
        }

        for(int i=0;i<enchantments.size(); i++){
            if(enchantments.get(i).toString().contains("minecraft:unbreaking")){
                unbreakingEnchantment = enchantments.get(i).toString();
            }
        }

        if(ArmorToolInit.BANANA_AXE.equals(stack.getItem()) && startLog.getTags().toString().contains("logs") || ArmorToolInit.BANANA_AXE.equals(stack.getItem()) && startLog.getTags().toString().contains("log")){
            brokenBlocks.add(pos);
            while(stack.getDamage() != stack.getMaxDamage() && blocksHarvested <= 128){
                ArrayList<BlockPos> logNeighbours = getWoodNeighbours(world,currentPos,startLog, stack);
                logNeighbours.removeAll(brokenBlocks);
                if(logNeighbours.size() > 0){
                    for(BlockPos blockPos : logNeighbours){
                        brokenBlocks.add(blockPos);
                        nextPos.add(blockPos);
                        world.destroyBlock(blockPos, true);
                        blocksHarvested += 1;
                        if(!player.isCreative()){
                            if(unbreakingEnchantment.length() != 0){
                                if(unbreakingEnchantment.contains("lvl:1")){
                                    if(random.nextInt(100) + 1 <= 50){
                                        stack.setDamage(stack.getDamage() + 1);
                                    }
                                }else if(unbreakingEnchantment.contains("lvl:2")){
                                    if(random.nextInt(100) + 1 <= 33){
                                        stack.setDamage(stack.getDamage() + 1);
                                    }
                                }else if(unbreakingEnchantment.contains("lvl:3")){
                                    if(random.nextInt(100) + 1 <= 25){
                                        stack.setDamage(stack.getDamage() + 1);
                                    }
                                }
                            }else{
                                stack.setDamage(stack.getDamage() + 1);
                            }
                        }
                    }
                }
                if(nextPos.size() > 0){
                    currentPos = nextPos.get(0);
                    nextPos.remove(currentPos);
                }else
                    break;
            }
        }
    }
	
	private static ArrayList<BlockPos> getWoodNeighbours(World world, BlockPos blockPos, Block block, ItemStack stack) {
        ArrayList<BlockPos> list = new ArrayList<>();
        for(int x=-1; x<=1; x++){
            if(stack.getDamage() >= stack.getMaxDamage() - 1){
                stack.shrink(1);
                break;
            }
            for(int y=-1; y<=1; y++){
                if(stack.getDamage() >= stack.getMaxDamage() - 1){
                    stack.shrink(1);
                    break;
                }
                for(int z=-1; z<=1; z++) {
                    if(stack.getDamage() >= stack.getMaxDamage() - 1){
                        stack.shrink(1);
                        break;
                    }

                    if(world.getBlockState(blockPos.add(x,y,z)).getBlock().equals(block)) {
                        list.add(blockPos.add(x,y,z));
                    }
                }
            }
        }

        return list;
    }
}
