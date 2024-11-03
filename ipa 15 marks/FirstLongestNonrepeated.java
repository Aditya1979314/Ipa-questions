import java.util.*;


public class FirstLongestNonrepeated{

static Boolean charexists(String s, char c){
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) == c){
            return true;
        }
    }
    return false;
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(!charexists(ans,s.charAt(i))){
                ans = ans + s.charAt(i);
            }else{
                System.out.println("answer is = "+ans);
            }
        }
    }
}