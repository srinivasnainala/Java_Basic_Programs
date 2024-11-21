package basicPrograms1;

public class SumofElementsInArray {
public static void main(String[] args) {
	int sum=0;
	int a[]= {1,2,3,4,5,6,7,32};
	System.out.println("Given array is:");
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Sum of elements in an array is: "+sum);
}
}
