package fantasykingdoms.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

import boilerplate.client.renderers.block.BlockTESRRenderer;
import fantasykingdoms.client.renderers.entity.RenderBarrelPrimed;
import fantasykingdoms.client.renderers.tile.TileRunicAnvilRenderer;
import fantasykingdoms.common.CommonProxy;
import fantasykingdoms.common.entity.EntityBarrelPrimed;
import fantasykingdoms.common.tiles.TileRunicAnvil;

public class ClientProxy extends CommonProxy
{
	@Override
	public void init()
	{
		this.registerEntityRenderers();
		this.registerBlockRenderers();
		super.init();
	}

	private void registerBlockRenderers()
	{
		RenderIDs.setIDs();
		ClientRegistry.bindTileEntitySpecialRenderer(TileRunicAnvil.class, new TileRunicAnvilRenderer());
		RenderingRegistry.registerBlockHandler(new BlockTESRRenderer(new TileRunicAnvil(), RenderIDs.blockRunicAnvilRI));
	}

	private void registerEntityRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBarrelPrimed.class, new RenderBarrelPrimed());
	}
}
