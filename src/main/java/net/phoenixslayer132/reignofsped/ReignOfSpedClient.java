package net.phoenixslayer132.reignofsped;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.phoenixslayer132.reignofsped.block.ModBlocks;

@Environment(EnvType.CLIENT)
public class ReignOfSpedClient implements ClientModInitializer {


	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAMMOTH_SAPLING, RenderLayer.getCutout());

	}
}
