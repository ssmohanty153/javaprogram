package org.ssm.Override3;

public class Chef 
{
public void perticate()
{
	Spin s=new Spin();
	Eatable e=s.spinThespin();
	
	if(e!=null)
	{
	e.prepare();	
	}
}
public static void main(String[] args) 
{
	Chef c= new Chef();
	c.perticate();
}
}
