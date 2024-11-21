package basicPrograms1;

public class RightPyramidUsingTwoLoops {
public static void main(String[] args) {
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=(i<=5?i:10-i);j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
