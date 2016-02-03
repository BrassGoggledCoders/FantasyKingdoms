package fantasykingdoms.client.renderers.tile;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import boilerplate.client.renderers.RenderFloatingItem;
import fantasykingdoms.common.tiles.TileRunicAnvil;
import org.lwjgl.opengl.GL11;

/**
 * @author Surseance
 *
 */
public class TileRunicAnvilRenderer extends TileEntitySpecialRenderer
{
	public TileRunicAnvilRenderer()
	{

	}

	@Override
	public void renderTileEntityAt(TileEntity te, double dx, double dy, double dz, float scale)
	{
		TileRunicAnvil tile = (TileRunicAnvil) te;
		GL11.glPushMatrix();
		// RenderBlocks.getInstance().renderStandardBlock(InitBlocks.blockRunicAnvil,
		// tile.xCoord, tile.yCoord, tile.zCoord);
		GL11.glPopMatrix();

		if (tile.inventory[0] != null)
		{
			GL11.glPushMatrix();
			RenderFloatingItem.render(dx + 0.5F, dy + 1.1F, dz + 0.25F, 90, 0, 0, tile.inventory[0]);
			GL11.glPopMatrix();
		}
	}
}
