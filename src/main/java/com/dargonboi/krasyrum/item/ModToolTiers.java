package com.dargonboi.krasyrum.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {

    public static final Tier KYRANIUM = new ForgeTier(7, 3500, 16f,
            2, 17, ModTags.NEEDS_KYRANIUM_TOOL,
            () -> Ingredient.of(ModIngots.KYRANIUM_INGOT.get()));

    public static final Tier VERANIUM = new ForgeTier(2, 1000, 250f,
            2, 50, ModTags.NEEDS_VERANIUM_TOOL,
            null);

    public static final Tier TITANIUM = new ForgeTier(3, 500, 7f,
            0, 13, ModTags.NEEDS_TITANIUM_TOOL,
            () -> Ingredient.of(ModIngots.TITANIUM_INGOT.get()));

    public static final Tier RUBY = new ForgeTier(3, 700, 12f,
            0, 25, ModTags.NEEDS_RUBY_TOOL,
            () -> Ingredient.of(ModIngots.RUBY.get()));

    public static final Tier RED_NANITARIUM = new ForgeTier(6, 2200, 10f,
            0, 13, ModTags.NEEDS_NANITARIUM_TOOL,
            () -> Ingredient.of(ModIngots.RED_NANITARIUM_INGOT.get()));
    public static final Tier BLUE_NANITARIUM = new ForgeTier(6, 2600, 14f,
            0, 18, ModTags.NEEDS_NANITARIUM_TOOL,
            () -> Ingredient.of(ModIngots.BLUE_NANITARIUM_INGOT.get()));
}

