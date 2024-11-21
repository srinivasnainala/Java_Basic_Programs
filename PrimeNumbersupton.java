package basicPrograms1;

import java.util.Scanner;

public class PrimeNumbersupton {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value: ");
    int n=sc.nextInt();
	System.out.println("Printing prime numbers upto n");
	for(int m=1;m<=n;m++)
	{
		int count1=0,count=0;
		for(int i=1;i<=m;i++)
		{
			if(m%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			count1++;
			System.out.println(m+" is a prime number");
		}
		
	}
}
}
