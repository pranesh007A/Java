package codes;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the year you want to check");
		int n = sc.nextInt();
		
		if((n%4==0 && n%100!=0)||(4%400==0))
		{System.out.println("the given year is leap year");}
		else 
		{System.out.println("the given year is not a leap year");}
		
	}
}
