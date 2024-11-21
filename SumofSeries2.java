package basicPrograms1;

public class SumofSeries2 {
public static void main(String[] args) {
	double sum=0;
	for(int i=1;i<=5;i++)
	{
		sum=sum+1/(Math.pow(i,i-1));
	}
	System.out.println("Sum of Series 1/1^0 + 1/2^1 + 1/3^2 +1/4^3 + 1/5^4..is "+sum);
}
}
