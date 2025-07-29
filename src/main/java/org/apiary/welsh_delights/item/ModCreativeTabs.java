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
        output.accept(ModBlocks.LEEK_CRATE_ITEM.get());
        output.accept(ModBlocks.WILD_LEEKS_ITEM.get());
        output.accept(ModBlocks.LEEK.get());
        output.accept(ModItems.CAWL.get());
    }).build());
}
