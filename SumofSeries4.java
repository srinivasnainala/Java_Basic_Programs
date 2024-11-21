package basicPrograms1;

public class SumofSeries4 {
public static void main(String[] args) {
	double sum=0;
	int n=5;
	for(int i=1;i<=n;i++)
	{
		sum=sum+1/Math.pow(i,2);
	}
	System.out.println("Sum of Series 1/1 + 1/4 + 1/9 + 1/16 + 1/25  is..."+sum);
}
}
