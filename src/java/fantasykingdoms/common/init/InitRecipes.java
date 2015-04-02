package fantasykingdoms.common.init;

import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

import boilerplate.common.utils.recipe.RecipeUtils;

public class InitRecipes
{
	public static void init()
	{
		for (int meta = 0; meta < 6; meta++)
		{
			RecipeUtils.addMetalRecipes(InitBlocks.blockMetal, InitItems.itemIngot, InitItems.itemNugget, meta);
		}
		for (int meta = 0; meta < 5; meta++)
		{
			GameRegistry.addSmelting(new ItemStack(InitBlocks.blockMetalOre, 1, meta), new ItemStack(InitItems.itemIngot, 1, meta), 0.3F);
		}
	}

}
