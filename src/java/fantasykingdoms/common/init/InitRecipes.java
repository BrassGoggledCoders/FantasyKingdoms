package fantasykingdoms.common.init;

import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

public class InitRecipes
{
	public static void init()
	{
		GameRegistry.addSmelting(new ItemStack(InitBlocks.blockCopperOre), new ItemStack(InitItems.itemCopperIngot), 1F);
		GameRegistry.addSmelting(new ItemStack(InitBlocks.blockTinOre), new ItemStack(InitItems.itemTinIngot), 1F);
		GameRegistry.addSmelting(new ItemStack(InitBlocks.blockSilverOre), new ItemStack(InitItems.itemSilverIngot), 1F);
	}

}
