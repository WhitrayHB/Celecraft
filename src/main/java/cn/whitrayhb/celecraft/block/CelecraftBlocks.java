package cn.whitrayhb.celecraft.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class CelecraftBlocks {
    /*Stone*/
    public static final Block MOON_STONE = new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f));
    public static final Block MOON_COBBLESTONE = new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f));
    public static final Block GRAY_STONE = new Block(FabricBlockSettings.of(Material.STONE).hardness(1.5f));
    /*IDK*/
    public static final Block IRON_SCAFFOLD =new Block(FabricBlockSettings.of(Material.METAL).hardness(2.0f));
    /*Ores*/
    public static final Block DEEPSLATE_CELEFRAGMENT_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(3.5f));
    public static final Block CELEFRAGMENT_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0f));
}
