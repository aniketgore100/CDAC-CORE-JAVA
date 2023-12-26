package day4;

public class CourseMain {

	public static void main(String[] args) {
		
		Course a[] = new Course[5];
		a[0] = new Course(3, 5000, 1, "udemy", "c++");
		a[1] = new Course(4, 4000, 2, "gfg", "java");
		a[2] = new Course(5, 3000, 3, "coding ninjas ", "html");
		a[3] = new Course(6, 2000, 4, "codefod", "css");
		a[4] = new Course(7, 1000, 5, "codehub", "c");
		
		AvgDur obj = new AvgDur();
		AvgFees fees = new AvgFees();
		System.out.println(obj.doCalculation(a));
		System.out.println(fees.doCalculation(a));
		
	}

}
