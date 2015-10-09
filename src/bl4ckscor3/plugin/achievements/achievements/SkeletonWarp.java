package bl4ckscor3.plugin.achievements.achievements;


public class SkeletonWarp implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.warp.skeletontrap";
	}

	@Override
	public String name()
	{
		return "Oldschool";
	}

	@Override
	public String hint()
	{
		return "Warp to ?";
	}

	@Override
	public String done()
	{
		return "Visited the skeletontrap!";
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
