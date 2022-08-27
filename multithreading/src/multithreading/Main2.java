package multithreading;

public class Main2 {
	public static void main(String[] args) {
		Mythread m=new Mythread();
		YourThread y=new YourThread();
		m.start();
		y.start();
	}

}
