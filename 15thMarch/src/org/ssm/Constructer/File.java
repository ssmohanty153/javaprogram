package org.ssm.Constructer;

public class File 
{
	int x;
	/*double size;
	String name;
	{
		size=0.0;
		name="new Document";
		
	}*/
	public File()
	{
		//this.x=10;
		
	}
	public File(int x)
	{
		this.x=x;
		
	}
	public void display()
	{
		System.out.println("value of "+x);
	}
	public static void main(String[] args) 
	{
	File f1= new File();
	File f2= new File(100);
	f1.display();
	f2.display();
	
	
	//System.out.println(f.name+""+f.size);
	}

}
