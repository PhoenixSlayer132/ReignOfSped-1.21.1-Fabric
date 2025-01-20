package net.phoenixslayer132.reignofsped.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;
import net.phoenixslayer132.reignofsped.block.ModBlocks;
import net.phoenixslayer132.reignofsped.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Ores
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PHOEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SUPERN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLQ_ORE);

        //Raw Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_DAR_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PHOEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SUPERN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_BLQ_BLOCK);

        //Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAR_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PHOEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SUPERN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLQ_BLOCK);

        //Wood
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAMMOTH_PLANKS);
        blockStateModelGenerator.registerLog(ModBlocks.LAMMOTH_LOG).log(ModBlocks.LAMMOTH_LOG).wood(ModBlocks.LAMMOTH_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_LAMMOTH_LOG).log(ModBlocks.STRIPPED_LAMMOTH_LOG).wood(ModBlocks.STRIPPED_LAMMOTH_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAMMOTH_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.LAMMOTH_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Custom


        //Misc


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //Ingots
        itemModelGenerator.register(ModItems.BLQ_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DAR_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PHOEN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUPERN_INGOT, Models.GENERATED);


        //Raw
        itemModelGenerator.register(ModItems.RAW_BLQ, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_DAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PHOEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SUPERN, Models.GENERATED);

        //Wood
        itemModelGenerator.register(ModItems.LAMMOTH_STICK, Models.HANDHELD);
        itemModelGenerator.register(ModBlocks.LAMMOTH_SAPLING.asItem(), Models.GENERATED);

        //Supern Food
        itemModelGenerator.register(ModItems.CATFISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_CATFISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_CATFISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUPERN_CATFISH, Models.GENERATED);
        //Blq Food
        itemModelGenerator.register(ModItems.CHICKEN_TENDERS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_BAMBOO, Models.GENERATED);

        //Phoen Food

        //Dar Food


        //Artifacts
        itemModelGenerator.register(ModItems.UNKNOWN_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRACIOUS_AMULET_ITEM, Models.GENERATED);
        //Runes
        itemModelGenerator.register(ModItems.LINYURDS_RUNES_ITEM, Models.GENERATED);
        //Scrolls
        itemModelGenerator.register(ModItems.RESTORATION_SCROLL_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRENGTH_SCROLL_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ATTACK_SPEED_SCROLL_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOVEMENT_SPEED_SCROLL_ITEM, Models.GENERATED);
        //Misc
        itemModelGenerator.register(ModItems.LAMMOTH_STAKE, Models.GENERATED);

    }
}
