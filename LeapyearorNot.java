package basicPrograms1;

public class LeapyearorNot {
public static void main(String[] args) {
	int year=2021;
	if((year%4==0)&&(year%100!=0))
	{
		System.out.println("Given number is Leap year");
	}
	else
	{
		System.out.println("Given year is not a leap year");
	}
}
}
