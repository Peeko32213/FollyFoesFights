package com.peeko.FollyFoesFights.registry;


import com.peeko.FollyFoesFights.FollyFoesFights;
import com.peeko.FollyFoesFights.entity.UraniumTNTEntity;
import com.peeko.FollyFoesFights.entity.mobs.CliffracerEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FollyFoesFightsEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, FollyFoesFights.MOD_ID);


    //Msc
    public static final EntityType<UraniumTNTEntity> URANIUM_TNT_ENTITY_ENTITY_TYPE = EntityType.Builder.of(UraniumTNTEntity::new, EntityClassification.MISC)
            .sized(1.5F, 1.5F).build("uranium_tnt");
    public static final RegistryObject<EntityType<UraniumTNTEntity>> URANIUM_TNT = ENTITIES.register("uranium_tnt", () -> URANIUM_TNT_ENTITY_ENTITY_TYPE);


    //Small Mobs
    public static final EntityType<CliffracerEntity> CLIFFRACER_ENTITY_ENTITY_TYPE = EntityType.Builder.of(CliffracerEntity::new, EntityClassification.MONSTER)
            .sized(1.5F, 1.5F).build("cliffracer");
    public static final RegistryObject<EntityType<CliffracerEntity>> CLIFFRACER = ENTITIES.register("cliffracer", () -> CLIFFRACER_ENTITY_ENTITY_TYPE);



}


