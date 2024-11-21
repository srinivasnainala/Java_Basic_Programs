package basicPrograms1;

public class NumberisEqualorNot {
	static String equalornot(int n)
	{
		int digit=n%10;
		while(n!=0)
		{
			int r=n%10;
			n=n/10;
			if(r!=digit)
			{
				return "It is not equal";
			}
		}
		return "It is equal";
		
	}
public static void main(String[] args) {
	int N=3333;
	System.out.println(NumberisEqualorNot.equalornot(N));
}
}
