package bl4ckscor3.plugin.achievements.listener;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.Plugin;

import bl4ckscor3.plugin.achievements.achievements.execute.Economy;
import bl4ckscor3.plugin.achievements.util.Utilities;

public class PlayerLoginListener implements Listener
{
	private static Plugin plugin;

	public PlayerLoginListener(Plugin pl)
	{
		plugin = pl;
	}

	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event) throws IOException
	{
		set(event.getPlayer(), plugin, false, true);
		checkCraftStatus(event.getPlayer());
		Economy.addToMap(event.getPlayer());
	}
	
	public static void set(Player p, Plugin pl, boolean clear, boolean join) throws IOException
	{
		//allhed
		Utilities.setYaml("achievement.all.done", false, p, pl, clear, join);
		Utilities.setYaml("achievement.all.progress", 0, p, pl, clear, join);
		//misc
		Utilities.setYaml("achievement.misc.rules", false, p, pl, clear, join);
		//warp
		Utilities.setYaml("achievement.warp.town", false, p, pl, clear, join);
		Utilities.setYaml("achievement.warp.endfarm", false, p, pl, clear, join);
		Utilities.setYaml("achievement.warp.skeletontrap", false, p, pl, clear, join);
		//position
		Utilities.setYaml("achievement.position.secretAgent1", false, p, pl, clear, join);
		Utilities.setYaml("achievement.position.secretAgent2", false, p, pl, clear, join);
		Utilities.setYaml("achievement.position.christmasTree", false, p, pl, clear, join);
		//pvp
		Utilities.setYaml("achievement.pvp.count", 0, p, pl, clear, join);
		Utilities.setYaml("achievement.pvp.beginner", false, p, pl, clear, join);
		Utilities.setYaml("achievement.pvp.pro", false, p, pl, clear, join);
		Utilities.setYaml("achievement.pvp.boss", false, p, pl, clear, join);
		//interact
		Utilities.setYaml("achievement.interact.panicButton", false, p, pl, clear, join);
		//place
		Utilities.setYaml("achievement.place.reinforcedPlanks.done", false, p, pl, clear, join);
		Utilities.setYaml("achievement.place.reinforcedPlanks.progress", 0, p, pl, clear, join);
		Utilities.setYaml("achievement.place.reinforcedPlanks.oak", false, p, pl, clear, join);
		Utilities.setYaml("achievement.place.reinforcedPlanks.spruce", false, p, pl, clear, join);
		Utilities.setYaml("achievement.place.reinforcedPlanks.birch", false, p, pl, clear, join);
		Utilities.setYaml("achievement.place.reinforcedPlanks.jungle", false, p, pl, clear, join);
		Utilities.setYaml("achievement.place.reinforcedPlanks.acacia", false, p, pl, clear, join);
		Utilities.setYaml("achievement.place.reinforcedPlanks.darkOak", false, p, pl, clear, join);
		//economy
		Utilities.setYaml("achievement.economy.million", false, p, pl, clear, join);
		//craft single
		Utilities.setYaml("achievement.craft.uBModifier", false, p, pl, clear, join);
		//craft all
		Utilities.setYaml("achievement.craft.all.done", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.progress", 0, p, pl, clear, join);

		Utilities.setYaml("achievement.craft.all.laserBlock", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.keypad", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.mine", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.dirtMine", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.stoneMine", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.cobbleMine", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.diamondMine", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.sandMine", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.furnaceMine", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.retinalScanner", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.keycardReader", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.ironTrapdoor", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.bouncingBetty", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.invScanner", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.trackMine", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.cageTrap", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.portableRadar", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.reinforcedIronBars", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.pwProtChest", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.usernameLogger", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.reinforcedGlassPane", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.alarm", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.reinforcedStone", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.reinforcedIronFenceGate", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.reinforcedOak", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.reinforcedSpruce", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.reinforcedBirch", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.reinforcedJungle", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.reinforcedAcacia", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.reinforcedDarkOak", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.panicButton", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.keypadFrame", false, p, pl, clear, join);
//		Utilities.setYaml("achievement.craft.all.claymore", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.pwProtFurnace", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.reinforcedDoor", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.uBRemover", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.keycard1", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.keycard2", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.keycard3", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.keycardLimited", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.keycard4", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.keycard5", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.mineRemote", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.fakeWater", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.fakeLava", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.uBModifier", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.moduleRedstone", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.moduleWhitelist", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.moduleBlacklist", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.moduleHarm", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.moduleSmart", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.wireCutter", false, p, pl, clear, join);
		Utilities.setYaml("achievement.craft.all.keyPanel", false, p, pl, clear, join);
	}
	
	private void checkCraftStatus(Player p) throws IOException
	{
		File f = new File(plugin.getDataFolder(), "playerStorage/" + p.getUniqueId() +".yml");
		YamlConfiguration yaml = YamlConfiguration.loadConfiguration(f);
		
		if(yaml.getInt("achievement.craft.all.progress") < CraftItemListener.getTotalCraftableStuff() && yaml.getBoolean("achievement.craft.all.done"))
		{
			yaml.set("achievement.craft.all.done", false);
			yaml.set("achievement.all.progress", yaml.getInt("achievement.all.progress") - 1);
			yaml.save(f);
		}
	}
}
