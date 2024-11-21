package basicPrograms1;

public class SumofSeries {
public static void main(String[] args) {
	double sum=0;
	for(int i=1;i<=5;i++)
	{
		sum=sum+1.0/i;
	}
	System.out.println("Sum of the Series 1/1 + 1/2 + 1/3 + 1/4... is "+sum);
}
}
