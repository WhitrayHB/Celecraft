package cn.whitrayhb.celecraft;

import cn.whitrayhb.celecraft.block.CelecraftBlocks;
import cn.whitrayhb.celecraft.item.CelecraftItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CelecraftRegistry {
    private static Item celecraftRegister(Identifier id, Item item) {
        return Registry.register(Registry.ITEM, id, item);
    }
    private static Block celecraftRegister(Identifier id, Block block) {
        return Registry.register(Registry.BLOCK,id,block);
    }
    private static SoundEvent celecraftRegister(Identifier id, SoundEvent se) {
        return Registry.register(Registry.SOUND_EVENT,id,se);
    }
    public static void celecraftRegisterAll(){
        celecraftRegisterItemAll();
        celecraftRegisterBlockAll();
        celecraftRegisterSoundEventAll();
    }
    public static void celecraftRegisterItemAll(){
        celecraftRegister(new Identifier("celecraft:strawberry"),CelecraftItems.STRAWBERRY);
        celecraftRegister(new Identifier("celecraft:goldenberry"),CelecraftItems.GOLDENBERRY);
        celecraftRegister(new Identifier("celecraft:moonberry"),CelecraftItems.MOONBERRY);
    }
    public static void celecraftRegisterBlockAll(){
        celecraftRegister(new Identifier("celecraft:moon_stone"),CelecraftBlocks.MOON_STONE);
        celecraftRegister(new Identifier("celecraft:moon_stone"),new BlockItem(CelecraftBlocks.MOON_STONE,new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP)));
        celecraftRegister(new Identifier("celecraft:moon_cobblestone"),CelecraftBlocks.MOON_COBBLESTONE);
        celecraftRegister(new Identifier("celecraft:moon_cobblestone"),new BlockItem(CelecraftBlocks.MOON_COBBLESTONE,new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP)));
        celecraftRegister(new Identifier("celecraft:iron_scaffold"),CelecraftBlocks.IRON_SCAFFOLD);
        celecraftRegister(new Identifier("celecraft:iron_scaffold"),new BlockItem(CelecraftBlocks.IRON_SCAFFOLD,new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP)));
        celecraftRegister(new Identifier("celecraft:gray_stone"),CelecraftBlocks.GRAY_STONE);
        celecraftRegister(new Identifier("celecraft:gray_stone"),new BlockItem(CelecraftBlocks.GRAY_STONE,new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP)));
    }
    public static void celecraftRegisterSoundEventAll(){

        celecraftRegister(CelecraftSounds.STRAWBERRY_GET_1000_ID,CelecraftSounds.STRAWBERRY_GET_1000);
        celecraftRegister(CelecraftSounds.STRAWBERRY_GET_2000_ID,CelecraftSounds.STRAWBERRY_GET_2000);
        celecraftRegister(CelecraftSounds.STRAWBERRY_GET_3000_ID,CelecraftSounds.STRAWBERRY_GET_3000);
        celecraftRegister(CelecraftSounds.STRAWBERRY_GET_4000_ID,CelecraftSounds.STRAWBERRY_GET_4000);
        celecraftRegister(CelecraftSounds.STRAWBERRY_GET_5000_ID,CelecraftSounds.STRAWBERRY_GET_5000);
        celecraftRegister(CelecraftSounds.STRAWBERRY_GET_1up_ID,CelecraftSounds.STRAWBERRY_GET_1up);
        celecraftRegister(CelecraftSounds.GOLDENBERRY_GET_1000_ID,CelecraftSounds.GOLDENBERRY_GET_1000);
        celecraftRegister(CelecraftSounds.GOLDENBERRY_GET_2000_ID,CelecraftSounds.GOLDENBERRY_GET_2000);
        celecraftRegister(CelecraftSounds.GOLDENBERRY_GET_3000_ID,CelecraftSounds.GOLDENBERRY_GET_3000);
        celecraftRegister(CelecraftSounds.GOLDENBERRY_GET_4000_ID,CelecraftSounds.GOLDENBERRY_GET_4000);
        celecraftRegister(CelecraftSounds.GOLDENBERRY_GET_5000_ID,CelecraftSounds.GOLDENBERRY_GET_5000);
        celecraftRegister(CelecraftSounds.GOLDENBERRY_GET_1up_ID,CelecraftSounds.GOLDENBERRY_GET_1up);
        celecraftRegister(CelecraftSounds.MOONBERRY_GET_ID,CelecraftSounds.MOONBERRY_GET);
    }
}
