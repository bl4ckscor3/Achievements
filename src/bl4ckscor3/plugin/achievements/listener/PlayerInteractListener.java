package bl4ckscor3.plugin.achievements.listener;

import java.io.IOException;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;

import bl4ckscor3.plugin.achievements.util.Utilities;

public class PlayerInteractListener implements Listener
{
	private final Plugin plugin;

	public PlayerInteractListener(Plugin pl)
	{
		plugin = pl;
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) throws IOException
	{
		if(event.getAction() == Action.RIGHT_CLICK_BLOCK)
		{
			if(event.getClickedBlock().getTypeId() == 206)
				Utilities.achievementGet("Runaway", "achievement.interact.panicButton", plugin, event.getPlayer());
		}
	}
}
