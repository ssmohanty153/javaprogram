
public class MainThread {
public static void main(String[] args) 
{
	Thread t1=new Thread();
	System.out.println(t1.getId());
	System.out.println(t1.getPriority());
	System.out.println(t1.getName());
	Thread t2=new Thread();
	System.out.println(t2.getId());
	System.out.println(t2.getPriority());
	System.out.println(t2.getName());
	Thread t3=new Thread(new MyRunnable());
	System.out.println(t3.getId());
	System.out.println(t3.getPriority());
	System.out.println(t3.getName());
	Thread t4=new Thread(new MyRunnable(),"qspider");
	System.out.println(t4.getId());
	System.out.println(t4.getPriority());
	System.out.println(t4.getName());
	
}

}
