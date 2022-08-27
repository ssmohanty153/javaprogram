package org.ssm.Inheritance;

public class TextVehicle 
{
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.color="blue";
		c.price=850000;
		c.acTemp=22.5;
		c.brand="bmw";
		c.start();
		c.crizeControl();
		c.stop();
		System.out.println(c.color+" "+c.acTemp+" "+c.brand+"  "+c.price);
		
		Tracter t=new Tracter();
		t.color="blue";
		t.price=8500000;
		t.loadCapacity=22.5;
		t.brand="Mahindra";
		t.start();
		t.dumpLoad();
		t.stop();
		System.out.println(t.color+" "+t.loadCapacity+" "+t.brand+"  "+t.price);
	}
}
