package basicPrograms1;

import java.util.Scanner;

public class SumofDigitsofNumberusingRecursive {
	
  public static void main(String[] args) {
	System.out.println("Enter n value:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=add(num);
	System.out.println(sum);
}
  static int add(int n)
  {
	  if(n==0)
	  {
		  return 0;
	  }
  return n%10+add(n/10);
  }
}
