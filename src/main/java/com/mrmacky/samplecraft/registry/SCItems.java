package com.mrmacky.samplecraft.registry;

import com.mrmacky.samplecraft.SampleCraft;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SCItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SampleCraft.MOD_ID);

    //Items go here

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }


}
