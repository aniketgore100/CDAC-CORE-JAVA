package day5;

public class InfoCount implements CourseInfoProcessor {
	
	int count = 0;
	
	public int processCourseInfo(Course [ ]c, CourseInfo c2 ) {
		for(Course i : c) {
			if(i.getDuration() == c2.getDuration()) {
				count++;
			}
		}
		return count;
	}
}
