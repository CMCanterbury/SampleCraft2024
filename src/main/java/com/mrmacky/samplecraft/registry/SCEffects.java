package com.mrmacky.samplecraft.registry;

import com.mrmacky.samplecraft.SampleCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SCEffects {

    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, SampleCraft.MOD_ID);

//    public static final DeferredHolder<MobEffect, MobEffect> CLIMBING = EFFECTS.register("climbing",
//            () -> new MobEffect());



    public static void register(IEventBus bus) {
        EFFECTS.register(bus);
    }

}
