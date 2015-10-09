package bl4ckscor3.plugin.achievements.achievements.execute;

import java.math.BigDecimal;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import bl4ckscor3.plugin.achievements.event.BalanceChangeEvent;
import bl4ckscor3.plugin.bl4ckkitCore.core.bl4ckkitCore;
import bl4ckscor3.plugin.bl4ckkitCore.exception.PluginNotInstalledException;

import com.earth2me.essentials.Essentials;
import com.earth2me.essentials.User;

public class Economy
{
	private static Essentials ess;
	private static HashMap<String, BigDecimal> balances = new HashMap<String, BigDecimal>();

	public static void setup(Plugin pl) throws PluginNotInstalledException
	{
		ess = (Essentials)bl4ckkitCore.getPluginManager().getPlugin(pl, "Essentials");
	}
	
	public static void startScheduling(Plugin plugin)
	{
		plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable()
		{
			@Override
			public void run() 
			{
				for(Player p : Bukkit.getOnlinePlayers()) 
				{
					User u = ess.getUser(p);
					
					if(u.getMoney() != balances.get(p.getName()))
					{
						BigDecimal previous = balances.get(p.getName());
						
						balances.put(p.getName(), u.getMoney());
						Bukkit.getServer().getPluginManager().callEvent(new BalanceChangeEvent(u, previous, balances.get(p.getName())));
					}
				}
			}
		}, 0, 20);
	}

	public static void addToMap(Player p)
	{
		balances.put(p.getName(), ess.getUser(p).getMoney());
	}

	public static void removeFromMap(Player p)
	{
		if(balances.containsKey(p.getName()))
			balances.remove(p.getName());
	}
}
