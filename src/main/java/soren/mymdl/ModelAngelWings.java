package soren.mymdl;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

@SuppressWarnings("rawtypes")
public class ModelAngelWings extends EntityModel {
	
	private final RendererModel leftWing;
	private final RendererModel rightWing;
	
	public ModelAngelWings() {
		
		textureWidth = 16;
		textureHeight = 16;
		
		leftWing = new RendererModel(this);
		leftWing.setRotationPoint(0.0F, 16.0F, 0.0F);
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 0.0F, -2.0F, 3.0F, 1, 4, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 1.0F, -5.0F, 3.0F, 1, 11, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 2.0F, -5.0F, 4.0F, 6, 10, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 2.0F, -6.0F, 3.0F, 1, 2, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 2.0F, -7.0F, 3.0F, 4, 1, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 6.0F, -7.0F, 3.0F, 1, 2, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 7.0F, -6.0F, 3.0F, 1, 3, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 8.0F, -4.0F, 4.0F, 1, 8, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 8.0F, -1.0F, 5.0F, 1, 6, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 7.0F, 4.0F, 5.0F, 1, 3, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 2.0F, 5.0F, 4.0F, 5, 2, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 6.0F, 6.0F, 5.0F, 1, 3, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 2.0F, 7.0F, 4.0F, 4, 3, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 1.0F, -4.0F, 4.0F, 1, 13, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 1.0F, 8.0F, 5.0F, 1, 4, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 2.0F, 10.0F, 4.0F, 2, 2, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 4.0F, 10.0F, 5.0F, 1, 3, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 5.0F, 8.0F, 5.0F, 1, 3, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 3.0F, 12.0F, 4.0F, 1, 1, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 2.0F, 11.0F, 5.0F, 1, 2, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 3.0F, 12.0F, 5.0F, 1, 2, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 3.0F, -6.0F, 4.0F, 4, 1, 1, 0.0F, false));
		leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 0.0F, -3.0F, 2.0F, 1, 6, 1, 0.0F, false));

		rightWing = new RendererModel(this);
		rightWing.setRotationPoint(0.0F, 16.0F, 0.0F);
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -1.0F, -3.0F, 2.0F, 1, 6, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -2.0F, -4.0F, 4.0F, 1, 13, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -8.0F, -5.0F, 4.0F, 6, 10, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -2.0F, -5.0F, 3.0F, 1, 11, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -3.0F, -6.0F, 3.0F, 1, 2, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -7.0F, -6.0F, 4.0F, 4, 1, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -6.0F, -7.0F, 3.0F, 4, 1, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -8.0F, -6.0F, 3.0F, 1, 3, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -7.0F, -7.0F, 3.0F, 1, 2, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -9.0F, -4.0F, 4.0F, 1, 8, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -9.0F, -1.0F, 5.0F, 1, 6, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -7.0F, 6.0F, 5.0F, 1, 3, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -8.0F, 4.0F, 5.0F, 1, 3, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -6.0F, 8.0F, 5.0F, 1, 3, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -6.0F, 7.0F, 4.0F, 4, 3, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -4.0F, 10.0F, 4.0F, 2, 2, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -5.0F, 10.0F, 5.0F, 1, 3, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -4.0F, 12.0F, 5.0F, 1, 2, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -3.0F, 11.0F, 5.0F, 1, 2, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -2.0F, 8.0F, 5.0F, 1, 4, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -7.0F, 5.0F, 4.0F, 5, 2, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -4.0F, 12.0F, 4.0F, 1, 1, 1, 0.0F, false));
		rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -1.0F, -2.0F, 3.0F, 1, 4, 1, 0.0F, false));
		
	}
	
	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.setRotationAngle(leftWing, 0.0F, (float) Math.PI - (float) Math.PI / 180.0F * netHeadYaw, 0.0F);
		leftWing.render(scale);
		this.setRotationAngle(rightWing, 0.0F, (float) Math.PI - (float) Math.PI / 180.0F * netHeadYaw, 0.0F);
		rightWing.render(scale);
	}
	
	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
}