package bl4ckscor3.plugin.achievements.achievements;


public class TownWarp implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.warp.town";
	}

	@Override
	public String name()
	{
		return "Citizen";
	}

	@Override
	public String hint()
	{
		return "Warp to ?";
	}

	@Override
	public String done()
	{
		return "Visited the town!";
	}

	@Override
	public boolean hasProgress()
	{
		return false;
	}

	@Override
	public String progressPath()
	{
		return null;
	}

	@Override
	public int progressAmount()
	{
		return 0;
	}
}
