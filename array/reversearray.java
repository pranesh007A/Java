import java.util.*;

public class reversearray{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[]arr = new int[a];
    for(int i=0;i<a;i++){
      arr[i] = sc.nextInt();
    }
       int start = 0;
       int end = arr.length-1;
       
       while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
       }
        for(int num:arr){
      System.out.print(num+" ");
        }
  }
}
