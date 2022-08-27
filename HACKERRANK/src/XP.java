
public class XP
{
	void method(int i) 
	{
		System.out.println("1");
		
	}
	void method(double d) 
	{
		System.out.println("2");
		
	}

}

class YP extends XP
{
	void method(double  d) 
	{
		System.out.println("3");
		
	}
}
