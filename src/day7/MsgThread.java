package day7;

public class MsgThread extends Thread{
	private String message;
	private int delayTime;
	public MsgThread(String message, int delayTime) {
		this.message = message;
		this.delayTime = delayTime;
	}
	@Override
	public void run(){
		for(int a=1; a<=10; a++) {
			System.out.println(message);
			try {
				Thread.sleep(delayTime);
			}
			catch (InterruptedException e ){
				e.printStackTrace();
			}
		}
	}
}
