package com.turboworm27.graduationmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.turboworm27.graduationmod.common.proxy.CommonProxy;
import com.turboworm27.graduationmod.common.proxy.ClientProxy;
import com.turboworm27.graduationmod.core.init.BlockInit;
import com.turboworm27.graduationmod.core.init.ItemInit;
import com.turboworm27.graduationmod.world.OreGeneration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GraduationMod.MOD_ID)
public class GraduationMod
{
	@SuppressWarnings("deprecation")
	private static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);
    //Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "graduationmodfor2021";
    public static final ItemGroup BANANAGROUP = new BananaGroup("bananagroup");

    public GraduationMod() {
    	FMLJavaModLoadingContext.get().getModEventBus().register(this);
        proxy.construct();
    	
        IEventBus bus =  FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        ItemInit.ITEMS.register(bus); 
        BlockInit.BLOCKS.register(bus);  
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event){
    	proxy.setup();
    }
    
    @SubscribeEvent
    public void ready(FMLLoadCompleteEvent event) {
    	proxy.complete();
    }
    
    public static class BananaGroup extends ItemGroup{
		public BananaGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack createIcon() {
			return ItemInit.PERFECT_BANANA_BLOCK.get().getDefaultInstance();
			
		}
    }
    
}