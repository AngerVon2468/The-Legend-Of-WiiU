package net.mavity.the_legend_of_wiiu.propertymanager;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class PropertyInit {
    public static final BlockBehaviour.Properties TLOWCROPBLOCK = BlockBehaviour.Properties.of()
            .noOcclusion()
            .noCollission()
            .instabreak()
            .explosionResistance(0.6f)
            .sound(SoundType.CROP)
            .replaceable()
            .strength(0.1f);
    public static final Item.Properties RUPEETYPE =
            new Item.Properties().durability(0).stacksTo(64);
}