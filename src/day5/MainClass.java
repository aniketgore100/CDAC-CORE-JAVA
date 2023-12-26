package day5;

public class MainClass {

	public static void main(String[] args) {

		 Course[] courses = {
				  new Course(100, 5500, 101, "Udemy", "Core Java"),
		            new Course(100, 8500, 102, "Udemy", "Adv Java"),
		            new Course(60, 7500, 103, "Edureka", "Angular"),
		            new Course(75, 8000, 104, "Coursera", "Angular"),
		            new Course(40, 10500, 105, "Udemy", "Spring")
		        };
		 
		 
		 
		 CourseInfo ci = new CourseInfo("Udemy", 100);
		 CourseInfoProcessor cinfo = new InfoCount();
		System.out.println(cinfo.processCourseInfo(courses, ci));
		CourseInfoProcessor avginfo = new AvgFees();
		System.out.println(avginfo.processCourseInfo(courses, ci));
		 
	}

}
