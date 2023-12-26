package day5;

public class AvgFees implements CourseInfoProcessor{
	public int processCourseInfo(Course [ ]c, CourseInfo c2) {
		 int avgfees = 0;
		 int count = 0;
		 for(Course i : c) {
			 if(i.getDuration() == c2.getDuration() && i.getProvider() == c2.getProvider()) {
				 avgfees += i.getFees();
				 count++;
			 }
			 
		 }
		 avgfees = avgfees / count;
		 return avgfees;
	}
}
