package basicPrograms1;

public class CallingDifferentTypesOfvaribles {
    static int a=20;
    int b=21;
	public static void main(String[] args) {
	int n=10;
	CallingDifferentTypesOfvaribles c=new CallingDifferentTypesOfvaribles();
	System.out.println("Local Variable "+n);
	System.out.println("Static variable " +a);
	System.out.println("Instance Variable " +c.b);
}
}
