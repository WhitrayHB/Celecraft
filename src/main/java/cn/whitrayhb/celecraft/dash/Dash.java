package cn.whitrayhb.celecraft.dash;

import net.minecraft.client.MinecraftClient;

public class Dash {
    private static final double length = 2;
    public static void dash(MinecraftClient client){
        double yaw = client.player.getYaw()*-1;
        double pitch = client.player.getPitch();
        double deltaX = (length * Math.sin(yaw) * Math.abs(Math.cos(pitch)));
        double deltaY = (length * Math.sin(pitch));
        double deltaZ = (length * Math.cos(yaw) * Math.abs(Math.cos(pitch)));
        
        client.player.addVelocity(deltaX,0,deltaZ);
    }
}
