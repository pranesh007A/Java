package numbers;

import java.util.Scanner;

public class reverse {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
        int a = num%10;
        rev = rev*10+a;
        num/=10;
        }
        System.out.println("the reversed number is:"+rev); 
        sc.close();
    }
}
