package fantasykingdoms.common.init;

import cpw.mods.fml.common.registry.EntityRegistry;

import fantasykingdoms.common.FantasyKingdoms;
import fantasykingdoms.common.entity.EntityBarrelPrimed;

public class InitEntities
{
	public static void init()
	{
		int entID = 0;
		EntityRegistry.registerModEntity(EntityBarrelPrimed.class, "BarrelPrimed", entID++, FantasyKingdoms.modInstance, 40, 1, true);
	}
}
