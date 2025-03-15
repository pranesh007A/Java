package codes;//not yet compleated the code
import java.util.*;
public class onlinestore{
    public static void main(String[]args){
        //activating scanner
        Scanner sc = new Scanner(System.in);

        //declaration of arrays
        String[]name={"muhil","dharun","anish"};
        String[]premiumname={"pranesh","aashif","rajiee"};
        String[]clothing={"shirt","pant","tshirt"};
        int[]mrp1={150,200,100};
        String[]groceries={"carrot","tomato","potato"};
        int[]mrp2={10,20,30};
        String[]electronics={"laptop","phone","headphones"};
        int[]mrp3={10000,1000,100};

        //welcomeing
        System.out.println("welcome to eeshwarans online store");
        System.out.println(" ");
        System.out.println("select the required materials from the given list:");
        System.out.println(" ");

        //listing the items at the store
        System.out.println("clothing section(1) :"+(Arrays.toString(clothing)));
        System.out.println("groceries section(2) :"+(Arrays.toString(groceries)));
        System.out.println("electronics section(3) :"+(Arrays.toString(electronics)));

        //getting the required items from the customer
        int a1 = sc.nextInt();
        for(i=0;i==a1;i++)

    }
}