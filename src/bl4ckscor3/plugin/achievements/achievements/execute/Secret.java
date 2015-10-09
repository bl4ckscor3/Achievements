package bl4ckscor3.plugin.achievements.achievements.execute;

public class Secret implements IPosition
{
	@Override
	public String getRegionName()
	{
		return "secret";
	}

	@Override
	public String getName()
	{
		return "Secret Agent 1";
	}

	@Override
	public String getPath()
	{
		return "achievement.position.secretAgent1";
	}
}
