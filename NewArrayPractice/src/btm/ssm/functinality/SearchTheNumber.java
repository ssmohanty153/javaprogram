package btm.ssm.functinality;

public class SearchTheNumber 
{
public static void main(String[] args) 
{
	int arr[]=new int[]{1,2,3,4,5};
	search(arr,102);
}

private static void search(int[] arr, int i) 
{
	for (int j = 0; j < arr.length; j++)
	
		if(arr[j]==i)
		{
			System.out.println("in array " +i +"number present in index "+j);
		}
	
		else
		{
			System.out.println("in array " +i +"number not present "+j);
		
		}
			
	}



}
