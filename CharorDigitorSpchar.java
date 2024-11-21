package basicPrograms1;

import java.util.Scanner;

public class CharorDigitorSpchar {
public static void main(String[] args) {
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any character or digit or Special character");
    ch=sc.next().charAt(0);
    if(Character.isUpperCase(ch))
    {
    	System.out.println("It is in a UPPERCASE");
    }
    else if(Character.isLowerCase(ch))
    {
    	System.out.println("It is in a Lowercase");
    }
    else if(Character.isDigit(ch))
    {
    System.out.println("It is a digit");
    }
    else
    {
    	System.out.println("It is special character");
    }
}
}
