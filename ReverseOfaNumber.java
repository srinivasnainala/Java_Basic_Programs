package basicPrograms1;

public class ReverseOfaNumber {
public static void main(String[] args) {
	int r,rev=0,n=16523;
	System.out.println("Reverse of "+n+ " is:");
	while(n!=0)
	{
		r=n%10;
		rev=r+rev*10;
		n=n/10;
	}
	System.out.println(+rev);
}
}
