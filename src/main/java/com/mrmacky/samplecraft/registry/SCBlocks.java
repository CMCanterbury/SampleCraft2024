package com.mrmacky.samplecraft.registry;

import com.mrmacky.samplecraft.SampleCraft;
import com.mrmacky.samplecraft.blocks.LaunchBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SCBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SampleCraft.MOD_ID);

    //Blocks go here
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = registerWithItem("example_block", () -> new LaunchBlock(BlockBehaviour.Properties.of().friction(0.01F).strength(10F).requiresCorrectToolForDrops().mapColor(MapColor.STONE)));

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }


    private static DeferredBlock<Block> registerWithItem(String blockID, Supplier<? extends Block> sup) {
        DeferredBlock<Block> block = registerWithNoItem(blockID, sup);
        SCItems.ITEMS.registerSimpleBlockItem(block);
        return block;
    }

    private static DeferredBlock<Block> registerWithNoItem(String blockID, Supplier<? extends Block> sup) {
        return BLOCKS.register(blockID, sup);
    }

}
