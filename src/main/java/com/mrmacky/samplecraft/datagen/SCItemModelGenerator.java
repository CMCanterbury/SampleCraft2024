package com.mrmacky.samplecraft.datagen;

import com.mrmacky.samplecraft.SampleCraft;
import com.mrmacky.samplecraft.registry.SCItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class SCItemModelGenerator extends ItemModelProvider {
    public SCItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SampleCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(SCItems.EXAMPLE_ITEM);
        simpleItem(SCItems.SECOND_ITEM);
    }

    private ItemModelBuilder simpleItem(DeferredItem<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SampleCraft.MOD_ID, "item/" + item.getId().getPath()));
    }
}
