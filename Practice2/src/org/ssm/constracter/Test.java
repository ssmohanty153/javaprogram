package org.ssm.constracter;

public class Test 
{
	public static void main(String[] args) 
	{
		Box b1= new  Box(10,20,30);
		Box b2=new  Box();
		Box b3=new  Box(7);
		double vol;
		vol=b1.volume();
		System.out.println(vol);
		vol=b2.volume();
		System.out.println(vol);
		vol=b3.volume();
		System.out.println(vol);
		
	}

}
