package org.ssm.Inheritance2;

public class TextAnimal
{
public static void main(String[] args) 
{
	Cat c= new Cat();
	c.color="white";
	c.type="domestic";
	c.height=1.3;
	c.eat();
	System.out.println(c.color+" "+c.height+" "+ c.type+" ");
}
}
