package org.apiary.welsh_delights.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apiary.welsh_delights.block.custom.BakeStoneBlock;
import org.apiary.welsh_delights.block.custom.LeekBlock;
import org.apiary.welsh_delights.item.ModFoodValues;
import org.apiary.welsh_delights.item.ModItems;
import org.apiary.welsh_delights.main.WelshDelights;
import vectorwing.farmersdelight.common.block.WildCropBlock;

public class ModBlocks {
    //Register
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(WelshDelights.MODID);

    //Blocks
    //Leek Blocks
    public static final DeferredBlock<Block> LEEK_CRATE = BLOCKS.registerSimpleBlock("leek_crate", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final DeferredHolder<Block, WildCropBlock> WILD_LEEKS =
            BLOCKS.register("wild_leeks", () -> new WildCropBlock(MobEffects.FIRE_RESISTANCE, 6,BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).mapColor(MapColor.COLOR_GREEN)));
    public static final DeferredHolder<Block, LeekBlock> LEEK_CROP =
            BLOCKS.register("leeks", () -> new LeekBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).mapColor(MapColor.COLOR_GREEN)));
    //Bake Stone
    public static final DeferredHolder<Block, BakeStoneBlock> BAKE_STONE =
            BLOCKS.register("bake_stone", () -> new BakeStoneBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.COLOR_GRAY).noOcclusion()));

    //Block Items
    //Leek Blocks
    public static final DeferredItem<BlockItem> LEEK_CRATE_ITEM = ModItems.ITEMS.registerSimpleBlockItem("leek_crate", LEEK_CRATE);
    public static final DeferredItem<BlockItem> WILD_LEEKS_ITEM = ModItems.ITEMS.registerSimpleBlockItem("wild_leeks", WILD_LEEKS);
    public static final DeferredItem<BlockItem> LEEK = ModItems.ITEMS.registerSimpleBlockItem("leek", LEEK_CROP, new Item.Properties().food(ModFoodValues.LEEK));
    //Bake Stone
    public static final DeferredItem<BlockItem> BAKE_STONE_ITEM = ModItems.ITEMS.registerSimpleBlockItem("bake_stone", BAKE_STONE);
}
