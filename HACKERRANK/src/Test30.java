
public class Test30 
{
	public static void main(String[] args)
	{
		A.a1.A(12,35);
		
	}
	

}
class A
{
	static A a1=new A();
	void A(int i,int j)
	{
		System.out.println(i+j);
		
	}
}
