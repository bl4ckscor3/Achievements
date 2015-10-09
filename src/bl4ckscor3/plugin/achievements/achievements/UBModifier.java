package bl4ckscor3.plugin.achievements.achievements;


public class UBModifier implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.craft.uBModifier";
	}

	@Override
	public String name()
	{
		return "Advanced";
	}

	@Override
	public String hint()
	{
		return "I didn't know that I can modify these blocks...";
	}

	@Override
	public String done()
	{
		return "Crafted a Universal Block Modifier!";
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
