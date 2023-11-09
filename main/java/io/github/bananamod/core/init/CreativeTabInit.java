package io.github.bananamod.core.init;

import net.minecraft.network.chat.Component;

import io.github.bananamod.BananaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            BananaMod.MOD_ID);

    public static RegistryObject<CreativeModeTab> BANANA_TAB = CREATIVE_TABS.register("banana_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.BANANA_AXE.get()))
                    .title(Component.translatable("creativemodetab.banana_tab")).build());

    public static void register(IEventBus eventBus) {
    	CREATIVE_TABS.register(eventBus);
    }
	
}
