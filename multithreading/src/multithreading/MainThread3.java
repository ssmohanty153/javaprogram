package multithreading;

public class MainThread3 {
	

public static void main(String[] args)
{
	Thread t1=new Thread()
	{
		public void run()
		{	
			for (int i = 0; i <=10; i++) 
			{
				System.out.println("2*"+i+"="+2*i);
				try {
					Thread.sleep(100);
					
				} catch (InterruptedException e) {
					
				}
					
			}
			
	}
	};

	Thread t2=new Thread (){
					public void run()
			{	
				for (int i = 0; i <=10; i++) 
				{
					System.out.println("5*"+i+"="+5*i);
					try {
						Thread.sleep(100);
						
						
					} catch (InterruptedException e) {
						
					}
						
				}
			}
			
	};
	t1.start();
	t2.start();
}
}

	

	


	
			
		
		
	


