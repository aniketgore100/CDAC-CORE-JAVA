package day4;

public class AvgDur extends CourseDataCalculator {
	public float doCalculation(Course[] allCourses) {
		float duration = 0;
		for(Course i : allCourses) {
			duration += i.getDuration();
		}
		return duration / 5;
	}
}
