package org.ssm.InterFace;

public class CpuImpl implements IMouse
{

	@Override
	public void click() 
	{
		System.out.println("Resource get neglacted");
	}

	@Override
	public void doubleClick() 
	{
		System.out.println("resource open");
	}

	@Override
	public void rightClick() 
	{
	System.out.println("display option");	
	}

}
