package com.peeko.FollyFoesFights.registry.other;

import com.peeko.FollyFoesFights.registry.FollyFoesFightsEntities;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;

public class FollyFoesFightsEntityAttributes {

    public static void putAttributes() {
        GlobalEntityTypeAttributes.put(FollyFoesFightsEntities.CLIFFRACER.get(),
                MobEntity.createMobAttributes()
                        .add(Attributes.ATTACK_DAMAGE, 2.0F)
                        .add(Attributes.MAX_HEALTH, 5.0F)
                        .add(Attributes.MOVEMENT_SPEED, 1.25F)
                        .add(Attributes.ARMOR, 0.0F)
                        .add(Attributes.FOLLOW_RANGE, 35.0F)
                        .add(Attributes.KNOCKBACK_RESISTANCE, 0F)
                        .build()
        );




    }

}
