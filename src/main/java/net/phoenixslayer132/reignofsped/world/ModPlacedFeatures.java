package net.phoenixslayer132.reignofsped.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.phoenixslayer132.reignofsped.ReignOfSped;
import net.phoenixslayer132.reignofsped.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> BLQ_ORE_PLACED_KEY = registerKey("blq_ore_placed");
    public static final RegistryKey<PlacedFeature> PHOEN_ORE_PLACED_KEY = registerKey("phoen_ore_placed");
    public static final RegistryKey<PlacedFeature> SUPERN_ORE_PLACED_KEY = registerKey("supern_ore_placed");


    public static final RegistryKey<PlacedFeature> LAMMOTH_PLACED_KEY = registerKey("lammoth_placed");

    public static void bootstrap(Registerable<PlacedFeature> context){
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, BLQ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLQ_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3,
                HeightRangePlacementModifier.uniform(YOffset.fixed(-40), YOffset.fixed(40))));
        register(context, PHOEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PHOEN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                HeightRangePlacementModifier.uniform(YOffset.fixed(20), YOffset.fixed(30))));
        register(context, SUPERN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SUPERN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3,
                HeightRangePlacementModifier.uniform(YOffset.fixed(-30), YOffset.fixed(30))));

        register(context, LAMMOTH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LAMMOTH_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.5f, 0), ModBlocks.LAMMOTH_SAPLING));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name){
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ReignOfSped.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context,
                               RegistryKey<PlacedFeature> key,
                               RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                               List<PlacementModifier> modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context,
                                                                                   RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers){
        register(context, key, configuration, List.of(modifiers));
    }
}
