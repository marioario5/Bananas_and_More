package io.github.bananamod.core.datagen;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.ItemArmor;
import io.github.bananamod.core.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider{
	
	
	public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, BananaMod.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
			simpleItem(ItemInit.PERFECT_BANANA);
			simpleItem(ItemInit.HEART_OF_BANANA);
			simpleItem(ItemInit.PERFECT_BANANA_PEEL);
			
			swordItem(ItemInit.BANANA_SWORD);
			pickaxeItem(ItemInit.BANANA_PICKAXE);
			axeItem(ItemInit.BANANA_AXE);
			shovelItem(ItemInit.BANANA_SHOVEL);
			hoeItem(ItemInit.BANANA_HOE);
			
			armorItem(ItemInit.BANANA_HELMET);
			armorItem(ItemInit.BANANA_CHESTPLATE);
			armorItem(ItemInit.BANANA_LEGGINGS);
			armorItem(ItemInit.BANANA_BOOTS);
	}
	
	private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BananaMod.MOD_ID,"item/" + item.getId().getPath()));
    }

	
    private ItemModelBuilder swordItem(RegistryObject<SwordItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BananaMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder pickaxeItem(RegistryObject<PickaxeItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BananaMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder axeItem(RegistryObject<AxeItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BananaMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder shovelItem(RegistryObject<ShovelItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BananaMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder hoeItem(RegistryObject<HoeItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BananaMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    
    private ItemModelBuilder armorItem(RegistryObject<ItemArmor> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BananaMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
