package net.minecast.mod.fm.proxy;

import net.minecast.mod.fm.init.FoodItems;
import net.minecast.mod.fm.init.ToolItems;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		FoodItems.registerRenders();
		ToolItems.registerRenders();
	}

}
