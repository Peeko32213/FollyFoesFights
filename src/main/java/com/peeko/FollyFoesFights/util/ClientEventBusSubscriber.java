package com.peeko.FollyFoesFights.util;

import com.peeko.FollyFoesFights.FollyFoesFights;
import com.peeko.FollyFoesFights.client.render.RoboJefferyRenderer;
import com.peeko.FollyFoesFights.init.FollyFoesFightsEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FollyFoesFights.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
@OnlyIn(Dist.CLIENT)
public class ClientEventBusSubscriber {

    public static void init(){


    }
}
