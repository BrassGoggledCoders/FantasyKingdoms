package fantasykingdoms.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import fantasykingdoms.common.blocks.BaseBlock;
import fantasykingdoms.common.blocks.BlockBarrel;
import fantasykingdoms.common.blocks.BlockExplosiveBarrel;
import fantasykingdoms.common.blocks.BlockFluidBeer;
import fantasykingdoms.common.blocks.BlockWithItemDrop;
import fantasykingdoms.common.blocks.FluidBeer;
import fantasykingdoms.common.items.BaseItem;
import fantasykingdoms.common.items.ItemEmptyTankard;
import fantasykingdoms.common.items.ItemTankard;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "fantasykingdoms", name = "Fantast Kingdoms", version = "1.0.0")
public class FantasyKingdoms
{
	public static Fluid beerFluid;
	public static Block blockBeer, blockBarrel, blockExplosiveBarrel;
	public static Block blockRubyOre, blockSapphireOre, blockAmethystOre, blockCopperOre, blockTinOre, blockSilverOre;

	public static Item itemEmptyTankard, itemFullTankard;
	public static Item itemRuby, itemSapphire, itemAmethyst;

	@Mod.Instance("fantasykingdoms")
	public static FantasyKingdoms instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		LanguageRegistry.instance().getStringLocalization("itemGroup.fantasykingdoms", "en_US");

		// Blocks
		blockRubyOre = new BlockWithItemDrop(Material.rock, itemRuby).setBlockName("blockRubyOre");
		GameRegistry.registerBlock(blockRubyOre, "BlockRubyOre");
		blockSapphireOre = new BlockWithItemDrop(Material.rock, itemSapphire).setBlockName("blockSapphireOre");
		GameRegistry.registerBlock(blockSapphireOre, "BlockSapphireOre");
		blockAmethystOre = new BlockWithItemDrop(Material.rock, itemAmethyst).setBlockName("blockAmethystOre");
		GameRegistry.registerBlock(blockAmethystOre, "BlockAmethystOre");
		blockCopperOre = new BaseBlock(Material.rock).setBlockName("blockCopperOre");
		GameRegistry.registerBlock(blockCopperOre, "BlockCopperOre");
		blockTinOre = new BaseBlock(Material.rock).setBlockName("blockTinOre");
		GameRegistry.registerBlock(blockTinOre, "BlockTinOre");
		blockSilverOre = new BaseBlock(Material.rock).setBlockName("blockSilverOre");
		GameRegistry.registerBlock(blockSilverOre, "BlockSilverOre");

		beerFluid = new FluidBeer("beer").setUnlocalizedName("beerFluid");

		if (!FluidRegistry.registerFluid(beerFluid) && !FluidRegistry.isFluidRegistered("beer"))
			beerFluid = FluidRegistry.getFluid("beer");

		blockBeer = new BlockFluidBeer(beerFluid, Material.water).setBlockName("beerFluidBlock");

		GameRegistry.registerBlock(blockBeer, "blockBeer");

		blockBarrel = new BlockBarrel(Material.wood).setBlockName("blockBarrel");
		GameRegistry.registerBlock(blockBarrel, "BlockBarrel");

		blockExplosiveBarrel = new BlockExplosiveBarrel(Material.wood).setBlockName("blockExplosiveBarrel");
		GameRegistry.registerBlock(blockExplosiveBarrel, "BlockExplosiveBarrel");

		// Items
		itemEmptyTankard = new ItemEmptyTankard().setUnlocalizedName("itemEmptyTankard");
		itemFullTankard = new ItemTankard().setUnlocalizedName("itemFullTankard");
		GameRegistry.registerItem(itemEmptyTankard, "ItemEmptyTankard");
		GameRegistry.registerItem(itemFullTankard, "ItemFullTankard");

		itemRuby = new BaseItem().setUnlocalizedName("itemRuby");
		GameRegistry.registerItem(itemRuby, "ItemRuby");
		itemSapphire = new BaseItem().setUnlocalizedName("itemSapphire");
		GameRegistry.registerItem(itemSapphire, "ItemSapphire");
		itemAmethyst = new BaseItem().setUnlocalizedName("itemAmethyst");
		GameRegistry.registerItem(itemAmethyst, "ItemAmethyst");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		OreDictionary.registerOre("oreRuby", blockRubyOre);
		OreDictionary.registerOre("oreSapphire", blockSapphireOre);
		OreDictionary.registerOre("oreAmethyst", blockAmethystOre);
		OreDictionary.registerOre("oreCopper", blockCopperOre);
		OreDictionary.registerOre("oreTin", blockTinOre);
		OreDictionary.registerOre("oreSilver", blockSilverOre);
		OreDictionary.registerOre("gemRuby", itemRuby);
		OreDictionary.registerOre("gemSapphire", itemSapphire);
		OreDictionary.registerOre("gemAmethyst", itemAmethyst);
	}

	@Mod.EventHandler
	public void serverStart(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandMagic());
	}
}