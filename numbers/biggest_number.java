package numbers;

import java.util.Scanner;

public class biggest_number {
    	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter 3 numbers to be compared");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    
	    if(a>b&&a>c)
	    { System.out.println("a is greater");}
	    else if(b>a&&b>c)
	    { System.out.println("b is greater");}
	    else 
	    { System.out.println("c is greater");}
	    sc.close();
	}
}
