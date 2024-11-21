package basicPrograms1;

public class PrimeNumbersMtoN {
public static void main(String[] args) {
	System.out.println("Printing primeNumbers m to n");
	int m=20;
	for(int n=m;n<=100;n++)
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
