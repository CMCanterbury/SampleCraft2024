package com.mrmacky.samplecraft.events;

import com.mrmacky.samplecraft.SampleCraft;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.living.LivingAttackEvent;

@Mod.EventBusSubscriber(modid = SampleCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SCEvents {

    @SubscribeEvent
    public static void doAThing(LivingAttackEvent event) {

    }

}
