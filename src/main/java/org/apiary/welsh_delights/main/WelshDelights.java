package org.apiary.welsh_delights.main;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.apiary.welsh_delights.block.ModBlocks;
import org.apiary.welsh_delights.item.ModCreativeTabs;
import org.apiary.welsh_delights.item.ModItems;
import org.slf4j.Logger;

@Mod(WelshDelights.MODID)
public class WelshDelights {
    //Mod Constants
    public static final String MODID = "welsh_delights";
    private static final Logger LOGGER = LogUtils.getLogger();

    public WelshDelights(IEventBus modEventBus, ModContainer modContainer) {
        //Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        //Subscribe to additional events on the global NeoForge event bus
        NeoForge.EVENT_BUS.register(this);

        //Register mod config
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        //Common setup code
        LOGGER.info("Welsh Delights Initializing");

    }

    //Server Events
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    //Client Events
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
