package com.peeko.FollyFoesFights.client;

import com.peeko.FollyFoesFights.FollyFoesFights;
import com.peeko.FollyFoesFights.init.FollyFoesFightsBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
@Mod.EventBusSubscriber(modid = FollyFoesFights.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ClientRegister {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            setupRenderLayer();
        });
}
    public static void setupRenderLayer() {

        RenderTypeLookup.setRenderLayer(FollyFoesFightsBlocks.BLUE_CRYSTAL_CLUSTER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(FollyFoesFightsBlocks.PINK_CRYSTAL_CLUSTER.get(), RenderType.cutout());


    }
}
