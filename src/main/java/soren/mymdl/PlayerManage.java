package soren.mymdl;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PlayerManage {

	private final NewRenderer test = new NewRenderer(Minecraft.getInstance().getRenderManager());
	
	  @SubscribeEvent 
	  public void renderPlayerPre(RenderPlayerEvent.Pre event) {
		  
		  event.setCanceled(true);
		  
		  
//		  System.out.println("-- Cancel Model! --"); 		  
//		  event.getRenderer().getEntityModel().bipedLeftArm.isHidden = true;
		  test.doRender((AbstractClientPlayerEntity) event.getEntity(), 1, 1, 1, 0.625F, 0.625F);
		  
	
	  }
}
