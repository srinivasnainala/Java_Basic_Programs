package basicPrograms1;

import java.util.Scanner;

public class Armstrong1 {
public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.print("Enter a number: ");
//	        int number = scanner.nextInt();
//	        boolean isArmstrong = isArmstrongNumber(number);
//	        if (isArmstrong)
//	        {
//	            System.out.println(number + " is an Armstrong number.");
//	        } 
//	        else
//	        {
//	            System.out.println(number + " is not an Armstrong number.");
//	        }
//	    }
//	    public static boolean isArmstrongNumber(int number) {
//	        int originalNumber = number;
//	        int sum = 0;
//	        int numberOfDigits = String.valueOf(number).length();
//	        while (number != 0) {
//	            int digit = number % 10;
//	            sum += Math.pow(digit, numberOfDigits);
//	            number /= 10;
//	        }
//	        return sum == originalNumber;
//	    }
//	}

	int n=1212;
	System.out.println("Checking "+n+ " is armstrong or not");
	boolean armstrong=armstrong(n);
	if(armstrong(n))
	{
		System.out.println("Given number is Armstrong");
	}
	else
	{
		System.out.println("Given number is not armstrong");
	}}
	static boolean armstrong(int n)
	{
		int temp,r=0,count=0,sum=0;
		temp=n;
		while(temp>0)
		{
			temp=n%10;
			count++;
		}
		temp=n;
		while(temp>0)
		{
			r=temp%10;
			sum+=Math.pow(count,r);
			temp=temp/10;
		}
	return sum==temp;
	}
}

