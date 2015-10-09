package bl4ckscor3.plugin.achievements.listener;

import java.io.IOException;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.Plugin;

import bl4ckscor3.plugin.achievements.util.Utilities;

public class BlockPlaceListener implements Listener
{
	private static Plugin plugin;
	
	public BlockPlaceListener(Plugin pl)
	{
		plugin = pl;
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event) throws IOException
	{
		int typeId = event.getBlock().getTypeId();
		int metadata = event.getBlock().getData();
	
		if(typeId == 205)
		{
			switch(metadata)
			{
				case 0:
					Utilities.progressGet("Stylish", "achievement.place.reinforcedPlanks.oak", "achievement.place.reinforcedPlanks.progress", "achievement.place.reinforcedPlanks.done", 6, plugin, event.getPlayer());
					break;
				case 1:
					Utilities.progressGet("Stylish", "achievement.place.reinforcedPlanks.spruce", "achievement.place.reinforcedPlanks.progress", "achievement.place.reinforcedPlanks.done", 6, plugin, event.getPlayer());
					break;
				case 2:
					Utilities.progressGet("Stylish", "achievement.place.reinforcedPlanks.birch", "achievement.place.reinforcedPlanks.progress", "achievement.place.reinforcedPlanks.done", 6, plugin, event.getPlayer());
					break;
				case 3:
					Utilities.progressGet("Stylish", "achievement.place.reinforcedPlanks.jungle", "achievement.place.reinforcedPlanks.progress", "achievement.place.reinforcedPlanks.done", 6, plugin, event.getPlayer());
					break;
				case 4:
					Utilities.progressGet("Stylish", "achievement.place.reinforcedPlanks.acacia", "achievement.place.reinforcedPlanks.progress", "achievement.place.reinforcedPlanks.done", 6, plugin, event.getPlayer());
					break;
				case 5:
					Utilities.progressGet("Stylish", "achievement.place.reinforcedPlanks.darkOak", "achievement.place.reinforcedPlanks.progress", "achievement.place.reinforcedPlanks.done", 6, plugin, event.getPlayer());
					break;
			}
		}
	}
}
