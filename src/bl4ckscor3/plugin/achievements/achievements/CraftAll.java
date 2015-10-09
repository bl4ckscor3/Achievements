package bl4ckscor3.plugin.achievements.achievements;

import bl4ckscor3.plugin.achievements.listener.CraftItemListener;

public class CraftAll implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.craft.all.done";
	}

	@Override
	public String name()
	{
		return "Security Freak";
	}

	@Override
	public String hint()
	{
		return "Crafting is the solution!";
	}

	@Override
	public String done()
	{
		return "Crafted every Security block/item!";
	}

	@Override
	public boolean hasProgress()
	{
		return true;
	}
	
	@Override
	public String progressPath()
	{
		return "achievement.craft.all.progress";
	}

	@Override
	public int progressAmount()
	{
		return CraftItemListener.getTotalCraftableStuff();
	}
}
