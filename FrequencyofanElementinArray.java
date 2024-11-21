package basicPrograms1;

import java.util.Scanner;

public class FrequencyofanElementinArray  
{
public static void main(String[] args)  
{
	int a[]= {1,3453,54,1,3,3,3,5,3};
	int frequency=0;
	System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i:a)
      {
		if(i==n)
		  {
			frequency++;
		  }
      }
    System.out.println("Frequency of " +n+ " is :" +frequency);
  }
}
