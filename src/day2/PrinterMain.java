package day2;

public class PrinterMain {

	public static void main(String[] args) {
		Printer p = new Printer();
		System.out.println(p.getCon());
		Printer p2 = new Printer("aniket");
		System.out.println(p2.getCon());
	}

}
