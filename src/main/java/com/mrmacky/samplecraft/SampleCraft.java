package com.mrmacky.samplecraft;

import com.mojang.logging.LogUtils;
import com.mrmacky.samplecraft.registry.SCBlocks;
import com.mrmacky.samplecraft.registry.SCCreativeModeTabs;
import com.mrmacky.samplecraft.registry.SCItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SampleCraft.MOD_ID)
public class SampleCraft {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "samplecraft";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public SampleCraft(IEventBus modEventBus) {

        SCItems.register(modEventBus);
        SCBlocks.register(modEventBus);
        SCCreativeModeTabs.register(modEventBus);

    }

}
