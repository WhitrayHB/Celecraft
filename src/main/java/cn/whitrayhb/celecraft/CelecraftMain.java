package cn.whitrayhb.celecraft;

import cn.whitrayhb.celecraft.item.Berry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CelecraftMain implements ModInitializer {
	public static final Logger CELECRAFT = LogManager.getLogger("celecraft");

	/*ItemGroups*/
	public static ItemGroup CELECRAFT_ITEM_GROUP = FabricItemGroupBuilder
			.create(new Identifier("celecraft","general"))
			.icon(()->new ItemStack(CelecraftMain.STRAWBERRY))
			.build();
	/*Items*/
	public static final Item STRAWBERRY = new Berry(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1).rarity((Rarity.COMMON)),"strawberry");
	public static final Item GOLDENBERRY = new Berry(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1).rarity(Rarity.UNCOMMON),"goldenberry");
	public static final Item MOONBERRY = new Berry(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1).rarity(Rarity.RARE),"moonberry");
	/*SoundEvents*/
	public static final Identifier STRAWBERRY_GET_1000_ID = new Identifier("celecraft:strawberry_get_1000");
	public static SoundEvent STRAWBERRY_GET_1000 = new SoundEvent(STRAWBERRY_GET_1000_ID);
	public static final Identifier STRAWBERRY_GET_2000_ID = new Identifier("celecraft:strawberry_get_2000");
	public static SoundEvent STRAWBERRY_GET_2000 = new SoundEvent(STRAWBERRY_GET_2000_ID);
	public static final Identifier STRAWBERRY_GET_3000_ID = new Identifier("celecraft:strawberry_get_3000");
	public static SoundEvent STRAWBERRY_GET_3000 = new SoundEvent(STRAWBERRY_GET_3000_ID);
	public static final Identifier STRAWBERRY_GET_4000_ID = new Identifier("celecraft:strawberry_get_4000");
	public static SoundEvent STRAWBERRY_GET_4000 = new SoundEvent(STRAWBERRY_GET_4000_ID);
	public static final Identifier STRAWBERRY_GET_5000_ID = new Identifier("celecraft:strawberry_get_5000");
	public static SoundEvent STRAWBERRY_GET_5000 = new SoundEvent(STRAWBERRY_GET_5000_ID);
	public static final Identifier STRAWBERRY_GET_1up_ID = new Identifier("celecraft:strawberry_get_1up");
	public static SoundEvent STRAWBERRY_GET_1up = new SoundEvent(STRAWBERRY_GET_1up_ID);
	public static final Identifier GOLDENBERRY_GET_1000_ID = new Identifier("celecraft:goldenberry_get_1000");
	public static SoundEvent GOLDENBERRY_GET_1000 = new SoundEvent(GOLDENBERRY_GET_1000_ID);
	public static final Identifier GOLDENBERRY_GET_2000_ID = new Identifier("celecraft:goldenberry_get_2000");
	public static SoundEvent GOLDENBERRY_GET_2000 = new SoundEvent(GOLDENBERRY_GET_2000_ID);
	public static final Identifier GOLDENBERRY_GET_3000_ID = new Identifier("celecraft:goldenberry_get_3000");
	public static SoundEvent GOLDENBERRY_GET_3000 = new SoundEvent(GOLDENBERRY_GET_3000_ID);
	public static final Identifier GOLDENBERRY_GET_4000_ID = new Identifier("celecraft:goldenberry_get_4000");
	public static SoundEvent GOLDENBERRY_GET_4000 = new SoundEvent(GOLDENBERRY_GET_4000_ID);
	public static final Identifier GOLDENBERRY_GET_5000_ID = new Identifier("celecraft:goldenberry_get_5000");
	public static SoundEvent GOLDENBERRY_GET_5000 = new SoundEvent(GOLDENBERRY_GET_5000_ID);
	public static final Identifier GOLDENBERRY_GET_1up_ID = new Identifier("celecraft:goldenberry_get_1up");
	public static SoundEvent GOLDENBERRY_GET_1up = new SoundEvent(GOLDENBERRY_GET_1up_ID);
	public static final Identifier MOONBERRY_GET_ID = new Identifier("celecraft:moonberry_get");
	public static SoundEvent MOONBERRY_GET = new SoundEvent(MOONBERRY_GET_ID);
	@Override
	public void onInitialize(){
		CELECRAFT.info("Welcome to Celecraft World!");
		/*Item*/
		Registry.register(Registry.ITEM,new Identifier("celecraft","strawberry"),STRAWBERRY);
		Registry.register(Registry.ITEM,new Identifier("celecraft","goldenberry"),GOLDENBERRY);
		Registry.register(Registry.ITEM,new Identifier("celecraft","moonberry"),MOONBERRY);
		/*SoundEvent*/
		Registry.register(Registry.SOUND_EVENT,STRAWBERRY_GET_1000_ID,STRAWBERRY_GET_1000);
		Registry.register(Registry.SOUND_EVENT,STRAWBERRY_GET_2000_ID,STRAWBERRY_GET_2000);
		Registry.register(Registry.SOUND_EVENT,STRAWBERRY_GET_3000_ID,STRAWBERRY_GET_3000);
		Registry.register(Registry.SOUND_EVENT,STRAWBERRY_GET_4000_ID,STRAWBERRY_GET_4000);
		Registry.register(Registry.SOUND_EVENT,STRAWBERRY_GET_5000_ID,STRAWBERRY_GET_5000);
		Registry.register(Registry.SOUND_EVENT,STRAWBERRY_GET_1up_ID,STRAWBERRY_GET_1up);
		Registry.register(Registry.SOUND_EVENT,GOLDENBERRY_GET_1000_ID,GOLDENBERRY_GET_1000);
		Registry.register(Registry.SOUND_EVENT,GOLDENBERRY_GET_2000_ID,GOLDENBERRY_GET_2000);
		Registry.register(Registry.SOUND_EVENT,GOLDENBERRY_GET_3000_ID,GOLDENBERRY_GET_3000);
		Registry.register(Registry.SOUND_EVENT,GOLDENBERRY_GET_4000_ID,GOLDENBERRY_GET_4000);
		Registry.register(Registry.SOUND_EVENT,GOLDENBERRY_GET_5000_ID,GOLDENBERRY_GET_5000);
		Registry.register(Registry.SOUND_EVENT,GOLDENBERRY_GET_1up_ID,GOLDENBERRY_GET_1up);
		Registry.register(Registry.SOUND_EVENT,MOONBERRY_GET_ID,MOONBERRY_GET);
	}
}
