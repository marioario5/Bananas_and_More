package io.github.bananamod.core.init;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.EntityBananaBoss;
<<<<<<< HEAD
import net.minecraft.resources.ResourceLocation;
=======
>>>>>>> 9d31e7a55f7e7723e4395c3f69d5f0c957b690e4
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

<<<<<<< HEAD
@SuppressWarnings("unused")
public class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BananaMod.MODID);
	
	 //public static final RegistryObject<EntityType<EntityBananaBoss>> EXAMPLE = ENTITIES.register("example_entity",
	        //   () -> EntityType.Builder.<EntityBananaBoss>of(EntityBananaBoss::new, MobCategory.CREATURE).sized(1.0f, 1.0f)
	                 //   .build(new ResourceLocation(BananaMod.MODID, "example_entity").toString()));
	
}
=======
public class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, BananaMod.MODID);
	
	
	 public static final RegistryObject<EntityType<EntityBananaBoss>> GRIZZLY_BEAR = ENTITIES.register("grizzly_bear", () -> registerEntity(EntityType.Builder.of(EntityBananaBoss::new, MobCategory.CREATURE).sized(1.6F, 1.8F), "grizzly_bear"));
	 private EntityInit() {
	 }
}
>>>>>>> 9d31e7a55f7e7723e4395c3f69d5f0c957b690e4
