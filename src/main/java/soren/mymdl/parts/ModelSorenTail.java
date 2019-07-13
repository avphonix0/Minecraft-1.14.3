package soren.mymdl.parts;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class ModelSorenTail extends RendererModel {

	@SuppressWarnings("unused")
	private BipedModel<LivingEntity> base;

	public ModelSorenTail(BipedModel<LivingEntity> base) {
		super(base);
		this.base = base;

		RendererModel Shape1 = new RendererModel(base, 0, 0);
		Shape1.addBox(-2.0F, -2.75F, -1.0F, 4, 4, 7, 0.100F);
		Shape1.setRotationPoint(0.0F, 0.5F, 1.25F);
		setRotation(Shape1, 0.05F, 0.0F, 0.0F);
		addChild(Shape1);

		RendererModel Shape2 = new RendererModel(base, 0, 11);
		Shape2.addBox(-2.0F, -3.8F, 0.15F, 4, 4, 7, 0.101F);
		Shape2.setRotationPoint(0.0F, 1.15F, 5.9F);
		setRotation(Shape2, 0.70F, 0.0F, 0.0F);
		Shape1.addChild(Shape2);

		RendererModel Shape3 = new RendererModel(base, 0, 11);
		Shape3.addBox(-2.0F, -3.7F, -0.05F, 4, 4, 7, 0.102F);
		Shape3.setRotationPoint(0.0F, -0.1F, 7.1F);
		setRotation(Shape3, 0.70F, 0.0F, 0.0F);
		Shape2.addChild(Shape3);

		RendererModel Shape4 = new RendererModel(base, 0, 11);
		Shape4.addBox(-2.0F, 0.0F, 0.25F, 4, 4, 7, 0.103F);
		Shape4.setRotationPoint(0.0F, -3.813F, 6.876F);
		setRotation(Shape4, -0.70F, 0.0F, 0.0F);
		Shape3.addChild(Shape4);

		RendererModel Shape5 = new RendererModel(base, 0, 22);
		Shape5.addBox(-2.0F, 0.295F, -0.05F, 4, 4, 7, 0.104F);
		Shape5.setRotationPoint(0.0F, -0.2F, 7.585F);
		setRotation(Shape5, -0.465F, 0.0F, 0.0F);
		Shape4.addChild(Shape5);
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6,
			Entity entity) {
	}

	private void setRotation(RendererModel model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
