package net.mavity.the_legend_of_wiiu.event;

import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.level.ServerLevel;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.TickEvent;

public class ModEvents {
    @SubscribeEvent
    public void tests(TickEvent.PlayerTickEvent event) {
        //placeholder
        if (event.player.level() instanceof ServerLevel level) {
            level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, event.player.position(), event.player.getRotationVector(), level, 4, event.player.getName().getString(), event.player.getDisplayName(), level.getServer(), event.player), "kill @e");
        }
    }
}