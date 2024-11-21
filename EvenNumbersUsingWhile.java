package basicPrograms1;

import java.util.Scanner;

public class EvenNumbersUsingWhile {
public static void main(String[] args) {
	int n,i=2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value:");
	n=sc.nextInt();
	System.out.println("Printing even numbers :");
	while(i<=n)
	{
		if(i%2==0)
		{
			System.out.println(+i+"  is a Even number");
		}
		i++;
	}
}
}
