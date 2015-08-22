package fantasykingdoms.client.renderers.entity;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderTNTPrimed;
import net.minecraft.entity.Entity;

import fantasykingdoms.common.entity.EntityBarrelPrimed;
import fantasykingdoms.common.init.InitBlocks;
import org.lwjgl.opengl.GL11;

public class RenderBarrelPrimed extends RenderTNTPrimed
{
	public void doRender(EntityBarrelPrimed p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float) p_76986_2_, (float) p_76986_4_, (float) p_76986_6_);
		float f2;

		if (((p_76986_1_.fuse - p_76986_9_) + 1.0F) < 10.0F)
		{
			f2 = 1.0F - (((p_76986_1_.fuse - p_76986_9_) + 1.0F) / 10.0F);

			if (f2 < 0.0F)
			{
				f2 = 0.0F;
			}

			if (f2 > 1.0F)
			{
				f2 = 1.0F;
			}

			f2 *= f2;
			f2 *= f2;
			float f3 = 1.0F + (f2 * 0.3F);
			GL11.glScalef(f3, f3, f3);
		}

		f2 = (1.0F - (((p_76986_1_.fuse - p_76986_9_) + 1.0F) / 100.0F)) * 0.8F;
		// this.bindEntityTexture(p_76986_1_);
		RenderBlocks.getInstance().renderBlockAsItem(InitBlocks.blockExplosiveBarrel, 0, p_76986_1_.getBrightness(p_76986_9_));

		if (((p_76986_1_.fuse / 5) % 2) == 0)
		{
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_DST_ALPHA);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, f2);
			RenderBlocks.getInstance().renderBlockAsItem(InitBlocks.blockExplosiveBarrel, 0, 1.0F);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glEnable(GL11.GL_LIGHTING);
			GL11.glEnable(GL11.GL_TEXTURE_2D);
		}

		GL11.glPopMatrix();
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method,
	 * always casting down its argument and then handing it off to a worker
	 * function which does the actual work. In all probabilty, the class Render
	 * is generic (Render<T extends Entity) and this method has signature public
	 * void func_76986_a(T entity, double d, double d1, double d2, float f,
	 * float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	@Override
	public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
	{
		this.doRender((EntityBarrelPrimed) p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
	}

}
