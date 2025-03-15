package codes;

import java.util.Scanner;

public class loan_approvement {
    	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("enter your name");
		String n = sc.nextLine();
		
		System.out.println("enter your age");
		int a = sc.nextInt();
	
		System.out.println("enter your salary");
		Double s = sc.nextDouble();
		
		System.out.println("enter your cybilscore");
		int c = sc.nextInt();
		
		if(a>18){
		    if(c>=750){
		        if(s>=50000){
		            System.out.println(n+" you are eligible for loan "); }
		    else {
		        System.out.println(n+" you are not eligible for loan");} } 
		    
		else{
		     	System.out.println("enter the correct details");}   
		sc.close();
		
	}
}}
