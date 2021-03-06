package com.dargonboi.krasyrum.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {

    public static final CreativeModeTab KRASYRUM_MATERIALS = new CreativeModeTab("krasyrum_materials") {

        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModIngots.BLUE_NANITARIUM_INGOT.get());
        }

    };
    
    public static final CreativeModeTab KRASYRUM_FOODS = new CreativeModeTab("krasyrum_foods") {

        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModFoods.PINEAPPLE.get());
        }

    };

    public static final CreativeModeTab KRASYRUM_TOOLS_ARMOR = new CreativeModeTab("krasyrum_tools_armor") {

        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModTools.KYRANIUM_PICKAXE.get());
        }

    };


}
