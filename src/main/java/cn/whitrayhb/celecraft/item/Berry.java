package cn.whitrayhb.celecraft.item;

import cn.whitrayhb.celecraft.CelecraftMain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Berry extends Item
{
    private String type;
    public Berry(Settings settings, String Type) {
        super(settings);
        this.type = Type;
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand)
    {
        switch(type)
        {
            case "strawberry":playerEntity.playSound(CelecraftMain.STRAWBERRY_GET_1000,1.0F,1.0F);break;
            case "goldenberry":playerEntity.playSound(CelecraftMain.GOLDENBERRY_GET_1000,1.0f,1.0f);break;
            case "moonberry":playerEntity.playSound(CelecraftMain.MOONBERRY_GET,1.0f,1.0f);
            default:
        }
        return new TypedActionResult<>(ActionResult.SUCCESS,playerEntity.getStackInHand(hand));
    }
}
