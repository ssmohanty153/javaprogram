package multithreading;

public class Main4 {
	public static void main(String[] args)
	{
		Thread t1=new Thread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		t1.setName("raghu");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
	}

}
