package net.phoenixslayer132.reignofsped.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.phoenixslayer132.reignofsped.block.ModBlocks;
import net.phoenixslayer132.reignofsped.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
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
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops){
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
