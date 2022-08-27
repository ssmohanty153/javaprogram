package org.ssm.Override3;

import java.util.Random;

public class Spin 
{
	public Eatable spinThespin()
	{
		Random r= new Random();
		int num=r.nextInt(5);
		if(num==0)
		{
			return new Paneer();
		}
		if(num==1)
		{
			return new Cone();
		}
		if(num==2)
		{
			return null;
		}
		if(num==3)
		{
			return new Chicken();
		}
		if(num==4)
		{
			return new Rice();
		}
		else
		{
			return null;
		}

	}

}
