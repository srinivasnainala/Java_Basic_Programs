package basicPrograms1;

import java.util.Scanner;

public class PositiveorNot {
public static void main(String[] args) {
	int n;
	System.out.println("Enter n value:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if(n>0)
	{
		System.out.println("Given number is Positive number");
	}
	else
	{
		System.out.println("Given number is negative");
	}
}
}
