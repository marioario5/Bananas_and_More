package io.github.bananamod.core.init;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.EntityBananaBoss;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@SuppressWarnings("unused")
public class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BananaMod.MODID);
	
	 //public static final RegistryObject<EntityType<EntityBananaBoss>> EXAMPLE = ENTITIES.register("example_entity",
	        //   () -> EntityType.Builder.<EntityBananaBoss>of(EntityBananaBoss::new, MobCategory.CREATURE).sized(1.0f, 1.0f)
	                 //   .build(new ResourceLocation(BananaMod.MODID, "example_entity").toString()));
	
}
