import java.util.Scanner;
public class IsPErfect 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no for check the perfect");
	int n=sc.nextInt();
	boolean a=isPerfect(n);
	if(a)
	{
		System.out.println(n+" Is  perfect");
	}
	else
		System.out.println(n+" Is Not perfect");
	
	
}
static boolean isPerfect(int n)
{
	
	int sum=0,i=1;
	while(i<=n/2)
	{
		if(n%i==0)
		sum=sum+i;
		i++;
		
		
	}
	return n==sum;
}
}
