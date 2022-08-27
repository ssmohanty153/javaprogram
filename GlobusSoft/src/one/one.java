package one;

public class one 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4};
		 System.out.println(arr.length);
		//int arr2[]=new int[arr.length-1];
		//System.out.println(arr2.length);
		while(arr.length>1)
		{
			int arr2[]=new int[arr.length-1];
			for (int i = 0; i <arr.length-1; i++) 
			{
				arr2[i]=(arr[i]+arr[i+1]);
				System.out.print(arr2[i]);
		
				
				
			}
			/*for (int i = 0; i <arr2.length; i++) 
			{
				System.out.print(arr2[i]);
				
		
				
				
			}*/
			arr=arr2;
			
			
			System.out.println();
		}
		


		}
	}


