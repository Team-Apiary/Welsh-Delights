package org.apiary.welsh_delights.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apiary.welsh_delights.main.WelshDelights;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import static vectorwing.farmersdelight.common.FoodValues.comfort;
import static vectorwing.farmersdelight.common.registry.ModItems.bowlFoodItem;

public class ModItems {
    //Register
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WelshDelights.MODID);

    //Items
    public static final DeferredHolder<Item, ConsumableItem> CAWL = ITEMS.register("cawl", () -> new ConsumableItem(bowlFoodItem(ModFoodValues.CAWL), true));
}
