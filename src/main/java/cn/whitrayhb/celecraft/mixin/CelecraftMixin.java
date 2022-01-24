package cn.whitrayhb.celecraft.mixin;

import cn.whitrayhb.celecraft.CelecraftMain;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class CelecraftMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		CelecraftMain.CELECRAFT.info("Welcome to Celecraft world!");
	}
}
