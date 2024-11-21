package basicPrograms1;

public class PerfectorNot {
public static void main(String[] args) {
	int n=6,sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==n)
	{
		System.out.println(n+ " is Perfect number");
	}
	else
	{
		System.out.println(n+ "  is not perfect number ");
	}
}
}
