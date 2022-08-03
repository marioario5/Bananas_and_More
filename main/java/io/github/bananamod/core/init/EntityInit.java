package io.github.bananamod.core.init;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.EntityBananaBoss;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, BananaMod.MODID);
	
	
	 public static final RegistryObject<EntityType<EntityBananaBoss>> GRIZZLY_BEAR = ENTITIES.register("grizzly_bear", () -> registerEntity(EntityType.Builder.of(EntityBananaBoss::new, MobCategory.CREATURE).sized(1.6F, 1.8F), "grizzly_bear"));
	 private EntityInit() {
	 }
}
