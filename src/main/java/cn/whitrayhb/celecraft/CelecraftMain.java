package cn.whitrayhb.celecraft;

import cn.whitrayhb.celecraft.item.Berry;
import cn.whitrayhb.celecraft.item.CelecraftItems;
import cn.whitrayhb.celecraft.CelecraftRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.FoodComponent;
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
	private static final Item STRAWBERRY = new Berry(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1).rarity((Rarity.COMMON)).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build()),"strawberry");
	public static ItemGroup CELECRAFT_ITEM_GROUP = FabricItemGroupBuilder
			.create(new Identifier("celecraft","general"))
			.icon(()->new ItemStack(CelecraftItems.STRAWBERRY))
			.build();

	/*SoundEvents*/
	@Override
	public void onInitialize(){
		CELECRAFT.info("Welcome to Celecraft World!");
		CelecraftRegistry.celecraftRegisterAll();
	}
}
