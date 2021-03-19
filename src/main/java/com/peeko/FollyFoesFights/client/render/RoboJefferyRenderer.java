package com.peeko.FollyFoesFights.client.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.peeko.FollyFoesFights.FollyFoesFights;
import com.peeko.FollyFoesFights.client.model.RoboJefferyModel;
import com.peeko.FollyFoesFights.entities.RoboJefferyEntity;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.util.ResourceLocation;

public class RoboJefferyRenderer extends MobRenderer<RoboJefferyEntity, RoboJefferyModel<RoboJefferyEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(FollyFoesFights.MOD_ID, "textures/entity/RoboJeffery.png");

    public RoboJefferyRenderer (EntityRendererManager renderManagerIn) {
        super(renderManagerIn,new RoboJefferyModel<>(),1f);
    }

    @Override
    public ResourceLocation getTextureLocation(RoboJefferyEntity p_110775_1_) {
        return TEXTURE;
    }


    protected void preRenderCallback(RoboJefferyEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
    }

}
