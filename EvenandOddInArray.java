package basicPrograms1;

public class EvenandOddInArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,4,5,6,7};
	System.out.println("Printing even and odd elements in array: ");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]+" is even");
		}
		else
		{
			System.out.println(a[i]+" is odd ");
		}
	}
}
}
