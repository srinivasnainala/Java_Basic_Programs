package basicPrograms1;

public class Palindromeornot {
public static void main(String[] args) {
	int n=123921,sum=0,temp,r;
    System.out.println("checking the number is pallindrome or not :");
    temp=n;
    while(n!=0)
    {
    	r=n%10;
    	sum=sum*10+r;
    	n=n/10;
    }
    if(temp==sum)
    {
    	System.out.println("Given number is pallindrome");
    }
    else
    {
    	System.out.println("Given number is not pallindrome");
    }
}
}
