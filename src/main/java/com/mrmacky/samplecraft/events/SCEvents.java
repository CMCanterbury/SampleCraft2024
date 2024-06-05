package com.mrmacky.samplecraft.events;

import com.chaosthedude.naturescompass.NaturesCompass;
import com.mrmacky.samplecraft.SampleCraft;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.living.LivingAttackEvent;

@Mod.EventBusSubscriber(modid = SampleCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SCEvents {

    @SubscribeEvent
    public static void doAThing(LivingAttackEvent event) {
        if (event.getEntity().getType() == EntityType.CHICKEN) {
            Entity attacker = event.getSource().getDirectEntity();
            if (attacker instanceof Player player) {
                if (player.getMainHandItem().getItem() == NaturesCompass.naturesCompass) {
                    Level pLevel = event.getEntity().level();
                    BlockPos pPos = event.getEntity().getOnPos();

                    PrimedTnt primedTnt = new PrimedTnt(pLevel, pPos.getX() + 0.5, pPos.getY() + 1, pPos.getZ() + 0.5, null);
                    primedTnt.setFuse(1);
                    pLevel.addFreshEntity(primedTnt);
                    pLevel.playSound(null, primedTnt.getX(), primedTnt.getY(), primedTnt.getZ(), SoundEvents.TNT_PRIMED, SoundSource.BLOCKS, 1.0F, 1.0F);
                }
            }
        }
    }

}
