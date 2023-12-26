package day2;

public class TennisPlayer extends Player{
	private int aces;
	
	public TennisPlayer() {
		System.out.println("int TennisPlayer()");
	}
	public TennisPlayer(String name, int age, int access) {
	super(name, age);
	this.aces = aces;
}
   public int getAces() {
	   return aces;
}
   public void setAces(int aces) {
	   this.aces = aces;
   }
}