package bl4ckscor3.plugin.achievements.achievements;


public class XMasTree implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.position.christmasTree";
	}

	@Override
	public String name()
	{
		return "Sniff";
	}

	@Override
	public String hint()
	{
		return "This is getting on my feels :(";
	}

	@Override
	public String done()
	{
		return "Visited the christmas tree monument!";
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
