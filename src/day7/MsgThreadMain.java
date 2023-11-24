package day7;

public class MsgThreadMain {
	public static void main(String[]args) {
		Thread t1 = new MsgThread("Hi", 1000);
		Thread t2 = new MsgThread("Hello", 500);
		t1.start();
		t2.start();
	}
}
