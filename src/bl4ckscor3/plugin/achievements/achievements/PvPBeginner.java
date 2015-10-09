package bl4ckscor3.plugin.achievements.achievements;


public class PvPBeginner implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.pvp.beginner";
	}

	@Override
	public String name()
	{
		return "PvP Beginner";
	}

	@Override
	public String hint()
	{
		return "Keep 'dem kills comin'!";
	}

	@Override
	public String done()
	{
		return "Killed 10 players in the PvP arena!";
	}

	@Override
	public boolean hasProgress()
	{
		return true;
	}
	
	@Override
	public String progressPath()
	{
		return "achievement.pvp.count";
	}

	@Override
	public int progressAmount()
	{
		return 10;
	}
}
