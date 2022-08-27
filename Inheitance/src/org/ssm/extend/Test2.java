package org.ssm.extend;

public class Test2 
{
public static void main(String[] args) 
{
	Car c=new Car();
	c.run();
	c.start();
	Vehicle v=new Vehicle();
	
	v .start();
	System.out.println(c.model);
	System.out.println(c.brand);
}
}
