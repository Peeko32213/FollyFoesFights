package com.peeko.FollyFoesFights.client.render;

import com.peeko.FollyFoesFights.FollyFoesFights;
import com.peeko.FollyFoesFights.client.model.CliffracerModel;
import com.peeko.FollyFoesFights.entity.mobs.CliffracerEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CliffracerRenderer extends MobRenderer<CliffracerEntity, CliffracerModel<CliffracerEntity>> {


    public CliffracerRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CliffracerModel<>(), 0.6F);
    }


    @Override
    public ResourceLocation getTextureLocation(CliffracerEntity entity) {
        return new ResourceLocation(FollyFoesFights.MOD_ID, "textures/entity/cliff_racer.png");
    }


}
