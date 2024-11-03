import java.util.*;


public class Countwords{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.trim();
        String[] arr = s.split(" ");
        System.out.println(arr.length);
        int c= 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                c++;
            }
        }

        System.out.println("number of words = "+(c+1));
    }
}