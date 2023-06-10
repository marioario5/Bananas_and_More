package io.github.bananamod.core.init;

import io.github.bananamod.BananaMod;
import io.github.bananamod.common.GorrillaEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BananaMod.MODID);

    /*
    public static final RegistryObject<EntityType<GorrillaEntity>> TIGER =
            ENTITY_TYPES.register("tiger",
                    () -> EntityType.Builder.of(GorrillaEntity::new, MobCategory.CREATURE)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(BananaMod.MODID, "gorrilla").toString()));
                      */

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}