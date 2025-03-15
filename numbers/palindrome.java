package numbers;
import java.util.*;

public class palindrome{
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
        if(num==rev){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("the number is not a palindrome");
        } 
    }
}