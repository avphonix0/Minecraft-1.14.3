package soren.mymdl.setup;

import net.minecraft.client.Minecraft;
//import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.world.World;


public class ClientProxy implements IProxy {

	@Override
	public World getClientWorld() {
		return Minecraft.getInstance().world;
	}
}
