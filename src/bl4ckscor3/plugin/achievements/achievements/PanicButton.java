package bl4ckscor3.plugin.achievements.achievements;


public class PanicButton implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.interact.panicButton";
	}

	@Override
	public String name()
	{
		return "Runaway";
	}

	@Override
	public String hint()
	{
		return "AHAHAHA I SET OFF THE ALARM \"BY ACCIDENT\"";
	}

	@Override
	public String done()
	{
		return "Pushed a Panic Button!";
	}

	@Override
	public String progressPath()
	{
		return null;
	}

	@Override
	public boolean hasProgress()
	{
		return false;
	}

	@Override
	public int progressAmount()
	{
		return 0;
	}
}
