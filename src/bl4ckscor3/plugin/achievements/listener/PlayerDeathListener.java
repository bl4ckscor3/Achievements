package bl4ckscor3.plugin.achievements.listener;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.Plugin;

import bl4ckscor3.plugin.achievements.util.Utilities;

public class PlayerDeathListener implements Listener
{
	private static Plugin plugin;
	
	public PlayerDeathListener(Plugin pl)
	{
		plugin = pl;
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) throws IOException
	{
		if(!(event.getEntity().getKiller() instanceof Player))
			return;
				
		Player p = event.getEntity().getKiller();
		File f = new File(plugin.getDataFolder(), "playerStorage/" + p.getUniqueId() + ".yml");
		YamlConfiguration yaml = YamlConfiguration.loadConfiguration(f);
		int pvpCount = yaml.getInt("achievement.pvp.count");

		yaml.set("achievement.pvp.count", ++pvpCount);
		yaml.save(f);
		
		if(pvpCount >= 10)
			Utilities.achievementGet("PvP Beginner", "achievement.pvp.beginner", plugin, p);
		else if(pvpCount >= 50)
			Utilities.achievementGet("PvP Pro", "achievement.pvp.pro", plugin, p);
		else if(pvpCount >= 100)
			Utilities.achievementGet("PvP Boss", "achievement.pvp.boss", plugin, p);
	}
}
