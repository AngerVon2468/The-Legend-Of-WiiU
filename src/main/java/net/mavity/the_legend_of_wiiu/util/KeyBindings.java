package net.mavity.the_legend_of_wiiu.util;

import net.mavity.the_legend_of_wiiu.the_legend_of_wiiu;
import net.minecraft.client.KeyMapping;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static KeyMapping TARGET;
    public static void keyBind(RegisterKeyMappingsEvent e) {
        TARGET = new KeyMapping("key." + the_legend_of_wiiu.MODID + ".target", GLFW.GLFW_KEY_TAB, "key.categories." + the_legend_of_wiiu.MODID);
        e.register(TARGET);
    }
}