package net.phoenixslayer132.reignofsped.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.phoenixslayer132.reignofsped.block.ModBlocks;
import net.phoenixslayer132.reignofsped.item.ModItems;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Raw Blocks
        addDrop(ModBlocks.RAW_BLQ_BLOCK);
        addDrop(ModBlocks.RAW_DAR_BLOCK);
        addDrop(ModBlocks.RAW_SUPERN_BLOCK);
        addDrop(ModBlocks.RAW_PHOEN_BLOCK);

        //Woods
        addDrop(ModBlocks.LAMMOTH_PLANKS);
        addDrop(ModBlocks.LAMMOTH_WOOD);
        addDrop(ModBlocks.LAMMOTH_LOG);
        addDrop(ModBlocks.STRIPPED_LAMMOTH_LOG);
        addDrop(ModBlocks.STRIPPED_LAMMOTH_WOOD);

        //Ores
        addDrop(ModBlocks.BLQ_ORE, oreDrops(ModBlocks.BLQ_ORE, ModItems.RAW_BLQ));
        addDrop(ModBlocks.SUPERN_ORE, oreDrops(ModBlocks.SUPERN_ORE, ModItems.RAW_SUPERN));
        addDrop(ModBlocks.PHOEN_ORE, oreDrops(ModBlocks.PHOEN_ORE, ModItems.RAW_PHOEN));
        addDrop(ModBlocks.DAR_ORE, oreDrops(ModBlocks.DAR_ORE, ModItems.RAW_DAR));

    }
}
