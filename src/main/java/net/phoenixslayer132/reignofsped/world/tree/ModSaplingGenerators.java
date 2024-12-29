package net.phoenixslayer132.reignofsped.world.tree;

import net.minecraft.block.SaplingGenerator;
import net.phoenixslayer132.reignofsped.ReignOfSped;
import net.phoenixslayer132.reignofsped.world.ModConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator LAMMOTH = new SaplingGenerator(ReignOfSped.MOD_ID + ":lammoth",
            Optional.empty(), Optional.of(ModConfiguredFeatures.LAMMOTH_KEY), Optional.empty());
}
