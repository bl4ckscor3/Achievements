package bl4ckscor3.plugin.achievements.achievements.execute;

public class Town implements IPosition
{
	@Override
	public String getRegionName()
	{
		return "awarptown";
	}

	@Override
	public String getName()
	{
		return "Citizen";
	}

	@Override
	public String getPath()
	{
		return "achievement.warp.town";
	}
}
