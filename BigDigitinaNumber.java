package basicPrograms1;

public class BigDigitinaNumber {
public static void main(String[] args) {
	int n=123147523;
	int big=n%10;
	while(n>0)
	{
		int r=n%10;
		if(r>big)
		{
			big=r;
		}
		n=n/10;
	}
	System.out.println("Big digit in a given number is :"+big);
}
}
