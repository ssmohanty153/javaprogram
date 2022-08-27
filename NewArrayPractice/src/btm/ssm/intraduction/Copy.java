package btm.ssm.intraduction;

public class Copy 
{
public static void main(String[] args) 
{
	int arr[]={1,2,3};
	int copy[]=arr.clone();
	System.out.println(arr==copy);
	
	for (int i = 0; i < copy.length; i++) 
	{
		System.out.println(copy[i]);
	}
}
}
