package willitwork;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger l = new Logger(0);
		int LogLevel = 1;
		int testnumber = 3;
		l.Log(" " + testnumber, 1);
		l.Log("test error", 3);
		System.out.println("Hello World");
	}
}
