package org.ssm.Variable3;

public class Hotel 
{
	void service(Money m,Token t)
	{
		System.out.println(" Meals is ready");
	}
	public static void main(String[] args) 
	{
	Hotel h= new Hotel();
	Money m=new Money();
	Token t= new Token();
	h.service(m, t);
	}

}
