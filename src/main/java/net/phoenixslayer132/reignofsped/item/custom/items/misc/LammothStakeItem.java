package net.phoenixslayer132.reignofsped.item.custom.items.misc;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

import static net.minecraft.block.FarmlandBlock.MOISTURE;

public class LammothStakeItem extends Item{
    public LammothStakeItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient){
            PlayerEntity player = context.getPlayer();
            assert player != null;
            BlockPos positionClicked = context.getBlockPos();

            BlockPos abovePositionClicked = context.getBlockPos().add(0, 1,0);
            BlockState blockState = context.getWorld().getBlockState(positionClicked);

            if(blockState.getBlock() == Blocks.FARMLAND){
                int moistureLvl = blockState.get(MOISTURE);
                player.sendMessage(Text.literal("This farmland's moisture is at " + moistureLvl + "."), true);
                context.getStack().damage(1, (ServerWorld) context.getWorld(), (ServerPlayerEntity) context.getPlayer(), item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
            }

            else{
                if(context.getWorld().hasRain(abovePositionClicked)){
                    player.sendMessage(Text.literal("This block has rain above it."), true);
                    context.getStack().damage(1, (ServerWorld) context.getWorld(), (ServerPlayerEntity) context.getPlayer(), item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                } else if (!context.getWorld().hasRain(abovePositionClicked)) {
                    player.sendMessage(Text.literal("This block does not have rain above it."), true);
                    context.getStack().damage(1, (ServerWorld) context.getWorld(), (ServerPlayerEntity) context.getPlayer(), item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
                }
            }

        }

        return super.useOnBlock(context);
    }



}
