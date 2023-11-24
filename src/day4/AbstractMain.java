package day4;

public class AbstractMain {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.dis();   // method in shape called 
		s.draw(); //  method in circle called 
		
		Rectangle r = new Rectangle();
		r.draw(); //  method in rectangle called
	}

}
