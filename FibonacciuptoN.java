package basicPrograms1;

import java.util.Scanner;

public class FibonacciuptoN {
public static void main(String[] args) {
	int a=10,b=20;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	System.out.println("Fibonacci series upto "+n+ "is :");
	System.out.print(a +" " );
	System.out.print(b +" ");
	for(int i=1;i<=n;i++)
	{
		int c=a+b;
		System.out.print(  c+ " ");
		a=b;
		b=c;
	}
}
}
