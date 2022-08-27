package org.ssm.constracterThis;
public class Box 
{
	double width,height,depth;
	int boxNo;
	public Box(double width,double height,double depth,int num) 
	{
		width=width;
		height=height;
		depth=depth;
		num=num;
	}
	public Box()
	{
		width=height=depth=0;
	}
	Box(int num)
	{
		this();
		boxNo=num;
	}
	public static void main(String[] args) 
	{
		Box box=new Box(10);
		System.out.println(box.boxNo);

	}

}
