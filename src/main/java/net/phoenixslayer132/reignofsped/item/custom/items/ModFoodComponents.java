package net.phoenixslayer132.reignofsped.item.custom.items;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent GOLDEN_BAMBOO = new FoodComponent.Builder().nutrition(20).saturationModifier(1.4f).alwaysEdible().snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,6000, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 6000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 6000, 2), 1.0f)
            .build();

    public static final FoodComponent CHICKEN_TENDERS = new FoodComponent.Builder().nutrition(8).saturationModifier(0.9f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 60, 0), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 1.0f)
            .build();

    public static final FoodComponent CHICKEN_SANDWICH = new FoodComponent.Builder().nutrition(10).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 0), 0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 60, 0), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 1), 1.0f)
            .build();
    public static final FoodComponent CHICKEN_BUCKET = new FoodComponent.Builder().nutrition(24).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 0), 0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 60, 1), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2000, 0), 1.0f)
            .build();
    public static final FoodComponent CATFISH = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f)
            .build();
    public static final FoodComponent COOKED_CATFISH = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6f)
            .build();
    public static final FoodComponent FRIED_CATFISH = new FoodComponent.Builder().nutrition(6).saturationModifier(0.8f)
            .build();
    public static final FoodComponent SUPERN_CATFISH = new FoodComponent.Builder().nutrition(14).saturationModifier(1.4f).alwaysEdible().snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,6000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 6000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 6000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 6000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 6000, 0), 1.0f)
            .build();
}
