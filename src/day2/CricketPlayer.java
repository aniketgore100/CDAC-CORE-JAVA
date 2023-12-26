package day2;

public class CricketPlayer extends Player{
	private float battingAvg;
	
	public CricketPlayer() {
		System.out.println("in CricketPlayer()");
	}
	
	public CricketPlayer(String name, int age, float battingAvg) {
		super(age, name);
		this.battingAvg = battingAvg;
	}
	
	public float getBattingAvg() {
		return battingAvg;
	}
	
	public void setBattingAvg(float battingAvg) {
		this.battingAvg = battingAvg;
	}
}
