package basicPrograms1;

public class SumofNaturalNumbers {
public static void main(String[] args) {
	int sum=0;
	System.out.println("Printing n natural numbers upto 100:");
	for(int i=1;i<=100;i++)
	{
		sum=sum+i;
		System.out.println(i);
	}
	System.out.println("Sum of natural numbers is :" +sum);
}
}
