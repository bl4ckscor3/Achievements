package bl4ckscor3.plugin.achievements.achievements;


public class ReinforcedPlanks implements IAchievement
{
	@Override
	public String path()
	{
		return "achievement.place.reinforcedPlanks.done";
	}

	@Override
	public String name()
	{
		return "Stylish";
	}

	@Override
	public String hint()
	{
		return "This reinforced material really is looking nice.";
	}

	@Override
	public String done()
	{
		return "Built with all Reinforced Plank types!";
	}

	@Override
	public boolean hasProgress()
	{
		return true;
	}

	@Override
	public String progressPath()
	{
		return "achievement.place.reinforcedPlanks.progress";
	}

	@Override
	public int progressAmount()
	{
		return 6;
	}
}
