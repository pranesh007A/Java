package String;

public class findingvowels {
    public static void main(String[] args) {
        String str = "pranesh";
        for(int i=0;i<str.length()-1;i++){
            char q = str.charAt(i);
            if(q=='a'||q=='e'||q=='i'||q=='o'||q=='u'){
            System.out.println(q+" at the place "+i);
            }
        }
}
}
