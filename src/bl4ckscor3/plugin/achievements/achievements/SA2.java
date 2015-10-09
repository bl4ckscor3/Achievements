package bl4ckscor3.plugin.achievements.achievements;


public class SA2 implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.position.secretAgent2";
	}

	@Override
	public String name()
	{
		return "Secret Agent 2";
	}

	@Override
	public String hint()
	{
		return "You have to search...";
	}

	@Override
	public String done()
	{
		return "Found another secret!";
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
