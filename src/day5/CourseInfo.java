package day5;

public class CourseInfo {
	String provider;
	int duration;
	
	public CourseInfo(String provider, int duration) {
		super();
		this.provider = provider;
		this.duration = duration;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
