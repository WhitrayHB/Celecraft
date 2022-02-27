package cn.whitrayhb.celecraft;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.impl.client.keybinding.KeyBindingRegistryImpl;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.LiteralText;
import net.minecraft.util.registry.Registry;
import org.lwjgl.glfw.GLFW;

public class CelecraftClient implements ClientModInitializer {
   /* private static KeyBinding dash = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.celecraft.dash",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_Z,
            "category.celecraft.dash"
    ));
    咕了咕了他丫的
    这按键绑定不需要注册？
    */
    @Override
    public void onInitializeClient() {
    }
}