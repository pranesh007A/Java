package codes;//not yet compleated debugging

import java.util.Scanner;

public class banking {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = 86754;  int a1 = 1000;   
	    int b = 86753;  int b1 = 2000;
	    int c = 86752;  int c1 = 3000;
	    int d = 86751;  int d1 = 4000;
	    int e = 0;      int bal = 0;
		System.out.println("welcome to abc bank");
		System.out.println("enter your six digit account number");
		int accnum = sc.nextInt();
		if(a==accnum){
		    System.out.println("welcome user A");
		    System.out.println("your account balance is "+a1);
		    System.out.println("you have gained intrest of "+ (5)+"%");
		    e=(a1*5)/100;
		    bal=(a1+e);
		    System.out.println("your acc balance is "+bal);
		    if(bal>1500){
		        System.out.println("you are eligible for loan");
		    }
		    else{
		        System.out.println("you are not eligible for loan");
		    }
		}
		else if(b==accnum){
		    System.out.println("welcome user B");
		    System.out.println("your account balance is "+b1);
		    System.out.println("you have gained intrest of "+ (5)+"%");
		    e=(b1*5)/100;
		    bal=(a1+e);
		    System.out.println("your acc balance is "+bal);
		    if(bal>1500){
		        System.out.println("you are eligible for loan");
		    }
		    else{
		        System.out.println("you are not eligible for loan");
		    }
		}   
		
		else if(c==accnum){
		    System.out.println("welcome user C");
		    System.out.println("your account balance is "+c1);
		    System.out.println("you have gained intrest of "+ (5)+"%");
		    e=(c1*5)/100;
		    bal=(c1+e);
		    System.out.println("your acc balance is "+bal);
		    if(bal>1500){
		        System.out.println("you are eligible for loan");
		    } 
		    else{
		        System.out.println("you are not eligible for loan");
		    }
		}
		else if(d==accnum){
		    System.out.println("welcome user D");
		    System.out.println("your account balance is "+d1);
		    System.out.println("you have gained intrest of "+ (5)+"%");
		    e=(d1*5)/100;
		    bal=(d1+e);
		    System.out.println("your acc balance is "+bal);
		    if(bal>1500){
		        System.out.println("you are eligible for loan");
	    	}
	    	else{
		        System.out.println("you are not eligible for loan");
		    }
		    
		}
		else{
		    System.out.println("account number incorrect...enter your correct number!");}
		
		while(bal>2500){
		    System.out.println("enter the loan ammount required");
		    int reqamt = sc.nextInt();
		    if(reqamt>5000){
		        System.out.println("you can avail the required ammount");
		        System.out.println("");
		        System.out.println("bring the following documents :-");
		        System.out.println("");
		        System.out.println("aadhar card");
		        System.out.println("pan card");
		        System.out.println("cibil score proof");
		        }

		    }
		    
		}    System.out.println("for availing of small loan your balance must be above 2500");
		
		    
		sc.close();   
	}

