package com.mrmacky.samplecraft.datagen;

import com.mrmacky.samplecraft.SampleCraft;
import com.mrmacky.samplecraft.registry.SCBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class SCBlockStateGenerator extends BlockStateProvider {


    public SCBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SampleCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(SCBlocks.EXAMPLE_BLOCK.get(), cubeAll(SCBlocks.EXAMPLE_BLOCK.get()));
    }
}
