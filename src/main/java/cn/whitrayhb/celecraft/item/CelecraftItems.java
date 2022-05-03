package cn.whitrayhb.celecraft.item;

import cn.whitrayhb.celecraft.CelecraftMain;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class CelecraftItems {
    public static final Item STRAWBERRY = new Berry(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1).rarity((Rarity.COMMON)).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build()),"strawberry");
    public static final Item GOLDENBERRY = new Berry(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1).rarity(Rarity.UNCOMMON).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).build()),"goldenberry");
    public static final Item MOONBERRY = new Berry(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(1).rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(20).saturationModifier(1.0f).build()),"moonberry");
    public static final Item CELEFRAGMENT = new Item(new Item.Settings().group(CelecraftMain.CELECRAFT_ITEM_GROUP).maxCount(64));
}
