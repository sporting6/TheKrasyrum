package com.dargonboi.krasyrum.world.feature;

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.block.ModBlocks;
import com.dargonboi.krasyrum.block.ModOres;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Krasyrum.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> RUBY_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModOres.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModOres.DEEPSLATE_RUBY_ORE.get().defaultBlockState())));



    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE = CONFIGURED_FEATURES.register("ruby_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(RUBY_ORES.get(),4)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}

