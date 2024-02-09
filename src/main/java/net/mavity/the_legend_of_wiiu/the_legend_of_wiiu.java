package net.mavity.the_legend_of_wiiu;

import com.mojang.logging.LogUtils;
import net.mavity.the_legend_of_wiiu.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.ItemLike;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(the_legend_of_wiiu.MODID)
public class the_legend_of_wiiu
{

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, the_legend_of_wiiu.MODID);

    public static final List<Supplier<? extends ItemLike>> ITEM_TAB = new ArrayList<>();
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BLABLABLA = TABS.register("words", () -> CreativeModeTab.builder()
            .title(Component.literal("TLOW")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.GREEN_RUPEE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.GREEN_RUPEE.get());
                output.accept(ModItems.BLUE_RUPEE.get());
                output.accept(ModItems.YELLOW_RUPEE.get());
                output.accept(ModItems.RED_RUPEE.get());
                output.accept(ModItems.PURPLE_RUPEE.get());
                output.accept(ModItems.SILVER_RUPEE.get());
                output.accept(ModItems.GOLD_RUPEE.get());
                output.accept(ModItems.ROYAL_GUARDS_SWORD.get());
            }).build());

    // Define mod id in a common place for everything to reference
    public static final String MODID = "the_legend_of_wiiu";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public the_legend_of_wiiu(IEventBus modEventBus)
    {

        ModItems.register(modEventBus);
        TABS.register(modEventBus);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);


    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");


    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
