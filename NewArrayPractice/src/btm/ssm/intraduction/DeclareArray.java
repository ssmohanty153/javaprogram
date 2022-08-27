package btm.ssm.intraduction;

public class DeclareArray 
{
public static void main(String[] args) 
{
	int arr[];
	arr=new int[6];
	arr[0]=34;
	arr[1]=14;
	arr[2]=54;
	arr[3]=64;
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.println(i+1+":"+arr[i]);
	}
	
	
	
}
}
