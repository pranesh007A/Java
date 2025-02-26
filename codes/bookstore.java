package codes;
import java.util.*;

public class bookstore{
    public static void main(String[]args){
        System.out.println("welcome to EESHWARANS's book store");
        System.out.print("create an accout     ");
        System.out.print("(or)");
        System.out.print("     log in to an account ::");
        Scanner sc = new Scanner(System.in);
        String opt = sc.nextLine();
        if(opt.equals("create")){
            System.out.println("enter your name");
            String name = sc.nextLine();
            System.out.println("set your account password");
            int pass = sc.nextInt();sc.nextLine();
            System.out.println("your account has been regestered");
        }
        else if(opt.equals("log in")){
            System.out.println("enter your name");
            String name = sc.nextLine();
            System.out.println("enter your account password");
            int pass = sc.nextInt();sc.nextLine();
            System.out.println("you have been logged in to your account");
        }

            System.out.println(" ");
            System.out.println("enter your user type");
            String user =sc.nextLine();
            System.out.println("enter the MRP of the book you have purchased");
            double mrp = sc.nextDouble();
            System.out.println("enter the number of books you have purchased since 6 months");
            int books = sc.nextInt();
            
            switch(user){
                case "regular":
                    if(books>5){
                        double disprice = ((10.0/100.0)*mrp);
                        System.out.println("CONGRAGULATIONS!!");
                        System.out.println(" ");
                        System.out.println("you have got an discount of 10% on your MRP");
                        System.out.println("your discounted price is "+ disprice);
                        System.out.println("your grand total is "+(mrp-disprice));
                        break;
                    }
                case "premium":
                    if(books>10){
                        double disprice = ((20.0/100.0)*mrp);
                        System.out.println("CONGRAGULATIONS PREMIUM USER!!");
                        System.out.println(" ");
                        System.out.println("you have got an discount of 20% on your MRP");
                        System.out.println("your discounted price is "+ disprice);
                        System.out.println("your grand total is "+(mrp-disprice));
                        break;
                    }
                    else if(books<10 && books>5){
                        double disprice = ((15.0/100.0)*mrp);
                        System.out.println("CONGRAGULATIONS !!");
                        System.out.println(" ");
                        System.out.println("you have got an discount of 15% on your MRP");
                        System.out.println("your discounted price is "+ disprice);
                        System.out.println("your grand total is "+(mrp-disprice));
                        break;
                    }
                    else if(books<5){
                        System.out.println("OOPS!");
                        System.out.println(" ");
                        System.out.println("sorry,no discount from our side,better lucknext time!");
                        System.out.println("[TIP:get more books to avail an discount]");
                        break;
                    }
                case "admin":
                    double disprice = ((30.0/100.0)*mrp);
                    System.out.println("CONGRAGULATIONS ADMIN!!");
                    System.out.println(" ");
                    System.out.println("you have got an discount of 30% on your MRP");
                    System.out.println("your discounted price is "+ disprice);
                    System.out.println("your grand total is "+(mrp-disprice));
                    break;
            }
            
        System.out.println("************************************************************************");
        System.out.println("THANK YOU! for purchasing books on our store");
        System.out.println("visit our store often for more discounts and updates");
        sc.close();
    }
}

//NOTES:
// made using while loop(error occoured)
// changed to if else (positive rsult)
// a string should not occour after an integer if occours enter the line {sc.nextLine();} so that the string is entered without any conflicts with the integer eg.ln15 and ln22
// in a if else statement use equals keyword if comparing 2 strings eg.ln11 and ln18
// always use a .0 in mrp so that you dont need to saythat the answers are in double format eg.ln31, 45, 52, 65