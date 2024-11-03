import java.util.*;

public class oddchar{


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        for(int i=1;i<s.length();i++){
            if(i % 2 != 0){
                ans = ans + s.charAt(i);
            }
        }

        System.out.println(ans);
    }
}