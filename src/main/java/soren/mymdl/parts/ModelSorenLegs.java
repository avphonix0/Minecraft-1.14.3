package soren.mymdl.parts;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class ModelSorenLegs extends RendererModel {
	
	private RendererModel rightleg;
	private RendererModel rightleg2;
	private RendererModel rightleglow;
	private RendererModel rightfoot;
	private RendererModel leftleg;
	private RendererModel leftleg2;
	private RendererModel leftleglow;
	private RendererModel leftfoot;
	private BipedModel<LivingEntity> base;

	public ModelSorenLegs(BipedModel<LivingEntity> base)
  {
	  super(base);
	    this.base = base;
	    this.rightleg = new RendererModel(base, 0, 7);
	    this.rightleg.addBox(-2.25F, 0.0F, -2.05F, 5, 5, 5);
	    this.rightleg.setRotationPoint(-2.14F, 10.0F, 0.0001F);
	    setRotation(this.rightleg, 0.25F, 0.0F, 0.0F);
	    addChild(this.rightleg);
	    
	    this.rightleg2 = new RendererModel(base, 0, 17);
	    this.rightleg2.addBox(-2.24F, -0.88F, -1.98F, 4, 5, 4);
	    this.rightleg2.setRotationPoint(0.0F, 4.3F, 0.0F);
	    setRotation(this.rightleg2, 0.75F, 0.0F, 0.0F);
	    this.rightleg.addChild(this.rightleg2);
	    
	    this.rightleglow = new RendererModel(base, 0, 26);
	    this.rightleglow.addBox(-2.25F, -2.15F, -3.225F, 4, 9, 3);
	    this.rightleglow.setRotationPoint(0.0F, 5.0F, 0.0F);
	    setRotation(this.rightleglow, -1.25F, 0.0F, 0.0F);
	    this.rightleg2.addChild(this.rightleglow);
	    
	    this.rightfoot = new RendererModel(base, 0, 0);
	    this.rightfoot.addBox(-2.25F, -1.23F, -1.635F, 5, 3, 4);
	    this.rightfoot.setRotationPoint(0.0F, 0.0F, 0.0F);
	    setRotation(this.rightfoot, 0.645F, 0.0F, 0.0F);
	    this.rightleg.addChild(this.rightfoot);
	    
	    this.leftleg = new RendererModel(base, 0, 7);
	    this.leftleg.mirror = true;
	    this.leftleg.addBox(-2.75F, 0.0F, -2.05F, 5, 5, 5);
	    this.leftleg.setRotationPoint(2.14F, 10.0F, 0.0F);
	    setRotation(this.leftleg, 0.25F, 0.0F, 0.0F);
	    addChild(this.leftleg);
	    
	    this.leftleg2 = new RendererModel(base, 0, 17);
	    this.leftleg2.mirror = true;
	    this.leftleg2.addBox(-1.76F, -0.88F, -1.98F, 4, 5, 4);
	    this.leftleg2.setRotationPoint(0.0F, 4.3F, 0.0F);
	    setRotation(this.leftleg2, 0.75F, 0.0F, 0.0F);
	    this.leftleg.addChild(this.leftleg2);
	    
	    this.leftleglow = new RendererModel(base, 0, 26);
	    this.leftleglow.mirror = true;
	    this.leftleglow.addBox(-1.75F, -2.15F, -3.225F, 4, 9, 3);
	    this.leftleglow.setRotationPoint(0.0F, 5.0F, 0.0F);
	    setRotation(this.leftleglow, -1.25F, 0.0F, 0.0F);
	    this.leftleg2.addChild(this.leftleglow);
	    
	    this.leftfoot = new RendererModel(base, 0, 0);
	    this.leftfoot.mirror = true;
	    this.leftfoot.addBox(-2.75F, -1.23F, -1.635F, 5, 3, 4);
	    this.leftfoot.setRotationPoint(0.0F, 0.0F, 0.0F);
	    setRotation(this.leftfoot, 0.645F, 0.0F, 0.0F);
	    this.leftleg.addChild(this.leftfoot);
	    
	  }

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6,
			Entity entity) {
		this.rightleg.rotateAngleX = ((this.base.bipedRightLeg.rotateAngleX * 0.75F) + 0.125F);
		this.leftleg.rotateAngleX = ((this.base.bipedLeftLeg.rotateAngleX * 0.75F) + 0.125F);
		this.rightleg.rotateAngleY = this.base.bipedRightLeg.rotateAngleY;
		this.leftleg.rotateAngleY = this.base.bipedLeftLeg.rotateAngleY;
		this.rightleg.rotationPointY = (this.base.bipedRightLeg.rotationPointY - 0.25F);
		this.leftleg.rotationPointY = (this.base.bipedLeftLeg.rotationPointY - 0.25F);
		this.rightleg.rotationPointZ = (this.base.bipedRightLeg.rotationPointZ);
		this.leftleg.rotationPointZ = (this.base.bipedLeftLeg.rotationPointZ);

		if (!this.base.isSneak) {
			this.leftleg.rotationPointY -= 1.0F;
			this.rightleg.rotationPointY -= 1.0F;
		}
		/*
		if (this.base.isRiding) {
			this.leftleg.rotationPointY += 1.1F;
			this.rightleg.rotationPointY += 1.1F;
			this.rightleg.rotateAngleX -= 0.35F;
			this.leftleg.rotateAngleX -= 0.35F;
			this.rightleg.rotationPointZ = (this.base.bipedRightLeg.rotationPointZ + 1.0F);
			this.leftleg.rotationPointZ = (this.base.bipedLeftLeg.rotationPointZ + 1.0F);
		}*/
	}

	private void setRotation(RendererModel model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
