package General;

class ATask implements Runnable{
	
	public void run() {
		
		long start = System.nanoTime();
		
		for(int i=0;i<=50;i++) {
			System.out.println("Task 1 is running");
		}
		System.out.println("Task 1 is completed");
		
		long end = System.nanoTime();
	    long execution = (end - start);
	    System.out.println("Task 1: "+execution + " nanoseconds");
		//System.out.println(System.currentTimeMillis());
	}
}

class BTask implements Runnable{
	
	public void run() {
		
		long start = System.nanoTime();
		
		for(int i=0;i<=50;i++) {
			System.out.println("Task 2 is running");
		}
		System.out.println("Task 2 is completed");
		//System.out.println(System.currentTimeMillis());
		
		
		long end = System.nanoTime();
	    long execution = (end - start);
	    System.out.println("Task 2: "+execution + " nanoseconds");

	}
}

public class MultiThreadParallelExecution {

	public static void main(String[] args) {

		ATask a1 = new ATask();
		BTask b1 = new BTask();
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(b1);
		
		t1.start();
		
		t2.start();
	}

}
