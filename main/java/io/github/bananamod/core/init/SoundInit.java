package io.github.bananamod.core.init;

import io.github.bananamod.BananaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundInit {
	
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BananaMod.MOD_ID);

    public static final RegistryObject<SoundEvent> GORILLA_IDLE = registerSoundEvents("gorilla_idle");
    public static final RegistryObject<SoundEvent> GORILLA_HURTS = registerSoundEvents("gorilla_hurts");
    public static final RegistryObject<SoundEvent> GORILLA_DIES = registerSoundEvents("gorilla_dies");
    
    public static final RegistryObject<SoundEvent> BANANA_EQUIP = registerSoundEvents("banana_equip");
    
    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(BananaMod.MOD_ID, name)));
    }
}
