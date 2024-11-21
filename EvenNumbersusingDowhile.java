package basicPrograms1;

public class EvenNumbersusingDowhile {
public static void main(String[] args) {
	int i=2;
	System.out.println("Printing Een numbers:");
	do {
		if(i%2==0)
		{
			System.out.println(+i+" is a even number");
		}
		i++;
	}while(i<=100);
}
}
