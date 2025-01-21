package net.phoenixslayer132.reignofsped.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.phoenixslayer132.reignofsped.world.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.BLQ_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.PHOEN_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.SUPERN_ORE_PLACED_KEY);
    }
}