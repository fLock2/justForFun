public class Plant{
	private String name;
	private String enviro;
	private int growthTime;
	private int growthRemaining;
	public Plant(String name, String enviro, int growthTime){
		this.name = name;
		this.enviro = enviro;
		this.growthTime = growthTime;
		growthRemaining = growthTime;
	}
}
