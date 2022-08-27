package org.ssm.constracter;

public class Box 
{
	double width,height,depth;
	public Box( double w,double h,double d) 
	{
		this.width=w;
		this.height=h;
		this.depth=d;
		
	}
	public Box() 
	{
		width=height=depth=0;
		
	}
	Box( double len)
	{
		width=height=depth=len;
	}
	double volume()
	{
		return width*height*depth;
	}

}
