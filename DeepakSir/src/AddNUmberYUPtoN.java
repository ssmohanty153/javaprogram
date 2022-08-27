import java.util.Scanner;

public class AddNUmberYUPtoN 
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int sum=sumOf(n);
	System.out.println(sum);
	sc.close();
	
}

 static int sumOf(int n) 
 {
	 int sum=0;
	 while(n>0)
	 {
		 sum=sum+n;
		 n--;
	 }
	 
	 
	return sum;
}
}
