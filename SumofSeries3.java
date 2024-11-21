package basicPrograms1;

public class SumofSeries3 {
public static void main(String[] args) {
	double sum=0;
	for(int i=0;i<=4;i++)
	{
		sum=sum+1/Math.pow(2, i);
	}
	System.out.println("Sum of Series 1/2^0 + 1/2^1 + 1/2^3 + 1/2^4 is..."+sum);
}
}
