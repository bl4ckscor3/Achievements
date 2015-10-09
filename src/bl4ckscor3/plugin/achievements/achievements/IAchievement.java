package bl4ckscor3.plugin.achievements.achievements;

public interface IAchievement
{
	public String path();
	
	public String name();
	
	public String hint();
	
	public String done();

	public boolean hasProgress();

	public String progressPath();
	
	public int progressAmount();
}
