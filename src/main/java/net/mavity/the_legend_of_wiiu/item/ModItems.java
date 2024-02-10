package net.mavity.the_legend_of_wiiu.item;

import net.mavity.the_legend_of_wiiu.the_legend_of_wiiu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(the_legend_of_wiiu.MODID);

    public static final DeferredItem<Item> BLUE_RUPEE = ITEMS.register("blue_rupee",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GREEN_RUPEE = ITEMS.register("green_rupee",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> YELLOW_RUPEE = ITEMS.register("yellow_rupee",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RED_RUPEE = ITEMS.register("red_rupee",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PURPLE_RUPEE = ITEMS.register("purple_rupee",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SILVER_RUPEE = ITEMS.register("silver_rupee",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GOLD_RUPEE = ITEMS.register("gold_rupee",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ROYAL_GUARDS_SWORD = ITEMS.register("royal_guards_sword",
            () -> new SwordItem(Tiers.WOOD, 7, -2.4f,
                    new Item.Properties()));

    public static final DeferredItem<Item> THE_MASTER_SWORD = ITEMS.register("the_master_sword",
            () -> new SwordItem(Tiers.DIAMOND, 10, -2.4f,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}