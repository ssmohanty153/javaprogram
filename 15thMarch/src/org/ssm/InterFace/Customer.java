package org.ssm.InterFace;

import org.ssm.Abstract.Cpu;
import org.ssm.InterFace2.FanImpl;
import org.ssm.InterFace2.IRegulater;

public class Customer 
{
void use()
{
	IMouse m= new CpuImpl();//upcasting
	m.click();
	m.doubleClick();
	m.rightClick();
	IRegulater r=new FanImpl();//upcasting
	r.increaseSpeed();
	r.reduceSpeed();
}
public static void main(String[] args) 
{
	Customer c=new Customer();
	c.use();
}
}
