package com.mrmacky.samplecraft.registry;

import com.mrmacky.samplecraft.SampleCraft;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SCItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SampleCraft.MOD_ID);

    //Items go here
    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerItem("example_item", Item::new, new Item.Properties());
    public static final DeferredItem<Item> SECOND_ITEM = ITEMS.registerSimpleItem("second_item", new Item.Properties().fireResistant().stacksTo(16).food(new FoodProperties.Builder().meat().nutrition(10).build()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }


}
