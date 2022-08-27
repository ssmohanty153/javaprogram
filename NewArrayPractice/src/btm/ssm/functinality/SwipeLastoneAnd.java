package btm.ssm.functinality;

import java.util.Arrays;

public class SwipeLastoneAnd
{
public static void main(String[] args) 
{
	 int arr[]=new int[]{1,2,3,4,5};
	swip(arr);
	System.out.println(Arrays.toString(arr));
}

public static int[] swip(int[] arr1) 
{
	int x=arr1[arr1.length-1];
	for (int i = arr1.length-1; i >0; i--) 
	arr1[i]=arr1[i-1];
	
	
	arr1[0]=x;
	return arr1;
}
}
