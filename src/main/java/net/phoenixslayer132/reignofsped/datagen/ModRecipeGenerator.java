package net.phoenixslayer132.reignofsped.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.phoenixslayer132.reignofsped.block.ModBlocks;
import net.phoenixslayer132.reignofsped.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LAMMOTH_STAKE)
                .pattern("  S")
                .pattern(" S ")
                .pattern("S  ")
                .input('S', ModItems.LAMMOTH_STICK)
                .criterion(hasItem(ModItems.LAMMOTH_STICK), conditionsFromItem(ModItems.LAMMOTH_STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LAMMOTH_STAKE)));


        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLQ_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.BLQ_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PHOEN_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.PHOEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SUPERN_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.SUPERN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DAR_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.DAR_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_BLQ, RecipeCategory.DECORATIONS,
                ModBlocks.RAW_BLQ_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_PHOEN, RecipeCategory.DECORATIONS,
                ModBlocks.RAW_PHOEN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_SUPERN, RecipeCategory.DECORATIONS,
                ModBlocks.RAW_SUPERN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_DAR, RecipeCategory.DECORATIONS,
                ModBlocks.RAW_DAR_BLOCK);


        offerSmelting(exporter, List.of(ModItems.RAW_BLQ, ModBlocks.BLQ_ORE), RecipeCategory.MISC, ModItems.BLQ_INGOT,
                2.0f, 200, "Reign Of Sped");
        offerSmelting(exporter, List.of(ModItems.RAW_PHOEN, ModBlocks.PHOEN_ORE), RecipeCategory.MISC, ModItems.PHOEN_INGOT,
                2.0f, 200, "Reign Of Sped");
        offerSmelting(exporter, List.of(ModItems.RAW_SUPERN, ModBlocks.SUPERN_ORE), RecipeCategory.MISC, ModItems.SUPERN_INGOT,
                2.0f, 200, "Reign Of Sped");
        offerSmelting(exporter, List.of(ModItems.RAW_DAR, ModBlocks.DAR_ORE), RecipeCategory.MISC, ModItems.DAR_INGOT,
                2.0f, 200, "Reign Of Sped");

        offerBlasting(exporter, List.of(ModItems.RAW_BLQ, ModBlocks.BLQ_ORE), RecipeCategory.MISC, ModItems.BLQ_INGOT,
                2.0f, 100, "Reign Of Sped");
        offerBlasting(exporter, List.of(ModItems.RAW_PHOEN, ModBlocks.PHOEN_ORE), RecipeCategory.MISC, ModItems.PHOEN_INGOT,
                2.0f, 100, "Reign Of Sped");
        offerBlasting(exporter, List.of(ModItems.RAW_SUPERN, ModBlocks.SUPERN_ORE), RecipeCategory.MISC, ModItems.SUPERN_INGOT,
                2.0f, 100, "Reign Of Sped");
        offerBlasting(exporter, List.of(ModItems.RAW_DAR, ModBlocks.DAR_ORE), RecipeCategory.MISC, ModItems.DAR_INGOT,
                2.0f, 100, "Reign Of Sped");

    }
}
