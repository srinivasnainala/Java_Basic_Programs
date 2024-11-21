package basicPrograms1;

public class Armstrong {
public static void main(String[] args) {
	int temp=0,count=0,sum=0,n=153;
	int arm=0;
	temp=n;
	while(n!=0)
	{
		int r=n%10;
		count++;
		n=n/10;
		int digit=count;
        sum=sum+(int)Math.pow(r, digit);
        
	}
//	System.out.println(count);
	if(sum==temp)
	{
		System.out.println("Given number is ArmStrong");
	}
	else
	{
		System.out.println("Given number is not Armstrong");
	}
}
}
