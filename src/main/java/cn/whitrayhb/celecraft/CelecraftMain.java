package cn.whitrayhb.celecraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CelecraftMain implements ModInitializer {
	public static final Logger CELECRAFT = LogManager.getLogger("celecraft");

	/*ItemGroup*/
	public static ItemGroup CELECRAFT_ITEM_GROUP = FabricItemGroupBuilder
			.create(new Identifier("celecraft","general"))
			.icon(()->new ItemStack(CelecraftMain.STRAWBERRY))
			.build();
	/*Items*/
	public static final Item STRAWBERRY = new Item(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1));
	public static final Item GOLDENBERRY = new Item(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1));
	public static final Item MOONBERRY = new Item(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1));

	@Override
	public void onInitialize() {
		CELECRAFT.info("Welcome to Celecraft World!");
		Registry.register(Registry.ITEM,new Identifier("celecraft","strawberry"),STRAWBERRY);
		Registry.register(Registry.ITEM,new Identifier("celecraft","goldenberry"),GOLDENBERRY);
		Registry.register(Registry.ITEM,new Identifier("celecraft","moonberry"),MOONBERRY);
	}

}
