package org.ssm.SuperParanthasis;
public class Product 
{
	int price;
	String type;
	public Product(int price)
	{
		this();
		System.out.println("a");
	}
	public Product(String type) 
	{
		super();
		System.out.println("b");
	}
	public Product()
	{
		this("Mobile");
		System.out.println("c");
	}
}
