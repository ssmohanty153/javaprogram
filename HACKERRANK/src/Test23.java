
public class Test23 
{
	public static void main(String[] args) 
	{
		B a1=new B();
		
	}

}
class B

{
	int x=99;
	static int y=88;
	static B a1=new B();
	
	static{
		System.out.println("s1");
	}
		{
			System.out.println("i1");
		}
		int i=77;
		static int j=66;
		
		
		static{
			System.out.println("s2");
		}
			{
				System.out.println("i2");
			}
		
	
}
