package com.peeko.FollyFoesFights.client.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.peeko.FollyFoesFights.entities.RoboJefferyEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.IronGolemModel;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class RoboJefferyModel<T extends RoboJefferyEntity> extends SegmentedModel<T> {
    private final ModelRenderer left_arm;
    private final ModelRenderer right_arm;
    private final ModelRenderer left_leg;
    private final ModelRenderer right_leg;
    private final ModelRenderer body;
    private final ModelRenderer head;

    public RoboJefferyModel() {
        int i = 128;
        int j = 128;

        this.left_arm = (new ModelRenderer(this)).setTexSize(128, 128);
        left_arm.setPos(5.0F, -36.0F, 0.0F);
        left_arm.texOffs(40, 15).addBox(0.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
        left_arm.texOffs(40, 40).addBox(2.0F, 5.0F, -3.0F, 6.0F, 35.0F, 6.0F, 0.0F, false);

        this.right_arm = (new ModelRenderer(this)).setTexSize(128, 128);
        right_arm.setPos(-5.0F, -36.0F, 0.0F);
        right_arm.texOffs(64, 64).addBox(-10.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
        right_arm.texOffs(0, 52).addBox(-8.0F, 5.0F, -3.0F, 6.0F, 35.0F, 6.0F, 0.0F, false);

        this.left_leg = (new ModelRenderer(this)).setTexSize(128, 128);
        left_leg.setPos(3.975F, -8.0F, 0.0F);
        left_leg.texOffs(80, 0).addBox(-3.0F, 0.0F, -3.0F, 5.0F, 32.0F, 6.0F, 0.0F, false);

        this.right_leg = (new ModelRenderer(this)).setTexSize(128, 128);
        right_leg.setPos(-3.975F, -8.0F, 0.0F);
        right_leg.texOffs(24, 75).addBox(-2.0F, 0.0F, -3.0F, 5.0F, 32.0F, 6.0F, 0.0F, false);

        this.body = (new ModelRenderer(this)).setTexSize(128, 128);
        body.setPos(0.0F, -27.0F, 0.0F);
        body.texOffs(0, 0).addBox(-6.0F, -13.0F, -6.0F, 12.0F, 13.0F, 12.0F, 0.0F, false);
        body.texOffs(0, 25).addBox(-6.0F, 0.0F, -4.0F, 12.0F, 19.0F, 8.0F, 0.0F, false);

        this.head = (new ModelRenderer(this)).setTexSize(128, 128);
        head.setPos(0.0F, -40.0F, 0.0F);
        head.texOffs(64, 38).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 16.0F, 8.0F, 0.0F, false);
    }

    public Iterable<ModelRenderer> parts() {
        return ImmutableList.of(this.head, this.body, this.right_leg, this.left_leg, this.right_arm, this.left_arm);
    }

    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
        this.head.yRot = p_225597_5_ * ((float)Math.PI / 180F);
        this.head.xRot = p_225597_6_ * ((float)Math.PI / 180F);
        this.right_leg.xRot = -1.5F * MathHelper.triangleWave(p_225597_2_, 13.0F) * p_225597_3_;
        this.left_leg.xRot = 1.5F * MathHelper.triangleWave(p_225597_2_, 13.0F) * p_225597_3_;
        this.right_leg.yRot = 0.0F;
        this.left_leg.yRot = 0.0F;
    }

    public void prepareMobModel(T p_212843_1_, float p_212843_2_, float p_212843_3_, float p_212843_4_) {
        int i = p_212843_1_.getAttackAnimationTick();
        if (i > 0) {
            this.right_arm.xRot = -2.0F + 1.5F * MathHelper.triangleWave((float)i - p_212843_4_, 10.0F);
            this.left_arm.xRot = -2.0F + 1.5F * MathHelper.triangleWave((float)i - p_212843_4_, 10.0F);
        }
        else {
                this.right_arm.xRot = (-0.2F + 1.5F * MathHelper.triangleWave(p_212843_2_, 13.0F)) * p_212843_3_;
                this.left_arm.xRot = (-0.2F - 1.5F * MathHelper.triangleWave(p_212843_2_, 13.0F)) * p_212843_3_;
            }
        }
}