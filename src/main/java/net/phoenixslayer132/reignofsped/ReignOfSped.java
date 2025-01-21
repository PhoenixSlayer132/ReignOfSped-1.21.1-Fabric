package net.phoenixslayer132.reignofsped;

import net.fabricmc.api.ModInitializer;
import net.phoenixslayer132.reignofsped.block.ModBlockEntityTypes;
import net.phoenixslayer132.reignofsped.block.ModBlocks;
import net.phoenixslayer132.reignofsped.item.ModItemGroups;
import net.phoenixslayer132.reignofsped.item.ModItems;
import net.phoenixslayer132.reignofsped.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReignOfSped implements ModInitializer {

	public static final String MOD_ID = "reignofsped";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntityTypes.registerModBlockEntityTypes();

		ModWorldGeneration.generateModWorldGen();

	}
}
