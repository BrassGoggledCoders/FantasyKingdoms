package fantasykingdoms.client;

import cpw.mods.fml.client.registry.RenderingRegistry;

import fantasykingdoms.client.renderers.entity.RenderBarrelPrimed;
import fantasykingdoms.common.CommonProxy;
import fantasykingdoms.common.entity.EntityBarrelPrimed;

public class ClientProxy extends CommonProxy
{
	@Override
	public void init()
	{
		super.init();
		this.registerEntityRenderers();
	}

	private void registerEntityRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBarrelPrimed.class, new RenderBarrelPrimed());
	}
}
