package basicPrograms1;

public class ReverseanArray {
public static void main(String[] args) {
	int a[]= {1,2,3,45,6};
	System.out.println("Printing an array in reverse order: ");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print (a[i]+" ");
	}
}
}
