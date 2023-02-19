package General;

public class Multithread2 implements Runnable{

	public void run()
	{
		for(int i=1;i<=101;i++)
		{
			System.out.println(i);

		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		Multithread2 d3=new Multithread2();
		Thread t1=new Thread(d3);
		Thread t2=new Thread(d3);
		t1.start();
		Thread.sleep(1000);
		t2.start();
		
	}

}
