package basicPrograms1;

public class LargestandSmallestElementofanArray {
public static void main(String[] args) {
	int a[]= {4324,454,56,63,2322,56};
	int large=a[0];
	int small=a[0];
	System.out.println("Given array is :" );
	for(int i=0;i<a.length;i++)
	{
		System.out.print(" "+a[i]);
		if(a[i]>large)
		{
			large=a[i];
		}
		else if(a[i]<small)
		{
			small=a[i];
		}
	}System.out.println();
	System.out.println("Largest element in the given array is : "+large);
	System.out.println("Smallest element in the given array is : "+small);
}
}
