package com.mrmacky.samplecraft.datagen;

import com.mrmacky.samplecraft.SampleCraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static net.neoforged.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@Mod.EventBusSubscriber(modid = SampleCraft.MOD_ID, bus = MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new SCRecipeProvider(packOutput));
        generator.addProvider(event.includeClient(), new SCBlockStateGenerator(packOutput, helper));
        generator.addProvider(event.includeClient(), new SCItemModelGenerator(packOutput, helper));
        generator.addProvider(event.includeServer(), new SCBlockTagGenerator(packOutput, lookupProvider, helper));


    }
}