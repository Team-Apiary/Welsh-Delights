package org.apiary.welsh_delights.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apiary.welsh_delights.block.ModBlocks;
import org.apiary.welsh_delights.main.WelshDelights;

public class ModCreativeTabs {
    //Register
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WelshDelights.MODID);

    //Creative Tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WELSH_DELIGHTS_TAB = CREATIVE_MODE_TABS.register("welsh_delights_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.welsh_delights")).icon(() -> ModBlocks.LEEK.get().getDefaultInstance()).displayItems((parameters, output) -> {
        //Blocks
        output.accept(ModBlocks.BAKE_STONE_ITEM.get());
        output.accept(ModBlocks.LEEK_CRATE_ITEM.get());
        //Wild Crops
        output.accept(ModBlocks.WILD_LEEKS_ITEM.get());
        //Crops
        output.accept(ModBlocks.LEEK.get());
        //Cooked Foods
        //Leek Foods
        output.accept(ModItems.CAWL.get());
        output.accept(ModItems.OGGIE.get());
        //Welsh Cakes
        //Misc Foods
        output.accept(ModItems.LAVERBREAD.get());
        output.accept(ModItems.WELSH_BREAKFAST.get());
    }).build());
}
