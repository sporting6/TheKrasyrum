package com.dargonboi.krasyrum.item; 

import com.dargonboi.krasyrum.Krasyrum;
import com.dargonboi.krasyrum.block.custom.PineappleCropBlock;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFoods {
	
	
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Krasyrum.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,Krasyrum.MOD_ID);
    
    public static final RegistryObject<Block> PINEAPPLE_CROP = BLOCKS.register("pineapple_crop",
            () -> new PineappleCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    
    
    public static final RegistryObject<Item> PINEAPPLE_SEEDS = ITEMS.register("pineapple_seeds",
            () -> new ItemNameBlockItem(PINEAPPLE_CROP.get(),
                    new Item.Properties().tab(ModCreativeTab.KRASYRUM_FOODS)));

    public static final RegistryObject<Item> PINEAPPLE_SLICE = ITEMS.register("pineapple_slice",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_FOODS)
                    .food(new FoodProperties.Builder().nutrition(3).saturationMod(2f).build())));
    
    public static final RegistryObject<Item> PINEAPPLE = ITEMS.register("pineapple",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_FOODS)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));


    public static final RegistryObject<Item> BLUE_NANITARIUM_APPLE = ITEMS.register("blue_nanitarium_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_FOODS).fireResistant()
                    .rarity(Rarity.EPIC)
                    .food(new FoodProperties.Builder().alwaysEat().nutrition(5).saturationMod(1.5F).fast()
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12000, 4), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 6), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 1), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3000, 4), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 400, 1), .1f)
                            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 6000, 2), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), 1).build())));
    public static final RegistryObject<Item> RED_NANITARIUM_APPLE = ITEMS.register("red_nanitarium_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_FOODS).fireResistant()
                    .rarity(Rarity.EPIC)
                    .food(new FoodProperties.Builder().alwaysEat().nutrition(5).saturationMod(1.5F).fast()
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12000, 4), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 6), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 1), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 3000, 4), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 400, 1), .1f)
                            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 6000, 2), 1)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), 1).build())));
    public static final RegistryObject<Item> HASTEY_APPLE = ITEMS
            .register("hastey_apple",
                    () -> new Item(new Item.Properties().tab(ModCreativeTab.KRASYRUM_FOODS).fireResistant()
                            .rarity(Rarity.EPIC)
                            .food(new FoodProperties.Builder().alwaysEat().nutrition(5).saturationMod(1.5F).fast()
                                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 24000, 2), 1)
                                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 24000, 2), 1).build())));
    
    
    public static void Register(IEventBus eventBus){
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);

        
    }

}
