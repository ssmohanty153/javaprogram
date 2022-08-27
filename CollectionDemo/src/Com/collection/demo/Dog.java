package Com.collection.demo;

import javax.swing.Spring;

public class Dog {
public String clr;
public String breed;
public Dog(String clr,String breed)
{
	super();
	this.clr=clr;
	this.breed=breed;
}
@Override
public String toString()
{
return this.breed+" "+this.clr;	
}
public static void main(String[] args) {
	Dog d=new Dog("white","labrador");
			System.out.println(d);
}
}
