package cn.whitrayhb.celecraft;

import cn.whitrayhb.celecraft.item.CelecraftItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CelecraftMain implements ModInitializer {
	public static final Logger CELECRAFT = LogManager.getLogger("celecraft");
	/*ItemGroups*/
	public static ItemGroup CELECRAFT_ITEM_GROUP = FabricItemGroupBuilder
			.create(new Identifier("celecraft","general"))
			.icon(()->new ItemStack(CelecraftItems.STRAWBERRY))
			.build();


	@Override
	public void onInitialize(){
		CELECRAFT.info("Welcome to Celecraft World!");
		CelecraftRegistry.celecraftRegisterAll();
	}
}
