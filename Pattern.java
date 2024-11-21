package basicPrograms1;

public class Pattern {
public static void main(String[] args) {
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=i;j<=5;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=1;j<i;j++)
//		{
//			System.out.print(""+" "+j);
//		}
//		System.out.println();
//	}
//	for(int i=1;i<=5;i++)
//	{
//	for(int j=1;j<=i;j++)
//	{
//		System.out.print(" ");
//	}
//	for(int j=i;j<5;j++)
//	{
//		System.out.print(""+" "+j);
//	}
//	System.out.println();
//	}
//	
	
//	for(int i=1;i<=4;i++)
//	{
//		for(int j=1;j<=4;j++)
//		{
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
//	for(int i=4-1;i>=2;i--)
//	{
//		for(int j=i;j<=4;j++)
//		{
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
//	for(int i=2;i<=4;i++)
//	{
//		for( int j=i;j<=4;j++)
//		{
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
//	for(int i=1;i<=4;i++)
//	{
//		for(int j=1;j<=4;j++)
//		{
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
	
//	     *
//      * *
//     * * *
//    * * * *
//   * * * * *
//  * * * * * *
// * * * * * * *
	
//	for (int i=1; i<=6; i++)   
//	{     
//	for (int j=7-i; j>1; j--)   
//	{  
//	System.out.print(" " );   
//	}   
//	for (int k=0; k<=i; k++ )   
//	{   
//	 System.out.print( " " +"*");   
//	}   
//	System.out.println();   
//	}  

	
//	1
//	1*2
//	1*2*3
//	1*2*3*4
//	1*2*3*4*5
//	1*2*3*4*5*6
//	1*2*3*4*5*6*7
//	
//	for(int i=1;i<=7;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//		System.out.print(j);
//		if(j<i)
//		{
//			System.out.print("*");
//		}
//		}
//		System.out.println();
//	}
	
	
	
//	   *
	
//     ** 
//
//    **** 
//
//   ****** 
//
//  ******** 
//
// ********** 
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=6;j>=i;j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1;k<=i;k++)
//		{
//			System.out.print("*");	
//		}
//		for(int k=1;k<=i;k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println(" ");
//		System.out.println();
//	}
	
	
	
	
//	******1
//	*****12
//	****123
//	***1234
//	**12345
//	*123456
//	1234567
//for(int i=1;i<=7;i++)
//{
//	for(int j=1;j<=7-i;j++)
//	{
//		System.out.print("*");
//	}
//	for(int k=1;k<=i;k++)
//	{
//		System.out.print(k+"");
//	}
//	System.out.println();
//}
	
	
	
//	1
//	*2*
//	**3**
//	***4***
//	****5****
//	*****6*****
//	******7******
//	for(int i=1;i<=7;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{ 
//			if(i==j)
//			{
//			System.out.print(j);
//			}
//			else
//			{
//				System.out.print("*");
//			}
//		}
//		for(int k=2;k<=i;k++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
	
	
//	A B C D E F G 
//	A B C D E F 
//	A B C D E 
//	A B C D 
//	A B C 
//	A B 
//	A 
//	for(int i=6;i>=0;i--)
//	{
//		for(int j=0;j<=i;j++)
//		{
//			char ch=(char)('A'+j);
//			System.out.print(ch+" ");
//		}
//		System.out.println();
//	}

	
//	A 
//	A B 
//	A B C 
//	A B C D 
//	A B C D E 
//	A B C D E F 
//	for(int i=0;i<=4;i++)
//	{
//		for(int j=0;j<=i;j++)
//		{
//			char ch=(char)('A'+j);
//			System.out.print(ch+" ");
//		}
//		System.out.println();
//	}

	
//	1 
//	2 1 
//	3 2 1 
//	4 3 2 1 
//	5 4 3 2 1 
	
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=i;j>=1;j--)
//		{
//				System.out.print(j+" ");
//		}
//		System.out.println();
//	}
	
	
	
//	5
//	54
//	543
//	5432
//	54321
	
//	for(int i=1;i<=5;i++)
//	{
//		int k=5;
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print(k);
//			k--;
//		}
//		System.out.println();
//	}
	
	
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 
//	int k=1;
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print(k+" ");
//			k++;
//		}
//		System.out.println();
//	}

	
//	    *
//     * *
//    * * *
//   * * * *
//  * * * * *
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=5;j>=i;j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1;k<=i;k++)
//		{
//			System.out.print(" *");
//		}
//		System.out.println();
//	}
	
	
	
	
//	1
//	10
//	101
//	1010
//	10101
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{  
//			if(j%2==0)
//			{
//				System.out.print("0");
//			}
//			else
//			{
//		    System.out.print("1");
//			}
//	    }
//		System.out.println();
//	}
	
	
//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5 
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
	
//    1 
//   1 2 
//  1 2 3 
// 1 2 3 4 
//1 2 3 4 5 
	
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=4;j>=i;j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1;k<=i;k++)
//		{
//			System.out.print(k+" ");
//		}
//		System.out.println();
//	}
	
	
//      1
//    2 1 2
//  3 2 1 2 3
//4 3 2 1 2 3 4
	
//	int n=4;
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=i;j<=n;j++)
//		{
//			System.out.print("  ");
//		}
//		for(int j=i;j>=1;j--)
//		{
//			System.out.print(" "+j);
//		}
//		for(int j=2;j<=i;j++)
//		{
//			System.out.print(" "+j);
//		}
//		System.out.println();
//	}
	
	
//	 1 2 3 4
//	  2 3 4
//	   3 4
//	    4 
//	   3 4 
//	  2 3 4 
//	 1 2 3 4 
	
//	for(int i=1;i<=3;i++)
//	{
//		for(int j=1;j<i;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=i;j<=4;j++)
//		{
//			System.out.print(" "+j);
//		}
//		System.out.println();
//	}
//	for(int i=4;i>=1;i--)
//	{
//		for(int j=1;j<=i;j++)
//		{
//		System.out.print(" ");
//		}
//		for(int j=i;j<=4;j++)
//		{
//			System.out.print(j+" ");
//		}
//		System.out.println();
//    }
	
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=(i<=5?i:10-i);j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
