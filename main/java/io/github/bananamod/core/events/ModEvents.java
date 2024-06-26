package io.github.bananamod.core.events;

import java.util.List;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.structures.Structures;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MapItem;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.saveddata.maps.MapItemSavedData;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.level.saveddata.maps.MapDecoration;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = BananaMod.MOD_ID, value = Dist.DEDICATED_SERVER)
public class ModEvents {

	@SubscribeEvent
	public static void addCustomTrades(VillagerTradesEvent event) {
		//Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		/*
		if(event.getType() == VillagerProfession.CARTOGRAPHER) {
			System.out.println("hi");
			trades.get(1).add((p_219708_, p_219709_) -> {
				ServerLevel serverlevel = (ServerLevel)p_219708_.level();
				BlockPos blockpos = serverlevel.findNearestMapStructure(Structures.ON_BANANA_EXPLORER_MAPS, p_219708_.blockPosition(), 100, true);
				if(blockpos != null) {
					ItemStack itemstack = MapItem.create(serverlevel, blockpos.getX(), blockpos.getZ(), (byte)2, true, true);
		            MapItem.renderBiomePreviewMap(serverlevel, itemstack);
		            MapItemSavedData.addTargetDecoration(itemstack, blockpos, "+", MapDecoration.Type.MANSION);
		            itemstack.setHoverName(Component.translatable("Banana Map"));
		            return new MerchantOffer(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.COMPASS), itemstack, 2, 5, 0.2F);
				} else {
					return null;
				}
			});
		}		
*/
	}
}
