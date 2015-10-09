package bl4ckscor3.plugin.achievements.achievements.execute;

import java.io.IOException;
import java.util.LinkedList;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

import com.mewin.WGRegionEvents.MovementWay;
import com.mewin.WGRegionEvents.events.RegionEnteredEvent;

import bl4ckscor3.plugin.achievements.util.Utilities;

public class Position implements Listener
{
	private static LinkedList<IPosition> posAchievements = new LinkedList<IPosition>();
	private static Plugin plugin;

	public static void setup(Plugin pl)
	{
		plugin = pl;
		posAchievements.clear();
		posAchievements.add(new Secret());
		posAchievements.add(new AnotherSecret());
		posAchievements.add(new ChristmasTree());
		posAchievements.add(new Town());
		posAchievements.add(new Skeletontrap());
		posAchievements.add(new Endfarm());
	}

	@EventHandler
	public void onRegionEntered(RegionEnteredEvent event) throws IOException
	{
		for(IPosition pos : posAchievements)
		{
			if(pos.getRegionName().equalsIgnoreCase(event.getRegion().getId()))
			{
				if(pos.getRegionName().startsWith("awarp") && event.getMovementWay() != MovementWay.TELEPORT)
					continue;
				
				Utilities.achievementGet(pos.getName(), pos.getPath(), plugin, event.getPlayer());
			}
		}
	}
}