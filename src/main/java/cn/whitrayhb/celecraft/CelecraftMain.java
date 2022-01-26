package cn.whitrayhb.celecraft;

import cn.whitrayhb.celecraft.item.Strawberry;
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
	public static final Item STRAWBERRY = new Strawberry(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1).rarity((Rarity.COMMON)));
	public static final Item GOLDENBERRY = new Item(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1).rarity(Rarity.UNCOMMON));
	public static final Item MOONBERRY = new Item(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1).rarity(Rarity.RARE));
	/*SoundEvents*/
	public static final Identifier STRAWBERRY_GET_1000_ID = new Identifier("celecraft:strawberry_get_1000");
	public static SoundEvent STRAWBERRY_GET_1000 = new SoundEvent(STRAWBERRY_GET_1000_ID);

	@Override
	public void onInitialize(){
		CELECRAFT.info("Welcome to Celecraft World!");
		Registry.register(Registry.ITEM,new Identifier("celecraft","strawberry"),STRAWBERRY);
		Registry.register(Registry.ITEM,new Identifier("celecraft","goldenberry"),GOLDENBERRY);
		Registry.register(Registry.ITEM,new Identifier("celecraft","moonberry"),MOONBERRY);
		Registry.register(Registry.SOUND_EVENT,STRAWBERRY_GET_1000_ID,STRAWBERRY_GET_1000);
	}
}
