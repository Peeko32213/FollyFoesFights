package com.peeko.FollyFoesFights.entity;

import net.minecraft.block.TNTBlock;
import net.minecraft.client.renderer.entity.TNTRenderer;
import net.minecraft.entity.*;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class UraniumTNTEntity extends TNTEntity  {


    public UraniumTNTEntity(EntityType<? extends UraniumTNTEntity> type, World world) {
        super(type, world);
    }

    protected void explode() {
        float f = 4.0F;
        this.level.explode(this, this.getX(), this.getY(0.0625D), this.getZ(), 4.0F, Explosion.Mode.BREAK);
    }
}
