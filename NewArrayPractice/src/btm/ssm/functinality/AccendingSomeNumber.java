package btm.ssm.functinality;

public class AccendingSomeNumber 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7};
		reverseArr(arr,2);
		printNewArray(arr);
	}

	public  static void printNewArray(int[] arr)
	
	{
		for (int i = 0; i < arr.length; i++)
		{
			
			System.out.print(arr[i]);
			if(i<arr.length-1)
			{
				System.out.print(",");
			}
			
		}
	}

	public static void reverseArr(int[] arr, int d)
	{
		int n=arr.length;
		
		reverseAndSwwip(arr,0,d-1);
		reverseAndSwwip(arr,d,n-1);
		reverseAndSwwip(arr,0,n-1);
		
	}

	private static void reverseAndSwwip(int[] arr, int start, int end)
	{
		int swip;
		while(start<end)
		{
			swip=arr[start];
			arr[start]=arr[end];
			arr[end]=swip;
			start++;
			end--;
		}
	}
		
} 
	


