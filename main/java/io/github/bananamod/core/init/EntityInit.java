package io.github.bananamod.core.init;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.entity.GorillaEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BananaMod.MOD_ID);
	
	public static final RegistryObject<EntityType<GorillaEntity>> GORILLA = 
			ENTITY_TYPES.register("gorilla", () -> EntityType.Builder.of(GorillaEntity::new, MobCategory.MONSTER)
			.sized(1.4F, 1.4F).build("gorilla"));
}
