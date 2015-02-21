package fantasykingdoms.common.Init;

import cpw.mods.fml.common.registry.GameRegistry;
import fantasykingdoms.common.items.*;

/**
 * Created by Toby on 20/02/2015.
 */
public class ItemRegistry
{
    public static final BaseItem itemRuby = new itemRuby();
    public static final BaseItem itemSapphire = new itemSapphire();
    public static final BaseItem itemAmethyst = new itemAmethyst();

    public static final BaseItem itemEmptyTankard = new ItemEmptyTankard();
    public static final BaseItem itemFullTankard = new ItemTankard();

    public static void registerItems()
    {
        GameRegistry.registerItem(itemRuby, "itemRuby");
        GameRegistry.registerItem(itemSapphire, "itemSapphire");
        GameRegistry.registerItem(itemAmethyst, "itemAmethyst");

        GameRegistry.registerItem(itemEmptyTankard, "ItemEmptyTankard");
        GameRegistry.registerItem(itemFullTankard, "ItemTankard");
    }
}
