package org.apiary.welsh_delights.item;

import net.minecraft.world.food.FoodProperties;

import static vectorwing.farmersdelight.common.FoodValues.comfort;

public class ModFoodValues {
    //Properties
    public static final FoodProperties LEEK = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.4F).build();
    public static final FoodProperties CAWL = (new FoodProperties.Builder()).nutrition(12).saturationModifier(0.8F).effect(() -> comfort(3600), 1.0F).build();
}
