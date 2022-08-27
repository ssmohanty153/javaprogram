
public class MiddleMubmer 
{
public static void main(String[] args)
{
	int a=10,b=20,c=30;
	if((a>b&&a<c)||(a<b&&a>c))
	{
		System.out.println(a+ " is the middle number");
	}
	if((b>c&&b<a)||(b<c&&b>a))
	{
		System.out.println(b+ " is the middle number");
	}
	else
		System.out.println(c+ " is the middle number");
	
}
}
