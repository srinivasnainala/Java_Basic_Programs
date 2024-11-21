package basicPrograms1;

public class CopyingoneArrayelementsintoanother {
public static void main(String[] args) {
	int a[]= {1212,12312,1231,6577,2344};
	int b[]=new int[a.length];
    for(int i=0;i<a.length;i++)
    {
    	b[i]=a[i];
    }
    for(int i=0;i<b.length;i++)
    {
    	System.out.print(b[i]+" ");
    }
}
}
