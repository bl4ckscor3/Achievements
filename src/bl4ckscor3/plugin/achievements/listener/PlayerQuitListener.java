package bl4ckscor3.plugin.achievements.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import bl4ckscor3.plugin.achievements.achievements.execute.Economy;

public class PlayerQuitListener implements Listener
{
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event)
	{
		Economy.removeFromMap(event.getPlayer());
	}
}
