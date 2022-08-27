package org.ssm.toString;

public class Vehicle 
{
public int gear;
public int speed;

public Vehicle(int gear, int speed) 
{
	this.gear = gear;
	this.speed = speed;
}

public void applyBreak(int decreased)
{
	speed=decreased;
}
@Override
public String toString()
{
	return "number of gear are =" + gear + "\nand speed of vehicle is= " + speed;
}

}
