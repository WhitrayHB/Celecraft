package cn.whitrayhb.celecraft.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class CelecraftBlocks {
    public static final Block MOON_STONE = new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f));
    public static final Block MOON_COBBLESTONE = new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f));

}
