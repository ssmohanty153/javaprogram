package org.ssm.InterFace2;

public class FanImpl implements IRegulater
{

	@Override
	public void increaseSpeed()
	{
		System.out.println("Fan speed is inreased");
	}

	@Override
	public void reduceSpeed() 
	{
		System.out.println("Fan speed reduced");
	}

}
