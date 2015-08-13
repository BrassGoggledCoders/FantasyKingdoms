package fantasykingdoms.common;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class CommandMagic extends CommandBase
{

	@Override
	public String getCommandName()
	{
		return "incantatio";
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_)
	{
		return "/incantatio <form> <modifiers>";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] params)
	{
		if ((params.length > 0) && (sender instanceof EntityPlayer))
		{
			EntityPlayer player = (EntityPlayer) sender;
			String spell = params[0];
			String modifier1 = params[1];
			if (spell == "potio")
			{
				if (modifier1 == "ignis")
				{
					player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 50, 1, true));
				}
				else if (modifier1 == "celeritas")
				{
					player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 50, 1, true));
				}
			}
		}
	}

}
