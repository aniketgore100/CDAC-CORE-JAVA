package day4;

public class AvgFees extends CourseDataCalculator {
	public float doCalculation(Course[] fees) {
		float avgFees = 0;
		for(Course c : fees) {
			avgFees += c.getFees();
		}
		return avgFees / 5;
	}
}
