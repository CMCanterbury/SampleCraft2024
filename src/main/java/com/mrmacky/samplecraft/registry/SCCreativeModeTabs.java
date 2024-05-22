package com.mrmacky.samplecraft.registry;

import com.mrmacky.samplecraft.SampleCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SCCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SampleCraft.MOD_ID);

    //Creative mode tabs go here
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register(
            "example_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.creative_tab"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> SCItems.EXAMPLE_ITEM.get().getDefaultInstance())
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(SCItems.EXAMPLE_ITEM);
                        pOutput.accept(SCItems.SECOND_ITEM);
                        pOutput.accept(SCBlocks.EXAMPLE_BLOCK);
                    }))
                    .build()
    );

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

}
