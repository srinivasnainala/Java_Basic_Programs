package basicPrograms1;

public class CallingMultipleConstructors {
	int a;
	CallingMultipleConstructors(){
		this.a=23;
	System.out.println(a);
	}
//	CallingMultipleConstructors(int a)
//	{
//		System.out.println("One Parameterized constructor");
//	}
	CallingMultipleConstructors(int a,int b)
	{
	
		System.out.println("Two parameterized Constructor");
	}
public static void main(String[] args) {
//	CallingMultipleConstructors c1=new CallingMultipleConstructors(2);
	CallingMultipleConstructors c2=new CallingMultipleConstructors(1,2);
	CallingMultipleConstructors c=new CallingMultipleConstructors();
}
}
