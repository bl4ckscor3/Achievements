package bl4ckscor3.plugin.achievements.inventory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import bl4ckscor3.plugin.achievements.achievements.All;
import bl4ckscor3.plugin.achievements.achievements.CraftAll;
import bl4ckscor3.plugin.achievements.achievements.EndfarmWarp;
import bl4ckscor3.plugin.achievements.achievements.IAchievement;
import bl4ckscor3.plugin.achievements.achievements.Millionaire;
import bl4ckscor3.plugin.achievements.achievements.PanicButton;
import bl4ckscor3.plugin.achievements.achievements.PvPBeginner;
import bl4ckscor3.plugin.achievements.achievements.PvPBoss;
import bl4ckscor3.plugin.achievements.achievements.PvPPro;
import bl4ckscor3.plugin.achievements.achievements.ReinforcedPlanks;
import bl4ckscor3.plugin.achievements.achievements.Rules;
import bl4ckscor3.plugin.achievements.achievements.SA1;
import bl4ckscor3.plugin.achievements.achievements.SA2;
import bl4ckscor3.plugin.achievements.achievements.SkeletonWarp;
import bl4ckscor3.plugin.achievements.achievements.TownWarp;
import bl4ckscor3.plugin.achievements.achievements.UBModifier;
import bl4ckscor3.plugin.achievements.achievements.XMasTree;
import bl4ckscor3.plugin.achievements.util.Utilities;

public class AchievementInventory
{
	private static final LinkedList<IAchievement> achievements = new LinkedList<IAchievement>();
	private static int achievementCount;
	
	public static void setupAchievements()
	{
		achievements.add(new Rules());
		achievements.add(new TownWarp());
		achievements.add(new EndfarmWarp());
		achievements.add(new SkeletonWarp());
		achievements.add(new UBModifier());
		achievements.add(new CraftAll());
		achievements.add(new SA1());
		achievements.add(new SA2());
		achievements.add(new XMasTree());
		achievements.add(new PvPBeginner());
		achievements.add(new PvPPro());
		achievements.add(new PvPBoss());
		achievements.add(new PanicButton());
		achievements.add(new ReinforcedPlanks());
		achievements.add(new Millionaire());
		achievements.add(new All());
		
		achievementCount = achievements.size() - 1; //subtracting one because the achievement hunter achievement doesn't count for completing itself
	}
	
	public static void open(Player p, Plugin plugin)
	{
		Inventory inv = p.getServer().createInventory(p, InventoryType.CHEST, "Achievements");

		for(IAchievement a : achievements)
		{
			boolean achieved = Utilities.hasPlayerAchievement(a.path(), p, plugin);
			ItemStack stack = new ItemStack(achieved ? Material.DIAMOND : Material.COAL);
			ItemMeta meta = stack.getItemMeta();
			List<String> lore = new ArrayList<String>();

			meta.setDisplayName(ChatColor.DARK_PURPLE + a.name());
			lore.add(ChatColor.GOLD + (achieved ? a.done() : a.hint()));
			
			if(a.hasProgress())
			{
				if(Utilities.getProgress(p, a.progressPath(), plugin) > a.progressAmount())
					lore.add(ChatColor.GOLD + "Progress: " + ChatColor.GREEN + "(" + a.progressAmount() + "/" + a.progressAmount() + ")");
				else
					lore.add(ChatColor.GOLD + "Progress: " + ChatColor.GREEN + "(" + Utilities.getProgress(p, a.progressPath(), plugin) + "/" + a.progressAmount() + ")");
			}
			
			meta.setLore(lore);
			stack.setItemMeta(meta);
			inv.addItem(stack);
		}

		p.openInventory(inv);
	}

	public static int getAchievementAmount()
	{
		return achievementCount;
	}

	public static LinkedList<IAchievement> getAchievements()
	{
		return achievements;
	}
}
