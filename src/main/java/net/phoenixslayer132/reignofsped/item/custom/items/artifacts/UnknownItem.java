package net.phoenixslayer132.reignofsped.item.custom.items.artifacts;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class UnknownItem extends Item {

    public UnknownItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient()){
            double ran = Math.random() * 10;
            if (ran <= 3.0){
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 300, 1));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 3));
            } else if (ran <= 7.0) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 2000, 3));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1000, 2));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000, 1));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 500, 1));
            }
            else if (ran > 7.0) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 2000, 3));
            }
        }
        return super.use(world, user, hand);
    }
}
