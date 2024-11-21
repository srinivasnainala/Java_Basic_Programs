package basicPrograms1;

import java.util.Scanner;

public class PerfectNumbersuptoMtoN {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter m value :");
	int m=sc.nextInt();
	System.out.println("Enter n value:");
	int n=sc.nextInt();
	System.out.println("Printing perfect numbers:");
	for(int i=m;i<=n;i++)
	{
		int sum=0;
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
			{
				sum=sum+j;
			}
		}
		if(sum==i)
		{
			System.out.println(i+" is a perfect Number");
		}
	}
//	System.out.println("Printing perfect numbers :");
//	for(int i=1;i<=100;i++)
//	{
//		if(isPerfect(i))
//		{
//			System.out.println(i);
//		}
//	}
//	}
//	public static boolean isPerfect(int n)
//	{
//		int sum=0;
//		for(int i=1;i<=n/2;i++)
//		{
//			if(n%i==0)
//			{
//				sum=sum+i;
//			}
//		}
//		return sum==n;
}
}
