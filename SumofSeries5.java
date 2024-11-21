package basicPrograms1;

public class SumofSeries5 {
public static void main(String[] args) {
	int n=5;
	double sum=0;
	for(int i=1;i<=n;i++)
	{
		int fact=1;
		for(int j=1;j<=i;j++)
		{
		fact=fact*j;
		sum=sum+1.0/fact;
		}
	}
	System.out.println("Sum of Serie	is 1/1! + 1/2! + 1/3! + 1/4 + 1/5! is..."+sum);
}
}
