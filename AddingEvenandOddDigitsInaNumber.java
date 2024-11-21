package basicPrograms1;

public class AddingEvenandOddDigitsInaNumber {
public static void main(String[] args) {
	int n=22234,sum=0;
	while(n!=0)
	{
		int r=n%10;
		n=n/10;
		if(r%2==0)
		{
			System.out.println("Even digits are: "+r);
			sum=sum+r;
		}
		else
		{
			System.out.println("Odd digits are: "+r);
			sum=sum+r;
		}
		
	}
//	sum=sum+sum1;
	System.out.println("Sum of Even and odd  Digits in a given number is :" +sum);
	
}
}
