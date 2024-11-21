package basicPrograms1;

import java.util.Scanner;

public class SumofFirst50PrimeNumbers {
public static void main(String[] args) {
	int sum=0;
	int k=0;
	for(int n=0;n<=200;n++)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if((count==2))
		{
			k++;
//			sum=sum+n;
			System.out.println("Printing first prime numbers is: "+n);
		}
		if((k<=20)&&(count==2))
		{
			sum=sum+n;
		}
	}
	
	System.out.println("Sum of first fifty prime numbers : "+sum);
}
}
