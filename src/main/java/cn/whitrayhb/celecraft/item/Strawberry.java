package cn.whitrayhb.celecraft.item;

import cn.whitrayhb.celecraft.CelecraftMain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Strawberry extends Item
{
    public Strawberry(Settings settings)
    {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand)
    {
        playerEntity.playSound(CelecraftMain.STRAWBERRY_GET_1000,1.0F,1.0F);
        return new TypedActionResult<>(ActionResult.SUCCESS,playerEntity.getStackInHand(hand));
    }
}
