package basicPrograms1;

import java.util.Scanner;

public class DivisiblebyBoth3and5 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	n=sc.nextInt();
	if((n%3==0)&&(n%5==0))
	{
		System.out.println("Given number is divisible by both 3 and 5");
	}
	else
	{
		System.out.println("Given number is not divisible by 3 and 5");
	}
}
}
