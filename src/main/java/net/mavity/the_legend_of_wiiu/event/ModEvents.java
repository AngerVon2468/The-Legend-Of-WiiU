package net.mavity.the_legend_of_wiiu.event;

import net.mavity.the_legend_of_wiiu.util.KeyBindings;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.level.ServerLevel;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.TickEvent;

public class ModEvents {
    @SubscribeEvent
    public void tests(TickEvent.PlayerTickEvent event) {
        if(KeyBindings.TARGET.consumeClick()) {

        }
    }

}