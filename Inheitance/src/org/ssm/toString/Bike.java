package org.ssm.toString;
public class Bike extends Vehicle
{
	public int seatHeight;
	public Bike(int gear, int speed,int startHight)
	{
		super(gear, speed);
		seatHeight=startHight;
	}
	 public void setHeight(int newValue) 
	    { 
	        seatHeight = newValue; 
	    } 
	@Override
	public String toString() 
	{
		return(super.toString()+ "\nseatHeight is= "+seatHeight);
	}

}
