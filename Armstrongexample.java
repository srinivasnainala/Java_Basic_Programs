package basicPrograms1;

import java.util.Scanner;

public class Armstrongexample {
public static void main(String[] args) {
	int n,r,sum=0,temp;
	System.out.println("Checking given number is armstrong or not");
	System.out.println("Enter  a number : ");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	temp=n;
	while(n>0)
	{
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println("Given number is Armstrong");
	}
	else
	{
		System.out.println("Given number is not armstrong");
	}
}
}
