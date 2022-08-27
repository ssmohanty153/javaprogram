package btm.ssm.intraduction;

public class Text 
{
public static void main(String[] args)
{
	Student arr[];
	arr=new Student[5];
	arr[0]=new Student(1,"raja");
	arr[1]=new Student(2,"aja");
	arr[2]=new Student(3,"raa");
	arr[4]=new Student(5,"raj");
	arr[3]=new Student(6,"ja");
	System.out.println("roolno"+"  name");
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.println(arr[i].roolNo+":-      "+arr[i].name);
	}
}
}
