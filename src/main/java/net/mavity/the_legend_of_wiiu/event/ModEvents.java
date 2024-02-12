package net.mavity.the_legend_of_wiiu.event;

import net.mavity.the_legend_of_wiiu.util.KeyBindings;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.TickEvent;

public class ModEvents {
    @SubscribeEvent
    public void tests(TickEvent.PlayerTickEvent event) {
        if(KeyBindings.TARGET.consumeClick()) {
            //placeholder
            //The string format is modid:tagname
            //Check if the entity has the tag we want, else add it
            if(event.player.getTags().contains("snapto")) {
                //If it has the tag, remove it from the entity
                event.player.removeTag("snapto");
            }
            else event.player.addTag("snapto");
            //Add the tag only if the entity does not have it
        }
    }

}