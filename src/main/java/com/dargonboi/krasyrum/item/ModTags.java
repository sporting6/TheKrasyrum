package com.dargonboi.krasyrum.item;

import com.dargonboi.krasyrum.Krasyrum;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static final TagKey<Block> NEEDS_KYRANIUM_TOOL = create("mineable/needs_kyranium_tool");
    public static final TagKey<Block> NEEDS_NANITARIUM_TOOL = create( "mineable/needs_nanitarium_tool");
    public static final TagKey<Block> NEEDS_TITANIUM_TOOL = create("mineable/needs_titanium_tool");
    public static final TagKey<Block> NEEDS_VERANIUM_TOOL = create("mineable/needs_titanium_tool");
    public static final TagKey<Block> NEEDS_RUBY_TOOL = create("mineable/needs_titanium_tool");




    private static TagKey<Block> create(String location) {
        BlockTags.create(new ResourceLocation(Krasyrum.MOD_ID, location));
        return null;
    }


}
