package net.phoenixslayer132.reignofsped.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.phoenixslayer132.reignofsped.ReignOfSped;
import net.phoenixslayer132.reignofsped.block.custom.DuplicatorBlock;
import net.phoenixslayer132.reignofsped.block.other.ModSaplingBlock;
import net.phoenixslayer132.reignofsped.block.custom.TreasureChestBlock;
import net.phoenixslayer132.reignofsped.block.runes.LinyurdsRunesBlock;
import net.phoenixslayer132.reignofsped.world.tree.ModSaplingGenerators;


public class ModBlocks {
    public static final Block RAW_PHOEN_BLOCK = registerBlock("raw_phoen_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block RAW_SUPERN_BLOCK = registerBlock("raw_supern_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block RAW_BLQ_BLOCK = registerBlock("raw_blq_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block RAW_DAR_BLOCK = registerBlock("raw_dar_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().luminance((state) -> 1)));

    public static final Block PHOEN_BLOCK = registerBlock("phoen_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block SUPERN_BLOCK = registerBlock("supern_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block BLQ_BLOCK = registerBlock("blq_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block DAR_BLOCK = registerBlock("dar_block",
            new Block(AbstractBlock.Settings.create().strength(4f)));


    public static final Block PHOEN_ORE = registerBlock("phoen_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().luminance((state) -> 3)
                            .allowsSpawning(((state, world, pos, type) -> type.isFireImmune()))
                            .postProcess(Blocks::always).emissiveLighting(Blocks::always)));

    public static final Block SUPERN_ORE = registerBlock("supern_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().luminance((state) -> 3)
                            .allowsSpawning((state, world, pos, entityType) -> entityType.isSpawnableFarFromPlayer())
                            .postProcess(Blocks::always).emissiveLighting(Blocks::always)));

    public static final Block BLQ_ORE = registerBlock("blq_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().luminance((state) -> 3)
                            .allowsSpawning((state, world, pos, entityType) -> entityType.isSpawnableFarFromPlayer())
                            .postProcess(Blocks::always).emissiveLighting(Blocks::always)));

    public static final Block DAR_ORE = registerBlock("dar_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().luminance((state) -> 3)
                            .allowsSpawning((state, world, pos, entityType) -> entityType.isSpawnableFarFromPlayer())
                            .postProcess(Blocks::always).emissiveLighting(Blocks::always)));

    public static final Block LAMMOTH_PLANKS = registerBlock("lammoth_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block LAMMOTH_LEAVES = registerBlock("lammoth_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LEAVES)));
    public static final Block LAMMOTH_LOG = registerBlock("lammoth_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LOG)));
    public static final Block LAMMOTH_WOOD = registerBlock("lammoth_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
    public static final Block STRIPPED_LAMMOTH_LOG = registerBlock("stripped_lammoth_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block STRIPPED_LAMMOTH_WOOD = registerBlock("stripped_lammoth_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
    public static final Block LAMMOTH_SAPLING = registerBlock("lammoth_sapling",
            new ModSaplingBlock(ModSaplingGenerators.LAMMOTH, AbstractBlock.Settings.copy(Blocks.DARK_OAK_SAPLING), Blocks.MYCELIUM));

    public static final DuplicatorBlock DUPLICATOR_BLOCK = (DuplicatorBlock) ModBlocks.registerBlock("duplicator_block",
            new DuplicatorBlock(AbstractBlock.Settings.create().requiresTool().strength(4f)));

    public static final TreasureChestBlock TREASURE_CHEST_BLOCK = (TreasureChestBlock) ModBlocks.registerBlock("treasure_chest_block",
            new TreasureChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST)));

    public static final LinyurdsRunesBlock LINYURDS_RUNES_BLOCK = (LinyurdsRunesBlock) ModBlocks.registerBlock("linyurds_runes_block",
            new LinyurdsRunesBlock(AbstractBlock.Settings.create().breakInstantly().dropsNothing()));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ReignOfSped.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ReignOfSped.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        ReignOfSped.LOGGER.info("Registering ModBlocks for " + ReignOfSped.MOD_ID);
    }
}
