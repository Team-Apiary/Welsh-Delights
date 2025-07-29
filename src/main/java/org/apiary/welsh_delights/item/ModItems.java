package org.apiary.welsh_delights.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apiary.welsh_delights.main.WelshDelights;

import static vectorwing.farmersdelight.common.FoodValues.comfort;

public class ModItems {
    //Register
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WelshDelights.MODID);

    //Items
    public static final DeferredItem<Item> CAWL = ITEMS.registerSimpleItem("cawl", new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationModifier(0.8F).effect(() -> comfort(3600), 1.0F).build()));
}
