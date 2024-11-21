package basicPrograms1;

public class DuplicateElementsinArray {
public static void main(String[] args) {
int a[]= {2,1,2,1,7,23,12,123,7};
int count=0;
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j])
		{
			System.out.print(a[j]+" ");
		count++;
		}
	}
}
System.out.println();
System.out.println("duplicate elements in an array is : " +count);
}
}
