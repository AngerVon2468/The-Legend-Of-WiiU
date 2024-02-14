package net.mavity.the_legend_of_wiiu.block;

import net.mavity.the_legend_of_wiiu.the_legend_of_wiiu;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.mavity.the_legend_of_wiiu.item.ModItems.ITEMS;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(the_legend_of_wiiu.MODID);
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    // Creates a new BlockItem with the id "the_legend_of_wiiu:example_block", combining the namespace and path
    public static final DeferredBlock<Block> PED_WITH_MS = BLOCKS.registerSimpleBlock("ped_with_ms", BlockBehaviour.Properties.of().noOcclusion().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("example_block", EXAMPLE_BLOCK);
    public static final DeferredItem<BlockItem> PED_WITH_MS_ITEM = ITEMS.registerSimpleBlockItem("ped_with_ms", PED_WITH_MS);
    //Registers an item for the block so you don't crash when it's in your inventory
}