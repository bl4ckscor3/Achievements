package bl4ckscor3.plugin.achievements.listener;

import java.io.IOException;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.plugin.Plugin;

import bl4ckscor3.plugin.achievements.util.Utilities;

public class CraftItemListener implements Listener
{
	private final Plugin plugin;
	private final String freak = "Security Freak";
	private final String allCraftBase = "achievement.craft.all.";
	private final String allCraftCounter = "achievement.craft.all.progress";
	private final String allCraftDone = "achievement.craft.all.done";
	private static final int totalCraftableStuff = 51;

	public CraftItemListener(Plugin pl)
	{
		plugin = pl;
	}

	@EventHandler
	public void onCraftItem(CraftItemEvent event) throws IOException
	{
		int itemId = event.getRecipe().getResult().getTypeId();
		int itemHashCode = event.getRecipe().getResult().hashCode();
		Player p = (Player)event.getWhoClicked();

		switch(itemId)
		{
			case 165: //laser block
				Utilities.progressGet(freak, allCraftBase + "laserBlock", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 167: //keypad
				Utilities.progressGet(freak, allCraftBase + "keypad", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 168: //mine
				Utilities.progressGet(freak, allCraftBase + "mine", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 176: //dirt mine
				Utilities.progressGet(freak, allCraftBase + "dirtMine", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 177: //stone mine
				Utilities.progressGet(freak, allCraftBase + "stoneMine", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 178: //cobblestone mine
				Utilities.progressGet(freak, allCraftBase + "cobbleMine", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 179: //diamond mine
				Utilities.progressGet(freak, allCraftBase + "diamondMine", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 180: //sand mine
				Utilities.progressGet(freak, allCraftBase + "sandMine", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 181: //furnace mine
				Utilities.progressGet(freak, allCraftBase + "furnaceMine", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 182: //retinal scanner
				Utilities.progressGet(freak, allCraftBase + "retinalScanner", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 188: //keycard reader
				Utilities.progressGet(freak, allCraftBase + "keycardReader", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 189: //iron trapdoor
				Utilities.progressGet(freak, allCraftBase + "ironTrapdoor", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 190: //bouncing betty
				Utilities.progressGet(freak, allCraftBase + "bouncingBetty", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 191: //inventory scanner
				Utilities.progressGet(freak, allCraftBase + "invScanner", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 193: //track mine
				Utilities.progressGet(freak, allCraftBase + "trackMine", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 194: //cage trap
				Utilities.progressGet(freak, allCraftBase + "cageTrap", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 195: //portable radar
				Utilities.progressGet(freak, allCraftBase + "portableRadar", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 197: //reinforced iron bars
				Utilities.progressGet(freak, allCraftBase + "reinforcedIronBars", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 198: //password-protected chest
				Utilities.progressGet(freak, allCraftBase + "pwProtChest", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 199: //username logger
				Utilities.progressGet(freak, allCraftBase + "usernameLogger", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 200: //reinforced glass panes
				Utilities.progressGet(freak, allCraftBase + "reinforcedGlassPane", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 201: //alarm
				Utilities.progressGet(freak, allCraftBase + "alarm", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 203: //reinforced stone
				Utilities.progressGet(freak, allCraftBase + "reinforcedStone", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 204: //reinforced iron fence gate
				Utilities.progressGet(freak, allCraftBase + "reinforcedIronFenceGate", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 205: //reinforced planks
				switch(itemHashCode)
				{
					case 7035481:
						Utilities.progressGet(freak, allCraftBase + "reinforcedOak", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
					case 7035512:
						Utilities.progressGet(freak, allCraftBase + "reinforcedSpruce", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
					case 7035543:
						Utilities.progressGet(freak, allCraftBase + "reinforcedBirch", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
					case 7035574:
						Utilities.progressGet(freak, allCraftBase + "reinforcedJungle", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
					case 7035605:
						Utilities.progressGet(freak, allCraftBase + "reinforcedAcacia", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
					case 7035636:
						Utilities.progressGet(freak, allCraftBase + "reinforcedDarkOak", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
				}
				break;
			case 206: //panic button
				Utilities.progressGet(freak, allCraftBase + "panicButton", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 207: //keypad frame
				Utilities.progressGet(freak, allCraftBase + "keypadFrame", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
//			case 208: //claymore
//				Utilities.progressGet(freak, allCraftBase + "claymore", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
//				break;
			case 210: //password-protected furnace
				Utilities.progressGet(freak, allCraftBase + "pwProtFurnace", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4097: //reinforced iron door
				Utilities.progressGet(freak, allCraftBase + "reinforcedDoor", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4098: //universal block remover
				Utilities.progressGet(freak, allCraftBase + "uBRemover", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4099: //keycards
				switch(itemHashCode)
				{
					case 123037791:
						Utilities.progressGet(freak, allCraftBase + "keycard1", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
					case 123037822:
						Utilities.progressGet(freak, allCraftBase + "keycard2", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
					case 123037853:
						Utilities.progressGet(freak, allCraftBase + "keycard3", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
					case 123037884:
						Utilities.progressGet(freak, allCraftBase + "keycardLimited", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
					case 123037915:
						Utilities.progressGet(freak, allCraftBase + "keycard4", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
					case 123037946:
						Utilities.progressGet(freak, allCraftBase + "keycard5", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
						break;
				}
				break;
			case 4100: //mine remote access tool
				Utilities.progressGet(freak, allCraftBase + "mineRemote", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4101: //bucket of fake water
				Utilities.progressGet(freak, allCraftBase + "fakeWater", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4102: //bucket of fake lava
				Utilities.progressGet(freak, allCraftBase + "fakeLava", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4103: //universal block modifier
				Utilities.achievementGet("Advanced", "achievement.craft.uBModifier", plugin, p);
				Utilities.progressGet(freak, allCraftBase + "uBModifier", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4104: //redstone module
				Utilities.progressGet(freak, allCraftBase + "moduleRedstone", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4105: //whitelist module
				Utilities.progressGet(freak, allCraftBase + "moduleWhitelist", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4106: //blacklist module
				Utilities.progressGet(freak, allCraftBase + "moduleBlacklist", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4107: //harming module
				Utilities.progressGet(freak, allCraftBase + "moduleHarm", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4108: //smart module
				Utilities.progressGet(freak, allCraftBase + "moduleSmart", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4109: //wire cutter
				Utilities.progressGet(freak, allCraftBase + "wireCutter", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
			case 4111: //key panel
				Utilities.progressGet(freak, allCraftBase + "keyPanel", allCraftCounter, allCraftDone, totalCraftableStuff, plugin, p);
				break;
		}
	}
	
	public static int getTotalCraftableStuff()
	{
		return totalCraftableStuff;
	}
}
