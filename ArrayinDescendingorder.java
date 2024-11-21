package basicPrograms1;

import java.util.Arrays;

public class ArrayinDescendingorder {
public static void main(String[] args) {
	int a[]= {1,55,23,78,64,94,24};
	System.out.println("Given array is:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
		Arrays.sort(a);
	}

	System.out.println();
	System.out.println("After Descending order:");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
}
}
