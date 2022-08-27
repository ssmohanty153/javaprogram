import java.util.Scanner;

public class EvenOrOdd 
{
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);

		System.out.println("Enetr the number");
		
		
		int n=sc.nextInt();
		boolean a=evenNo(n);
		if(a==true)
		{
			System.out.println("even");
		}
		else
			System.out.println("not even");
	}

	static boolean evenNo(int n) 
	{
		
		if(n%2==0)
			return true;
		else
		return false;
	}

}