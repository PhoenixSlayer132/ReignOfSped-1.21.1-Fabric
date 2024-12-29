package net.phoenixslayer132.reignofsped.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.phoenixslayer132.reignofsped.ReignOfSped;

import net.minecraft.util.Identifier;
import net.phoenixslayer132.reignofsped.item.custom.items.ModFoodComponents;
import net.phoenixslayer132.reignofsped.item.custom.items.artifacts.GraciousAmuletItem;
import net.phoenixslayer132.reignofsped.item.custom.items.artifacts.UnknownItem;
import net.phoenixslayer132.reignofsped.item.custom.items.misc.LammothStakeItem;
import net.phoenixslayer132.reignofsped.item.custom.items.runes.LinyurdsRunesItem;
import net.phoenixslayer132.reignofsped.item.custom.items.scrolls.*;

public class ModItems {
    public static final Item RAW_PHOEN = registerItem("raw_phoen",
            new Item(new Item.Settings()));
    public static final Item RAW_SUPERN = registerItem("raw_supern",
            new Item(new Item.Settings()));
    public static final Item RAW_BLQ = registerItem("raw_blq",
            new Item(new Item.Settings()));
    public static final Item RAW_DAR = registerItem("raw_dar",
            new Item(new Item.Settings()));


    public static final Item PHOEN_INGOT = registerItem("phoen_ingot",
            new Item(new Item.Settings()));
    public static final Item SUPERN_INGOT = registerItem("supern_ingot",
            new Item(new Item.Settings()));
    public static final Item BLQ_INGOT = registerItem("blq_ingot",
            new Item(new Item.Settings()));
    public static final Item DAR_INGOT = registerItem("dar_ingot",
            new Item(new Item.Settings()));

    public static final Item LAMMOTH_STICK = registerItem("lammoth_stick",
            new Item(new Item.Settings()));

    public static final Item LAMMOTH_STAKE = registerItem("lammoth_stake",
            new LammothStakeItem(new Item.Settings().maxDamage(10)));

    public static final Item GRACIOUS_AMULET_ITEM = registerItem("gracious_amulet_item",
            new GraciousAmuletItem(new Item.Settings().maxDamage(999)));
    public static final Item UNKNOWN_ITEM = registerItem("unknown_item",
            new UnknownItem(new Item.Settings().fireproof().maxDamage(1)));

    public static final Item RESTORATION_SCROLL_ITEM = registerItem("restoration_scroll_item",
            new RestorationScrollItem(new Item.Settings().maxCount(8)));
    public static final Item STRENGTH_SCROLL_ITEM = registerItem("strength_scroll_item",
            new StrengthScrollItem(new Item.Settings().maxCount(8)));
    public static final Item REPAIR_SCROLL_ITEM = registerItem("repair_scroll_item",
            new RepairScrollItem(new Item.Settings().maxCount(8)));
    public static final Item ATTACK_SPEED_SCROLL_ITEM = registerItem("attack_speed_scroll_item",
            new AttackSpeedScrollItem(new Item.Settings().maxCount(8)));
    public static final Item DUPLICATION_SCROLL_ITEM = registerItem("duplication_scroll_item",
            new DuplicationScrollItem(new Item.Settings().maxCount(8)));
    public static final Item MOVEMENT_SPEED_SCROLL_ITEM = registerItem("movement_speed_scroll_item",
            new MovementSpeedScrollItem(new Item.Settings().maxCount(8)));

    public static final Item LINYURDS_RUNES_ITEM = registerItem("linyurds_runes_item",
            new LinyurdsRunesItem(new Item.Settings().maxDamage(256)));

    public static final Item GOLDEN_BAMBOO = registerItem("golden_bamboo",
            new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_BAMBOO)));
    public static final Item CHICKEN_TENDERS = registerItem("chicken_tenders",
            new Item(new Item.Settings().food(ModFoodComponents.CHICKEN_TENDERS)));
    public static final Item CHICKEN_SANDWICH = registerItem("chicken_sandwich",
            new Item(new Item.Settings().food(ModFoodComponents.CHICKEN_SANDWICH)));
    public static final Item CHICKEN_BUCKET = registerItem("chicken_bucket",
            new Item(new Item.Settings().food(ModFoodComponents.CHICKEN_BUCKET)));


    public static final Item CATFISH = registerItem("catfish",
            new Item(new Item.Settings().food(ModFoodComponents.CATFISH)));
    public static final Item COOKED_CATFISH = registerItem("cooked_catfish",
            new Item(new Item.Settings().food(ModFoodComponents.COOKED_CATFISH)));
    public static final Item FRIED_CATFISH = registerItem("fried_catfish",
            new Item(new Item.Settings().food(ModFoodComponents.FRIED_CATFISH)));
    public static final Item SUPERN_CATFISH = registerItem("supern_catfish",
            new Item(new Item.Settings().food(ModFoodComponents.SUPERN_CATFISH)));

    public static Item registerItem (String name, Item item){
    return Registry.register(Registries.ITEM, Identifier.of(ReignOfSped.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ReignOfSped.LOGGER.info("Registering Mod Items for " + ReignOfSped.MOD_ID);
    }
}
