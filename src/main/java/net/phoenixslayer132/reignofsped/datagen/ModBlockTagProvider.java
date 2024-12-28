package net.phoenixslayer132.reignofsped.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.mininglevel.v1.MiningLevelManager;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.phoenixslayer132.reignofsped.block.ModBlocks;
import net.phoenixslayer132.reignofsped.util.ModTags;

import java.util.concurrent.CompletableFuture;


public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.PHOEN_ORE_BLOCK)
                .add(ModBlocks.PHOEN_ORE);
        getOrCreateTagBuilder(ModTags.Blocks.DAR_ORE_BLOCK)
                .add(ModBlocks.DAR_ORE);
        getOrCreateTagBuilder(ModTags.Blocks.SUPERN_ORE_BLOCK)
                .add(ModBlocks.SUPERN_ORE);
        getOrCreateTagBuilder(ModTags.Blocks.BLQ_ORE_BLOCK)
                .add(ModBlocks.BLQ_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLQ_ORE,
                        ModBlocks.RAW_PHOEN_BLOCK,
                        ModBlocks.DAR_ORE,
                        ModBlocks.RAW_DAR_BLOCK,
                        ModBlocks.RAW_BLQ_BLOCK,
                        ModBlocks.PHOEN_ORE,
                        ModBlocks.RAW_SUPERN_BLOCK,
                        ModBlocks.SUPERN_ORE);

        getOrCreateTagBuilder(MiningLevelManager.getBlockTag(4))
                .add(ModBlocks.BLQ_ORE,
                        ModBlocks.RAW_PHOEN_BLOCK,
                        ModBlocks.DAR_ORE,
                        ModBlocks.RAW_DAR_BLOCK,
                        ModBlocks.RAW_BLQ_BLOCK,
                        ModBlocks.PHOEN_ORE,
                        ModBlocks.RAW_SUPERN_BLOCK,
                        ModBlocks.SUPERN_ORE
                        );

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.LAMMOTH_LOG,
                        ModBlocks.LAMMOTH_PLANKS,
                        ModBlocks.LAMMOTH_WOOD,
                        ModBlocks.STRIPPED_LAMMOTH_LOG,
                        ModBlocks.STRIPPED_LAMMOTH_WOOD
                        );
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.LAMMOTH_LOG, ModBlocks.LAMMOTH_WOOD, ModBlocks.STRIPPED_LAMMOTH_LOG, ModBlocks.STRIPPED_LAMMOTH_WOOD );
    }
}
