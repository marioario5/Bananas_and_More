package io.github.bananamod.core.init;

<<<<<<< HEAD
import io.github.bananamod.BananaMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = BananaMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class CreativeTabInit {
	@SubscribeEvent
	public void buildContents(CreativeModeTabEvent.Register event) {
	  event.registerCreativeModeTab(new ResourceLocation(BananaMod.MODID, "banana"), builder ->
	    builder.title(Component.translatable("itemGroup." + BananaMod.MODID + ".bananas"))
	    .icon(() -> new ItemStack(ItemInit.BANANA_AXE.get()))
	    .displayItems((params, output) -> {
	      output.accept(ItemInit.PERFECT_BANANA.get());
	      
	      output.accept(ItemInit.PERFECT_BANANA_PEEL.get());
	      output.accept(ItemInit.HEART_OF_BANANA.get());
	      
	      output.accept(ItemInit.BANANA_SWORD.get());
	      output.accept(ItemInit.BANANA_PICKAXE.get());
	      output.accept(ItemInit.BANANA_AXE.get());
	      output.accept(ItemInit.BANANA_SHOVEL.get());
	      output.accept(ItemInit.BANANA_HOE.get());
	      
	      output.accept(ItemInit.BANANA_HELMET.get());
	      output.accept(ItemInit.BANANA_CHESTPLATE.get());
	      output.accept(ItemInit.BANANA_LEGGINGS.get());
	      output.accept(ItemInit.BANANA_BOOTS.get());
	      
	      output.accept(BlockInit.BANANA_ORE.get());
	      output.accept(BlockInit.BANANA_BLOCK.get());
	    })
	  );
	}
=======
import io.github.bananamod.common.CreativeTabBanana;

public class CreativeTabInit {
	public static final CreativeTabBanana banana = new CreativeTabBanana();
>>>>>>> 9d31e7a55f7e7723e4395c3f69d5f0c957b690e4
}
