package com.peeko.FollyFoesFights.client;

import com.peeko.FollyFoesFights.FollyFoesFights;
import com.peeko.FollyFoesFights.client.render.CliffracerRenderer;
import com.peeko.FollyFoesFights.client.render.UraniumTNTRenderer;
import com.peeko.FollyFoesFights.registry.FollyFoesFightsBlocks;
import com.peeko.FollyFoesFights.registry.FollyFoesFightsEntities;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = FollyFoesFights.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ClientRegister {
    @SubscribeEvent
    public static void render(Supplier<? extends Block> block, RenderType render) {
        RenderTypeLookup.setRenderLayer(block.get(), render);
    }

    public static void registerBlockRenderers() {
        RenderType cutout = RenderType.cutout();

        RenderTypeLookup.setRenderLayer(FollyFoesFightsBlocks.BLUE_CRYSTAL_CLUSTER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(FollyFoesFightsBlocks.PINK_CRYSTAL_CLUSTER.get(), RenderType.cutout());
    }

    public static void registerEntityRenderers(){
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();

        RenderingRegistry.registerEntityRenderingHandler(FollyFoesFightsEntities.CLIFFRACER.get(), CliffracerRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(FollyFoesFightsEntities.URANIUM_TNT.get(), UraniumTNTRenderer::new);
    }
}


