
public class Example {
  int b;
	Example()
	{
		this(6);
		System.out.println("hello");
	}
	Example(int a)
	{
		this.b=a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		 Example e = new Example();
		 System.out.println(e.b);
	}

}
