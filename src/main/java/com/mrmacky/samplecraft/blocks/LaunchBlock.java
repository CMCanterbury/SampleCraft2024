package com.mrmacky.samplecraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class LaunchBlock extends Block {

    public LaunchBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (!pEntity.isSteppingCarefully()) {
            pEntity.setDeltaMovement(0, 0.1, 0);
            if (!pLevel.isClientSide) {
                PrimedTnt primedTnt = new PrimedTnt(pLevel, pPos.getX() + 0.5, pPos.getY() + 1, pPos.getZ() + 0.5, null);
                primedTnt.setFuse(0);
                pLevel.addFreshEntity(primedTnt);
                pLevel.playSound(null, primedTnt.getX(), primedTnt.getY(), primedTnt.getZ(), SoundEvents.TNT_PRIMED, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
