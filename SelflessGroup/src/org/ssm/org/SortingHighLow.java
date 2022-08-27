package org.ssm.org;

import java.util.Arrays;

public class SortingHighLow 
{
	public static void main(String[] args) 
	{
		int []arr= {23,45,1,90,56,583};
		
		Arrays.sort(arr);
		System.out.println(arr[0]+" is lowest number");
		System.out.println(arr[arr.length-1]+" is Highest number");
		
	}

}
