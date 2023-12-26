package day1;

public class MovieMain {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.setTitle("speed");
		m1.setYear(1998);
		m1.setGenre("action");
		
		System.out.println("title is : " + m1.getTitle());
		String movieGenre = m1.getGenre();
		System.out.println("Genre : " + movieGenre);
		System.out.println("year is : " + m1.getYear());
	}

}
