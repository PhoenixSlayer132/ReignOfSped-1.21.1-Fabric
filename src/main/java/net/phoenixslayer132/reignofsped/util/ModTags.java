package net.phoenixslayer132.reignofsped.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.phoenixslayer132.reignofsped.ReignOfSped;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> PHOEN_ORE_BLOCK = createTag("phoen_ore_block");
        public static final TagKey<Block> BLQ_ORE_BLOCK = createTag("blq_ore_block");
        public static final TagKey<Block> SUPERN_ORE_BLOCK = createTag("supern_ore_block");
        public static final TagKey<Block> DAR_ORE_BLOCK = createTag("dar_ore_block");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ReignOfSped.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ROS_SCROLLS = createTag("ros_scrolls");
        public static final TagKey<Item> ROS_ARTIFACTS = createTag("ros_artifacts");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ReignOfSped.MOD_ID, name));
        }
    }
}
