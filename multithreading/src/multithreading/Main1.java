package multithreading;

public class Main1 {
	public static void main(String[] args) 
	{
	Simple si=new Simple();
	class Thread1 extends Thread
	                                    {
                                     	public void run()
                                      	{
	                                  	si.display();
		
	                                    }
	}
	class Thread2 extends Thread
	                                            {
		                                         public void run()
		                                        {
		                                       	si.print();
		                                         }
	}
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	t1.start();
	t2.start();
	
	}

}




