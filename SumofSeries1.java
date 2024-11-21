package basicPrograms1;

public class SumofSeries1 {
public static void main(String[] args) {
	double sum=0;
	int count=0;
	for( int i=1;i<=5;i++)
	{
		sum=sum+1/i;
		count++;
		if(count>1)
		{
			sum=sum+1/Math.pow(i,2);
		}	
	}
	System.out.println("Sum of the Series 1/1 + 1/2^2 + 1/3^2 + 1/4^2 is...."+sum);
}
}
