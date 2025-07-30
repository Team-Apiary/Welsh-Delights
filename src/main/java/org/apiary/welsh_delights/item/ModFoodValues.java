package org.apiary.welsh_delights.item;

import net.minecraft.world.food.FoodProperties;

import static vectorwing.farmersdelight.common.FoodValues.comfort;
import static vectorwing.farmersdelight.common.FoodValues.nourishment;

public class ModFoodValues {
    //Properties
    public static final FoodProperties LEEK = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.4F).build();
    public static final FoodProperties CAWL = (new FoodProperties.Builder()).nutrition(12).saturationModifier(0.8F).effect(() -> comfort(3600), 1.0F).build();
    public static final FoodProperties OGGIE = (new FoodProperties.Builder()).nutrition(6).saturationModifier(0.8F).build();
    public static final FoodProperties LAVERBREAD = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.5F).build();
    public static final FoodProperties WELSH_BREAKFAST = (new FoodProperties.Builder()).nutrition(14).saturationModifier(0.75F).effect(() -> nourishment(3600), 1.0F).build();
}
