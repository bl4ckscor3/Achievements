package bl4ckscor3.plugin.achievements.commands;

import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import bl4ckscor3.plugin.achievements.util.Utilities;

public class CMDRules
{
	public static void exe(Player p, String[] args, Plugin plugin) throws IOException
	{
		String sArgs = "";

		Utilities.achievementGet("Trustworthy", "achievement.misc.rules", plugin, p);

		if(args.length != 0)
		{
			for(String s : args)
			{
				sArgs += s + " ";
			}
		}

		Bukkit.dispatchCommand(p, "erules " + sArgs);
	}
}
