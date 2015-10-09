package bl4ckscor3.plugin.achievements.listener;

import java.io.IOException;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

import bl4ckscor3.plugin.achievements.event.BalanceChangeEvent;
import bl4ckscor3.plugin.achievements.util.Utilities;

public class BalanceChangeListener implements Listener
{
	private static Plugin plugin;
	
	public BalanceChangeListener(Plugin pl)
	{
		plugin = pl;
	}
	
	@EventHandler
	public void onBalanceChange(BalanceChangeEvent event) throws IOException
	{
		if(event.getCurrentMoney().intValue() >= 1000000)
			Utilities.achievementGet("Millionaire", "achievement.economy.million", plugin, event.getUser().getPlayer());
	}
}
