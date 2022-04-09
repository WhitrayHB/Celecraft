package cn.whitrayhb.celecraft.item;


import cn.whitrayhb.celecraft.CelecraftSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Berry extends Item
{
    private String type;
    private static int count = 0;
    public Berry(Settings settings,String Type) {
        super(settings);
        this.type = Type;
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand)
    {
        if(count<11) count++;
        if(type == "strawberry")
        {
            switch (count){
                case 1:playerEntity.playSound(CelecraftSounds.STRAWBERRY_GET_1000, 1.0F, 1.0F);break;
                case 3:playerEntity.playSound(CelecraftSounds.STRAWBERRY_GET_2000, 1.0F, 1.0F);break;
                case 5:playerEntity.playSound(CelecraftSounds.STRAWBERRY_GET_3000, 1.0F, 1.0F);break;
                case 7:playerEntity.playSound(CelecraftSounds.STRAWBERRY_GET_4000, 1.0F, 1.0F);break;
                case 9:playerEntity.playSound(CelecraftSounds.STRAWBERRY_GET_5000, 1.0F, 1.0F);break;
                case 11:playerEntity.playSound(CelecraftSounds.STRAWBERRY_GET_1up, 1.0F, 1.0F);
            }
        }
        if(type=="goldenberry")
        {
            switch (count){
                case 1:playerEntity.playSound(CelecraftSounds.GOLDENBERRY_GET_1000,1.0F,1.0F);break;
                case 3:playerEntity.playSound(CelecraftSounds.GOLDENBERRY_GET_2000,1.0F,1.0F);break;
                case 5:playerEntity.playSound(CelecraftSounds.GOLDENBERRY_GET_3000,1.0F,1.0F);break;
                case 7:playerEntity.playSound(CelecraftSounds.GOLDENBERRY_GET_4000,1.0F,1.0F);break;
                case 9:playerEntity.playSound(CelecraftSounds.GOLDENBERRY_GET_5000,1.0F,1.0F);break;
                case 11:playerEntity.playSound(CelecraftSounds.GOLDENBERRY_GET_1up,1.0F,1.0F);
            }
        }
        //我也不知道为什么他会是1357的计数方式，但是能跑就行√
        if(type == "moonberry") playerEntity.playSound(CelecraftSounds.MOONBERRY_GET,1.0f,1.0f);
        return new TypedActionResult<>(ActionResult.SUCCESS,playerEntity.getStackInHand(hand));
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        count=0;
        return ActionResult.SUCCESS;
    }
}
