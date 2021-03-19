package com.peeko.FollyFoesFights.init;


import com.peeko.FollyFoesFights.FollyFoesFights;
import com.peeko.FollyFoesFights.client.render.RoboJefferyRenderer;
import com.peeko.FollyFoesFights.entities.RoboJefferyEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FollyFoesFightsEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, FollyFoesFights.MOD_ID);

    public static final EntityType<RoboJefferyEntity> JEFF = EntityType.Builder.of(RoboJefferyEntity::new, EntityClassification.MONSTER)
            .sized(1.5F, 1.5F).build("jeff");


    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(JEFF, RoboJefferyRenderer::new);

    }



}


