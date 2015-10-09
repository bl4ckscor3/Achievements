package bl4ckscor3.plugin.achievements.achievements;

public class Rules implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.misc.rules";
	}

	@Override
	public String name()
	{
		return "Trustworthy";
	}

	@Override
	public String hint()
	{
		return "Knowing how to behave on the server...";
	}

	@Override
	public String done()
	{
		return "Thanks for reading the rules!";
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
