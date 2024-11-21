package basicPrograms1;

public class SumofEvenNumbers {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=100;i++)
	{
		if(i%2==0)
		{
			sum=sum+i;
			System.out.println(i+" is a even number");
		}
	}
	System.out.println("Sum of even numbers is " +sum);
}
}
