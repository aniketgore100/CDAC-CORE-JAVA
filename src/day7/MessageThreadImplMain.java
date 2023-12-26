package day7;

public class MessageThreadImplMain {

	public static void main(String[] args) {
		Thread t1 = new MessageThreadImpl("aniket", 3000);
		t1.start();
		
		Thread t2 = new MessageThreadImpl("gore", 1000);
		t2.start();
	}

}
