package cn.whitrayhb.celecraft.dash;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class Dash {
    private static final double length = 1.5;
    public static int count = 1;
    public static int countCoolDown = 0;
    public static void dash(MinecraftClient client){
        assert client.player != null;
        if(count != 0) {
            double yaw = Math.toRadians(client.player.getYaw() * -1);
            double pitch = Math.toRadians(client.player.getPitch() * -1);
            double deltaX = length * Math.sin(yaw) * Math.cos(pitch);
            double deltaY = length * Math.sin(pitch);
            double deltaZ = length * Math.cos(yaw) * Math.cos(pitch);
            client.player.addVelocity(deltaX, 0.5 * deltaY + 0.25, deltaZ);
            count--;
            countCoolDown = 5;
        }
    }
}
