package multithreading;

public class Simple {
void display()
		{
		for (int i = 0; i <10; i++)
		{
			System.out.println(10*i);
		if(i==5)
				
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {
			System.out.println(e);
				
			}
		
		}
	}
	
void print()
{
	for (int i= 1;i<10;i++)
	{
		System.out.println(100*i);
	}
}
}