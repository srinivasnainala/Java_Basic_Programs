package basicPrograms1;

public class Constructors {
	int i=10;
//	String s;
//	Constructors()
//	{
//	}
	Constructors(int a)
	{
		this.i=a;
//		System.out.println(a);
	}
public static void main(String[] args) {
	Constructors c=new Constructors(12546);
	System.out.println(c.i);
	Constructors c1=new Constructors(121);
	System.out.println(c1.i);
//	Constructors c1=new Constructors();
//	System.out.println(c1.i);
}
}
