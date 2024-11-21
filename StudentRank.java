package basicPrograms1;

import java.util.Scanner;

public class StudentRank {
public static void main(String[] args) {
	int marks;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Marks: ");
	marks=sc.nextInt();
	if(marks>=35)
	{
		System.out.println("pass");
		if(marks>=90&&marks<=100)
		{
			System.out.println("A grade");
		}
		else if(marks<=89&&marks>=75)
		{
			System.out.println("B grade");
		}
		else if(marks<=74&&marks>=60)
		{
			System.out.println("C Grade");
		}
		else if(marks<=59&&marks>=35)
		{
			System.out.println("D Grade");
		}
	}
	else 
	{
		System.out.println("Fail");
	}
}
}
