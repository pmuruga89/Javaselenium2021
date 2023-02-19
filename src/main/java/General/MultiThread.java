package General;

public class MultiThread implements Runnable{

	public void run() {
		System.out.println("This is run thread");
	}
	
	public static void main(String[] args) throws InterruptedException {

		MultiThread m = new MultiThread();
		
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		t1.run();
		
		
		t2.sleep(1000);
		t2.run();
		
	}

}
