package patterns;

public class rectangular {
    public static void main(String[]args){
        int row = 3;
        int column = 6;
        for(int i=1;i<=column;i++){
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
