package basicPrograms1;

public class PrimeNumbersupto10 {
public static void main(String[] args) {
	System.out.println("Printing prime numbers upto 10:");
	for(int n=2;n<=10;n++)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+" is a prime number");
		}
	}
}
}
