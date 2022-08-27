package org.ssm.CunstructerChaining2;

public class Mobile extends EletricProduct
{
	public Mobile()
	{
		this("iphone");
		System.out.println("mobile_0_paranthisish con");
	}

	public Mobile(String string)
	{
		System.out.println("model");
	}
	public static void main(String[] args) 
	{
		System.out.println("app start");
		new Mobile();
		System.out.println("app end");
	}

}
