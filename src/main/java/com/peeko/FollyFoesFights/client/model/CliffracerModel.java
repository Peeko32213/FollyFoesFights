package com.peeko.FollyFoesFights.client.model;

import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.peeko.FollyFoesFights.entity.mobs.CliffracerEntity;
import net.minecraft.client.renderer.entity.model.BatModel;
import net.minecraft.client.renderer.entity.model.PhantomModel;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class CliffracerModel<T extends CliffracerEntity> extends SegmentedModel<T> {
    private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer Leftwing;
    private final ModelRenderer RightWing;

    public CliffracerModel() {
        texWidth = 64;
        texHeight = 32;

        Head = new ModelRenderer(this);
        Head.setPos(0.0F, 17.0F, 6.0F);
        Head.texOffs(0, 0).addBox(-1.0F, -1.0F, -13.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        Head.texOffs(12, 0).addBox(-2.0F, -2.0F, -9.0F, 4.0F, 4.0F, 5.0F, 0.0F, false);
        Head.texOffs(25, 0).addBox(0.0F, -4.0F, -5.0F, 0.0F, 2.0F, 3.0F, 0.0F, false);
        Head.texOffs(28, 1).addBox(0.0F, 2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
        Head.texOffs(0, 6).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setPos(0.0F, 17.0F, 6.0F);
        Body.texOffs(32, 15).addBox(-2.0F, -2.0F, 10.0F, 4.0F, 2.0F, 10.0F, 0.0F, false);
        Body.texOffs(0, 12).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);
        Body.texOffs(22, 6).addBox(0.0F, -10.0F, 2.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);

        Leftwing = new ModelRenderer(this);
        Leftwing.setPos(3.025F, 15.0F, 6.0F);
        Leftwing.texOffs(24, 1).addBox(0.0F, 0.0F, 0.0F, 12.0F, 1.0F, 8.0F, 0.0F, false);

        RightWing = new ModelRenderer(this);
        RightWing.setPos(-3.025F, 15.0F, 6.0F);
        RightWing.texOffs(24, 1).addBox(-12.0F, 0.0F, 0.0F, 12.0F, 1.0F, 8.0F, 0.0F, true);
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
        float f = ((float)(p_225597_1_.getId() * 3) + p_225597_4_) * 0.13F;
        float f1 = 16.0F;
        this.Leftwing.zRot = MathHelper.cos(f) * 16.0F * ((float)Math.PI / 180F);
        this.RightWing.zRot = -this.Leftwing.zRot;
    }

    @Override
    public Iterable<ModelRenderer> parts() {
        return ImmutableSet.of(this.Body);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
