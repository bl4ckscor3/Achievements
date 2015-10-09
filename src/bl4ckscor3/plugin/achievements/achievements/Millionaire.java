package bl4ckscor3.plugin.achievements.achievements;


public class Millionaire implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.economy.million";
	}

	@Override
	public String name()
	{
		return "Millionaire";
	}

	@Override
	public String hint()
	{
		return "I don't know what this is...";
	}

	@Override
	public String done()
	{
		return "Got $1 000 000!";
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
