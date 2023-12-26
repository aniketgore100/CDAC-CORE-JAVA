package day4;

public class Course {
	int duration;
	float fees;
	int id;
	String provider, title;
	
	
	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public float getFees() {
		return fees;
	}


	public void setFees(float fees) {
		this.fees = fees;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProvider() {
		return provider;
	}


	public void setProvider(String provider) {
		this.provider = provider;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Course(int duration, float fees, int id, String provider, String title) {
		super();
		this.duration = duration;
		this.fees = fees;
		this.id = id;
		this.provider = provider;
		this.title = title;
	}
	
}
