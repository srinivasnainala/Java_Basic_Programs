package basicPrograms1;

public class pattern2 {
public static void main(String[] args) {
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=7-i;j++)
		{
			System.out.print("*");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(k+"");
		}
		System.out.println();
	}
}
}
