package bl4ckscor3.plugin.achievements.achievements;


public class PvPBoss implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.pvp.boss";
	}

	@Override
	public String name()
	{
		return "PvP Boss";
	}

	@Override
	public String hint()
	{
		return "Keep 'dem kills comin'!";
	}

	@Override
	public String done()
	{
		return "Killed 100 players in the PvP arena!";
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
		return 100;
	}
}
