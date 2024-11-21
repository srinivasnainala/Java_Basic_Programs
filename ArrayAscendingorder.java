 package basicPrograms1;

import java.util.Arrays;

public class ArrayAscendingorder {
public static void main(String[] args) {
	int temp;
	int a[]= {112,43,456,23,543,67};
//	    Arrays.sort(a);
		System.out.println("Printing an array in ascending order");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}

