package fun;
import java.util.*;

public class flames {
    public static void main(String[]args){
        System.out.println("enter the names of persons to check compatablity");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int count = 0;

        for(int i=0;i>=str1.length()-1;i++){
            for(int j=0;j<str2.length()-1;j++){
                if(str1.charAt(i)!=str2.charAt(j)){
                    count++;
                }
            }
        }
        char[]arr={'f','l','a','m','e','s'};
        for (int k=0;k<arr.length-1;k++) {
            arr.removeall(k);
        }

    } 
    
}
