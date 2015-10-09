package bl4ckscor3.plugin.achievements.achievements;

import bl4ckscor3.plugin.achievements.inventory.AchievementInventory;

public class All implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.all.done";
	}

	@Override
	public String name()
	{
		return "Achievement Hunter";
	}

	@Override
	public String hint()
	{
		return "Ignore this, you'll get there eventually.";
	}

	@Override
	public String done()
	{
		return "Got all achievements!";
	}

	@Override
	public boolean hasProgress()
	{
		return true;
	}
	
	@Override
	public String progressPath()
	{
		return "achievement.all.progress";
	}
	
	@Override
	public int progressAmount()
	{
		return AchievementInventory.getAchievementAmount();
	}
}
