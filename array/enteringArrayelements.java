import java.util.*;

public class enteringArrayelements {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 
 
        System.out.println("enter the number of elements needed in the array");
        int n = sc.nextInt();    //getting the number which gets assigned to the number of array elements
        System.out.println("enter the elements of the array");
        int[]arr = new int[n];    //initializing an array with the n elements capacity
        for(int i=0;i<n;i++){     //to traverse each element in the array for the number to be inserted one by one
            arr[i]=sc.nextInt();     //to scan the numbers one by one and enter to the index of the array
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }     
}