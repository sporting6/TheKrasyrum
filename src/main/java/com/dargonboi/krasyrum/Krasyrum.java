package com.dargonboi.krasyrum;

import com.dargonboi.krasyrum.block.ModBlocks;
import com.dargonboi.krasyrum.block.ModOres;
import com.dargonboi.krasyrum.item.ModBlockItem;
import com.dargonboi.krasyrum.item.ModIngots;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Krasyrum.MOD_ID)
public class Krasyrum {
    public static final String MOD_ID = "krasyrum";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Krasyrum() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModIngots.Register(modEventBus);
        ModBlockItem.Register(modEventBus);

        ModBlocks.Register(modEventBus);
        ModOres.Register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

        });

    }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }


    }
}