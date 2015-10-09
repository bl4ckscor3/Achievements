package bl4ckscor3.plugin.achievements.achievements;


public class EndfarmWarp implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.warp.endfarm";
	}

	@Override
	public String name()
	{
		return "XP Madness";
	}

	@Override
	public String hint()
	{
		return "Warp to ?";
	}

	@Override
	public String done()
	{
		return "Visited the endfarm!";
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
