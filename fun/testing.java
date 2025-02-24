package fun;
public class testing {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5};
        int start=0;
        int end = numbers.length-1;
        while(start<end){
            int temp = numbers[end];
            numbers[start] = numbers[end];
            numbers[end] = temp;
        }
        start ++;
        end--;
     
     for(int num:numbers){
        System.out.println(num+" ");
     }

}
}
