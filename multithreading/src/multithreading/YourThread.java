package multithreading;

public class YourThread extends Thread
{
	public void run()
	{
		for (char i = 'a'; i <='z'; i++)
		{
		System.out.println(i);	
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		 
		 
		}
	}
}
