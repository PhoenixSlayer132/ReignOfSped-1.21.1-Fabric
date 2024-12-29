package net.phoenixslayer132.reignofsped.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.phoenixslayer132.reignofsped.block.ModBlocks;
import net.phoenixslayer132.reignofsped.item.ModItems;
import net.phoenixslayer132.reignofsped.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(
                    ModBlocks.LAMMOTH_LOG.asItem(),
                    ModBlocks.LAMMOTH_WOOD.asItem(),
                    ModBlocks.STRIPPED_LAMMOTH_LOG.asItem(),
                    ModBlocks.STRIPPED_LAMMOTH_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(
                    ModBlocks.LAMMOTH_PLANKS.asItem());

        getOrCreateTagBuilder(ModTags.Items.ROS_SCROLLS)
                .add(
                    ModItems.ATTACK_SPEED_SCROLL_ITEM,
                    ModItems.DUPLICATION_SCROLL_ITEM,
                    ModItems.RESTORATION_SCROLL_ITEM,
                    ModItems.STRENGTH_SCROLL_ITEM,
                    ModItems.REPAIR_SCROLL_ITEM,
                    ModItems.MOVEMENT_SPEED_SCROLL_ITEM);
    }
}
