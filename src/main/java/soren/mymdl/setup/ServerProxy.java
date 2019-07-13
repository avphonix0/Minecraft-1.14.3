package soren.mymdl.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy{

	@Override
	public World getClientWorld() {
		throw new IllegalStateException("Only in client!");
	}
}
