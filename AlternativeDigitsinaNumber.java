package basicPrograms1;

public class AlternativeDigitsinaNumber {
public static void main(String[] args) {
	int i=0,r,n=1234565,sum=0;
	while(n>0)
	{
		if(i%2==0)
		{
			r=n%10;
			sum=sum+r;
			System.out.println(r);
		}
		n=n/10;
		i++;
	}
//	String s=String.valueOf(n);
//	for(int i=0;i<s.length();i++)
//	{
//		if(i%2==0)
//		{
//			sum=sum+Integer.parseInt(String.valueOf(s.charAt(i)));
//		}
//	}
   System.out.println("Sum of Alternative numbers is: "+sum);
}
}
