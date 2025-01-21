package net.phoenixslayer132.reignofsped.world;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.phoenixslayer132.reignofsped.ReignOfSped;
import net.phoenixslayer132.reignofsped.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLQ_ORE_KEY = registerKey("blq_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHOEN_ORE_KEY = registerKey("phoen_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUPERN_ORE_KEY = registerKey("supern_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> LAMMOTH_KEY = registerKey("lammoth");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest prismarineReplacables = new BlockMatchRuleTest(Blocks.PRISMARINE);
        RuleTest magmaBlockReplacables = new BlockMatchRuleTest(Blocks.MAGMA_BLOCK);
        RuleTest endStoneReplacables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> prismarineBlqOres =
                List.of(OreFeatureConfig.createTarget(prismarineReplacables, ModBlocks.BLQ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> magmaPhoenOres =
                List.of(OreFeatureConfig.createTarget(magmaBlockReplacables, ModBlocks.PHOEN_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endStoneSupernOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplacables, ModBlocks.SUPERN_ORE.getDefaultState()));

        register(context, BLQ_ORE_KEY, Feature.ORE, new OreFeatureConfig(prismarineBlqOres, 2));
        register(context, PHOEN_ORE_KEY, Feature.ORE, new OreFeatureConfig(magmaPhoenOres, 2));
        register(context, SUPERN_ORE_KEY, Feature.ORE, new OreFeatureConfig(endStoneSupernOres, 2));

        register(context, LAMMOTH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.LAMMOTH_LOG),
                    new StraightTrunkPlacer(2, 1, 0),

                    BlockStateProvider.of(ModBlocks.LAMMOTH_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),

                    new TwoLayersFeatureSize(1, 2,1)).dirtProvider(BlockStateProvider.of(Blocks.MYCELIUM)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ReignOfSped.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }


}
