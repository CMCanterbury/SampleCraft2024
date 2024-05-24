package com.mrmacky.samplecraft.datagen;

import com.mrmacky.samplecraft.SampleCraft;
import com.mrmacky.samplecraft.registry.SCBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class SCBlockTagGenerator extends BlockTagsProvider {

    public SCBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SampleCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(SCBlocks.EXAMPLE_BLOCK.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(SCBlocks.EXAMPLE_BLOCK.get());
    }
}
