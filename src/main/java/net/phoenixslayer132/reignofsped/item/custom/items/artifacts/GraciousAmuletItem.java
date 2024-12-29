package net.phoenixslayer132.reignofsped.item.custom.items.artifacts;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.phoenixslayer132.reignofsped.util.ModTags;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public class GraciousAmuletItem extends Item {


    public GraciousAmuletItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient) {
            BlockPos posClicked = context.getBlockPos();
            BlockState blockState = context.getWorld().getBlockState(posClicked);
            PlayerEntity player = context.getPlayer();
            assert player != null;

            if (blockState.isOf(Blocks.RED_SANDSTONE)) {
                if (player.isCreative()){
                    context.getPlayer().addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 999999999, 1, true, false, true));
                }
                else if (player.experienceLevel >= 50) {
                    player.addExperience(-5345); //50 levels
                    context.getPlayer().addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 999999999, 1, true, false, false));
                    context.getStack().damage(9, (ServerWorld) context.getWorld(), (ServerPlayerEntity) context.getPlayer(), item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
                    player.getItemCooldownManager().set(this, 999);
                    player.sendMessage(Text.literal("You understand its hidden use.. you bring it closer to the block and shave a bit of it on the Amulet."));
                    player.sendMessage(Text.literal("It releases a blinding light that pierces into your eyes, after checking yourself you realize you can see into the night."));
                }
                else {
                    player.sendMessage(Text.literal("You sense a hidden reaction coming from the Amulet, its as if it has a strange connection with this block.."));
                    player.sendMessage(Text.literal("However you do not seem to have enough wisdom to understand how to use it."));
                }
            }
            if (blockState.isIn(ModTags.Blocks.PHOEN_ORE_BLOCK)){
                context.getPlayer().setHealth(50.0f); // instantly heals 50HP
            }
        }
        return super.useOnBlock(context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, @NotNull PlayerEntity user, Hand hand) {
        if (!world.isClient())
        {
            if (user.isSneaking()){
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 2));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1800, 2));
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 90));
                user.addExperience(-55);//
                user.getMainHandStack().damage(1, (ServerWorld) world, (ServerPlayerEntity) user, item -> user.sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
                user.getItemCooldownManager().set(this, 20);//2000
            }


        }
        return super.use(world, user, hand);
    }


    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.reignofsped.gracious_amulet_item.tooltip"));
            tooltip.add(Text.translatable("tooltip.reignofsped.gracious_amulet_item.tooltip.shift"));
        } else {
            tooltip.add(Text.translatable("tooltip.reignofsped.gracious_amulet_item.tooltip"));
        }    }

}
