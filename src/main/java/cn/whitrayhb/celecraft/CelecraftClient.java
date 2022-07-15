package cn.whitrayhb.celecraft;
import cn.whitrayhb.celecraft.dash.Dash;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class CelecraftClient implements ClientModInitializer {


    private static KeyBinding dashKey;
    @Override
    public void onInitializeClient() {
        dashKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.celecraft.dash",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_R,
                "Celecraft"));
        ClientTickEvents.END_CLIENT_TICK.register(this::tick);
    }

    public void tick(MinecraftClient client){
        if(dashKey.wasPressed()&&client.player!=null){
            Dash.dash(client);
        }
    }
}