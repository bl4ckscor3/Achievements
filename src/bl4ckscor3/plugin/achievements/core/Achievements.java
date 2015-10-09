package bl4ckscor3.plugin.achievements.core;

import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import bl4ckscor3.plugin.achievements.achievements.execute.Economy;
import bl4ckscor3.plugin.achievements.achievements.execute.Position;
import bl4ckscor3.plugin.achievements.commands.CMDAchievement;
import bl4ckscor3.plugin.achievements.commands.CMDRules;
import bl4ckscor3.plugin.achievements.inventory.AchievementInventory;
import bl4ckscor3.plugin.achievements.listener.BalanceChangeListener;
import bl4ckscor3.plugin.achievements.listener.BlockPlaceListener;
import bl4ckscor3.plugin.achievements.listener.CraftItemListener;
import bl4ckscor3.plugin.achievements.listener.InventoryClickListener;
import bl4ckscor3.plugin.achievements.listener.PlayerDeathListener;
import bl4ckscor3.plugin.achievements.listener.PlayerInteractListener;
import bl4ckscor3.plugin.achievements.listener.PlayerLoginListener;
import bl4ckscor3.plugin.achievements.listener.PlayerQuitListener;
import bl4ckscor3.plugin.bl4ckkitCore.core.bl4ckkitCore;
import bl4ckscor3.plugin.bl4ckkitCore.exception.PluginNotInstalledException;

public class Achievements extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		bl4ckkitCore.getPluginManager().registerEvents(this, 
				new InventoryClickListener(),
				new PlayerLoginListener(this),
				new PlayerQuitListener(),
				new CraftItemListener(this),
				new PlayerDeathListener(this),
				new Position(),
				new PlayerInteractListener(this),
				new BlockPlaceListener(this),
				new BalanceChangeListener(this));
		
		try
		{
			Economy.setup(this);
		}
		catch (PluginNotInstalledException e)
		{
			e.printStackTrace();
		}

		Position.setup(this);
		Economy.startScheduling(this);
		AchievementInventory.setupAchievements();
		bl4ckkitCore.registerPlugin(this);
		bl4ckkitCore.getMessageManager().sendEnabledMessage(this);
	}

	@Override
	public void onDisable()
	{
		bl4ckkitCore.unregisterPlugin(this);
		bl4ckkitCore.getMessageManager().sendDisabledMessage(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		try
		{
			Player p = null;

			if(sender instanceof Player)
				p = (Player)sender;
			else
			{
				bl4ckkitCore.getMessageManager().sendDisallowMessage(this);
				return true;
			}

			if(cmd.getName().equalsIgnoreCase("achievements"))
			{
				if(args.length > 2)
					return false;

				CMDAchievement.exe(p, args, this);
				return true;
			}
			else if(cmd.getName().equalsIgnoreCase("rules"))
			{
				CMDRules.exe(p, args, this);
				return true;
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		return false;
	}
}
