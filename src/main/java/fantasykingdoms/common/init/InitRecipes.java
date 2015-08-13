package fantasykingdoms.common.init;

import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

import boilerplate.common.utils.recipe.RecipeUtils;

public class InitRecipes
{
	public static void init()
	{
		// Crafting
		for (int meta = 0; meta < 6; meta++)
		{
			RecipeUtils.addMetalRecipes(InitBlocks.blockMetal, InitItems.itemIngot, InitItems.itemNugget, meta);
		}
		RecipeUtils
				.addToolSet(new ItemStack(InitItems.itemIngot, 1, 2),
						new ItemStack[] { new ItemStack(InitItems.itemSilverPickaxe), new ItemStack(InitItems.itemSilverShovel),
								new ItemStack(InitItems.itemSilverAxe), new ItemStack(InitItems.itemSilverHoe),
								new ItemStack(InitItems.itemSilverSword) });
		// Smelting
		for (int meta = 0; meta < 3; meta++)
		{
			GameRegistry.addSmelting(new ItemStack(InitBlocks.blockGemOre, 1, meta), new ItemStack(InitItems.itemGem, 1, meta), 0.3F);
		}
		for (int meta = 0; meta < 5; meta++)
		{
			GameRegistry.addSmelting(new ItemStack(InitBlocks.blockMetalOre, 1, meta), new ItemStack(InitItems.itemIngot, 1, meta), 0.3F);
		}
	}

}
