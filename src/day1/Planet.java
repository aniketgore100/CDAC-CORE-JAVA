package day1;

public class Planet {
	private String name;
	private int moons;
	
	public void assignvalues(String nm, int moon) {
		name = nm;
		moons = moon;		
	}
	public String retrive() {
		String info = name + ", " + moons;
		return info;
	}
}
