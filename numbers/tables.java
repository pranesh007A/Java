package numbers;

import java.util.Scanner;

public class tables {
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
            for(int j =1; j <= 10; j++){
                System.out.println(a+" x "+j +" = " +a*j);
            }
            sc.close();
    }
}
