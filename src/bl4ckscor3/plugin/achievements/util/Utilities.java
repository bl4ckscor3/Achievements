package bl4ckscor3.plugin.achievements.util;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import bl4ckscor3.plugin.achievements.inventory.AchievementInventory;
import bl4ckscor3.plugin.bl4ckkitCore.core.bl4ckkitCore;

public class Utilities
{
	public static void setYaml(String path, Object value, Player p, Plugin plugin, boolean clear, boolean join) throws IOException
	{
		File folder = new File(plugin.getDataFolder(), "playerStorage");
		File f = new File(plugin.getDataFolder(), "playerStorage/" + p.getUniqueId() +".yml");
		YamlConfiguration yaml = YamlConfiguration.loadConfiguration(f);

		if(clear)
		{
			yaml.set(path, value);
			yaml.save(f);
			return;
		}

		if(!folder.exists())
			folder.mkdirs();

		if(!f.exists())
			f.createNewFile();

		if(join)
		{
			if(value instanceof Integer)
			{
				if(yaml.getInt(path) == 0)
					yaml.set(path, value);
			}
			else if(value instanceof Boolean)
			{
				if(!yaml.getBoolean(path))
					yaml.set(path, value);
			}
		}
		else
		{
			if(!yaml.getBoolean(path))
				yaml.set(path, value);
		}
	}

	public static void progressGet(String achievementName, String path, String counterPath, String donePath, int total, Plugin plugin, Player p) throws IOException
	{
		File f = new File(plugin.getDataFolder(), "playerStorage/" + p.getUniqueId() + ".yml");
		YamlConfiguration yaml = YamlConfiguration.loadConfiguration(f);

		if(!yaml.getBoolean(path) && yaml.getInt(counterPath) != total)
		{
			int amount = yaml.getInt(counterPath);

			yaml.set(path, true);
			yaml.set(counterPath, ++amount);
			yaml.save(f);
		}

		if(yaml.getInt(counterPath) == total && !yaml.getBoolean(donePath))
			achievementGet(achievementName, donePath, plugin, p);
	}

	public static void progressGetAll(String achievementName, String counterPath, String donePath, int total, Plugin plugin, Player p) throws IOException
	{
		File f = new File(plugin.getDataFolder(), "playerStorage/" + p.getUniqueId() + ".yml");
		YamlConfiguration yaml = YamlConfiguration.loadConfiguration(f);

		int amount = yaml.getInt(counterPath);

		yaml.set(counterPath, ++amount);
		yaml.save(f);

		if(yaml.getInt(counterPath) == total && !yaml.getBoolean(donePath))
			achievementGet(achievementName, donePath, plugin, p);
	}

	public static void achievementGet(String achievementName, String path, Plugin plugin, Player p) throws IOException
	{
		File f = new File(plugin.getDataFolder(), "playerStorage/" + p.getUniqueId() + ".yml");
		YamlConfiguration yaml = YamlConfiguration.loadConfiguration(f);

		if(!yaml.getBoolean(path))
		{
			yaml.set(path, true);
			Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "playsound fireworks.largeBlast " + p.getName());
			p.sendMessage(ChatColor.GOLD + "Achievement get: " + ChatColor.GREEN + achievementName + ChatColor.GOLD + "!");
			yaml.save(f);

			if(achievementName.equals("Citizen"))
				bl4ckkitCore.getMessageManager().sendChatMessage(p, plugin, "Use /a to see your achievement progress!");
			
			if(!path.equals("achievement.all.done"))
				progressGetAll("Achievement Hunter", "achievement.all.progress", "achievement.all.done", AchievementInventory.getAchievementAmount(), plugin, p);
		}
	}

	public static boolean hasPlayerAchievement(String path, Player p, Plugin plugin)
	{
		return YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "playerStorage/" + p.getUniqueId() +".yml")).getBoolean(path);
	}

	public static boolean hasPlayerAchievement(String path, OfflinePlayer p, Plugin plugin)
	{
		return YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "playerStorage/" + p.getUniqueId() +".yml")).getBoolean(path);
	}

	public static int getProgress(Player p, String path, Plugin plugin)
	{
		return YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "playerStorage/" + p.getUniqueId() +".yml")).getInt(path);
	}

	public static int getProgress(OfflinePlayer p, String path, Plugin plugin)
	{
		return YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "playerStorage/" + p.getUniqueId() +".yml")).getInt(path);
	}	
}
