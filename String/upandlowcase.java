package String; 

public class upandlowcase{
  public static void main(String[]args){
   String str = "hello3wo4rld";
   int upper = 0;
   int lower = 0;
   for (int i = 0;i < str.length();i++){
    char a = str.charAt(i); 

    if(a == b){
      upper++;
    }
    else{
      lower++;
    } 
  }
  
  System.out.println("upper = "+upper);
  System.out.println("lower = "+lower);
}
}