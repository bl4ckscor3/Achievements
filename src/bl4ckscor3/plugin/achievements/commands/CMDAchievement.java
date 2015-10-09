package bl4ckscor3.plugin.achievements.commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import bl4ckscor3.plugin.achievements.achievements.IAchievement;
import bl4ckscor3.plugin.achievements.inventory.AchievementInventory;
import bl4ckscor3.plugin.achievements.listener.PlayerLoginListener;
import bl4ckscor3.plugin.achievements.util.Utilities;
import bl4ckscor3.plugin.bl4ckkitCore.core.bl4ckkitCore;

public class CMDAchievement
{
	public static void exe(Player p, String[] args, Plugin plugin) throws IOException
	{
		if(args.length == 0)
			AchievementInventory.open(p, plugin);
		else if(args.length == 1)
		{
			if(args[0].equalsIgnoreCase("clear"))
			{
				if(p.hasPermission("achievements.clear"))
				{
					PlayerLoginListener.set(p, plugin, true, false);
					bl4ckkitCore.getMessageManager().sendChatMessage(p, plugin, "Successfully wiped all your achievements.");
				}
			}
			else
			{
				if(p.hasPermission("achievements.show.others"))
				{
					Inventory inv = p.getServer().createInventory(p, InventoryType.CHEST, "Achievements of " + args[0]);

					for(IAchievement a : AchievementInventory.getAchievements())
					{
						boolean achieved = Utilities.hasPlayerAchievement(a.path(), (bl4ckkitCore.getPlayerManager().isPlayerOnline(args[0]) ? Bukkit.getPlayer(args[0]) : Bukkit.getOfflinePlayer(args[0])), plugin);
						ItemStack stack = new ItemStack(achieved ? Material.DIAMOND : Material.COAL);
						ItemMeta meta = stack.getItemMeta();
						List<String> lore = new ArrayList<String>();

						meta.setDisplayName(ChatColor.DARK_PURPLE + a.name());
						lore.add(ChatColor.GOLD + (achieved ? a.done() : a.hint()));
						
						if(a.hasProgress())
						{
							if(Utilities.getProgress((bl4ckkitCore.getPlayerManager().isPlayerOnline(args[0]) ? Bukkit.getPlayer(args[0]) : Bukkit.getOfflinePlayer(args[0])), a.progressPath(), plugin) > a.progressAmount())
								lore.add(ChatColor.GOLD + "Progress: " + ChatColor.GREEN + "(" + a.progressAmount() + "/" + a.progressAmount() + ")");
							else
								lore.add(ChatColor.GOLD + "Progress: " + ChatColor.GREEN + "(" + Utilities.getProgress((bl4ckkitCore.getPlayerManager().isPlayerOnline(args[0]) ? Bukkit.getPlayer(args[0]) : Bukkit.getOfflinePlayer(args[0])), a.progressPath(), plugin) + "/" + a.progressAmount() + ")");
						}
						
						meta.setLore(lore);
						stack.setItemMeta(meta);
						inv.addItem(stack);
					}
					
					p.openInventory(inv);
				}
			}
		}
		else if(args.length == 2)
		{
			if(p.hasPermission("achievements.clear.others"))
			{
				if(bl4ckkitCore.getPlayerManager().isPlayerOnline(args[1]))
				{
					PlayerLoginListener.set(Bukkit.getPlayer(args[1]), plugin, true, false);
					bl4ckkitCore.getMessageManager().sendChatMessage(p, plugin, "Successfully wiped all achievements from " + args[1] + ".");
					bl4ckkitCore.getMessageManager().sendChatMessage(Bukkit.getPlayer(args[1]), plugin, "Your achievements have been wiped. If you want more information on that, please talk to a staff member.");
				}
				else
					bl4ckkitCore.getMessageManager().sendChatMessage(p, plugin, args[1] + " is not online.");
			}
		}
	}
}
