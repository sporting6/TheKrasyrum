package com.dargonboi.krasyrum.item;

import com.dargonboi.krasyrum.Krasyrum;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModTools {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Krasyrum.MOD_ID);


    // Blue Nanitarium Tools
    public static final RegistryObject<SwordItem> BLUE_NANITARIUM_SWORD = ITEMS.register("blue_nanitarium_sword",
            () -> new SwordItem(ModToolTiers.BLUE_NANITARIUM, 13, -2.4F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<PickaxeItem> BLUE_NANITARIUM_PICKAXE = ITEMS.register("blue_nanitarium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BLUE_NANITARIUM, 6, -2.4F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<AxeItem> BLUE_NANITARIUM_AXE = ITEMS.register("blue_nanitarium_axe",
            () -> new AxeItem(ModToolTiers.BLUE_NANITARIUM, 16, -3.0F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<ShovelItem> BLUE_NANITARIUM_SHOVEL = ITEMS.register("blue_nanitarium_shovel",
            () -> new ShovelItem(ModToolTiers.BLUE_NANITARIUM, 4, -2.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<HoeItem> BLUE_NANITARIUM_HOE = ITEMS.register("blue_nanitarium_hoe",
            () -> new HoeItem(ModToolTiers.BLUE_NANITARIUM, 3, -2.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));

    // Kyranium Tools
    public static final RegistryObject<SwordItem> KYRANIUM_SWORD = ITEMS.register("kyranium_sword",
            () -> new SwordItem(ModToolTiers.KYRANIUM, 20, -2.2F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(ModRaritys.INSANE)));
    public static final RegistryObject<PickaxeItem> KYRANIUM_PICKAXE = ITEMS.register("kyranium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.KYRANIUM, 6, -2.6F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(ModRaritys.INSANE)));
    public static final RegistryObject<AxeItem> KYRANIUM_AXE = ITEMS.register("kyranium_axe",
            () -> new AxeItem(ModToolTiers.KYRANIUM, 25, -2.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(ModRaritys.INSANE)));
    public static final RegistryObject<ShovelItem> KYRANIUM_SHOVEL = ITEMS.register("kyranium_shovel",
            () -> new ShovelItem(ModToolTiers.KYRANIUM, 8, -2.6F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(ModRaritys.INSANE)));
    public static final RegistryObject<HoeItem> KYRANIUM_HOE = ITEMS.register("kyranium_hoe",
            () -> new HoeItem(ModToolTiers.KYRANIUM, 5, -2.6F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(ModRaritys.INSANE)));

    public static final RegistryObject<SwordItem> SHARPENED_KYRANIUM_SWORD = ITEMS.register("sharpened_kyranium_sword",
            () -> new SwordItem(ModToolTiers.KYRANIUM, 17, -2.2F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(ModRaritys.INSANE)));

    public static final RegistryObject<AxeItem> SHARPENED_KYRANIUM_AXE = ITEMS.register("sharpened_kyranium_axe",
            () -> new AxeItem(ModToolTiers.KYRANIUM, 22, -2.7F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(ModRaritys.INSANE)));

    // Blue Nanitarium Multi-Tools
    // public static final RegistryObject<> BLUE_NANITARIUM_PICK_SHOVEL =
    // ITEMS.register("blue_nanitarium_pick_shovel",
    // () -> new HoeItem(ModToolMaterials.BLUE_NANITARIUM, 7, -2.8F,
    // new
    // Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));

    // Red Nanitarium Tools
    public static final RegistryObject<SwordItem> RED_NANITARIUM_SWORD = ITEMS.register("red_nanitarium_sword",
            () -> new SwordItem(ModToolTiers.RED_NANITARIUM, 11, -2.3F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<PickaxeItem> RED_NANITARIUM_PICKAXE = ITEMS.register("red_nanitarium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RED_NANITARIUM, 5, -2.7F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<AxeItem> RED_NANITARIUM_AXE = ITEMS.register("red_nanitarium_axe",
            () -> new AxeItem(ModToolTiers.RED_NANITARIUM, 14, -2.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<ShovelItem> RED_NANITARIUM_SHOVEL = ITEMS.register("red_nanitarium_shovel",
            () -> new ShovelItem(ModToolTiers.RED_NANITARIUM, 5, -2.7F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<HoeItem> RED_NANITARIUM_HOE = ITEMS.register("red_nanitarium_hoe",
            () -> new HoeItem(ModToolTiers.RED_NANITARIUM, 2, -2.6F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));

    // Veranium Tools
    public static final RegistryObject<SwordItem> VERANIUM_SWORD = ITEMS.register("veranium_sword",
            () -> new SwordItem(ModToolTiers.VERANIUM, 8, -1.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<PickaxeItem> VERANIUM_PICKAXE = ITEMS.register("veranium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VERANIUM, 6, -2.0F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<AxeItem> VERANIUM_AXE = ITEMS.register("veranium_axe",
            () -> new AxeItem(ModToolTiers.VERANIUM, 10, -2.4F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<ShovelItem> VERANIUM_SHOVEL = ITEMS.register("veranium_shovel",
            () -> new ShovelItem(ModToolTiers.VERANIUM, 5, -2.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<HoeItem> VERANIUM_HOE = ITEMS.register("veranium_hoe",
            () -> new HoeItem(ModToolTiers.VERANIUM, 3, -2.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR).fireResistant().rarity(Rarity.RARE)));

    // Titanium Tools
    public static final RegistryObject<SwordItem> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModToolTiers.TITANIUM, 5, -2.6F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
    public static final RegistryObject<PickaxeItem> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TITANIUM, 3, -2.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
    public static final RegistryObject<AxeItem> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModToolTiers.TITANIUM, 8, -2.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
    public static final RegistryObject<ShovelItem> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModToolTiers.TITANIUM, 5, -2.6F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
    public static final RegistryObject<HoeItem> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModToolTiers.TITANIUM, 2, -0.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));

    //Ruby Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 6, -2.6F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 4, -2.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 8, -2.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 5, -2.6F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, 3, -0.8F,
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_TOOLS_ARMOR)));



    public static void Register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
