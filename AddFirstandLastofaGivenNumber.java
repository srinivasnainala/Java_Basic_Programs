package basicPrograms1;

public class AddFirstandLastofaGivenNumber {
public static void main(String[] args) {
	int a= 6454549;
	int sum=0;
	int first=a;
	int last=a%10;
	while(a!=0)
	{
		first=a;
//		first=first/10;
	    sum=first+last;
	    a=a/10;
	}
    System.out.println("Sum of " +first+" and " +last+ " digit of a given number is "+sum);
}
}
