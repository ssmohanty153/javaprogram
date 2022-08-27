package multithreading;

public class Mythread extends Thread
{
public void run ()
{
	for (char i = 'A'; i <= 'Z'; i++)
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
