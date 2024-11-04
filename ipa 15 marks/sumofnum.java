import java.util.*;


public class sumofnum{

static int converttoint(String s){
    int pow = 1;
    int ans = 0;
    for(int i=s.length()-1;i>=0;i--){
        int r = s.charAt(i) - '0';
        r = r * pow;
        ans = ans + r;
        pow = pow * 10;
    }

    return ans;
}

static Vector<String> converttoarray(String s){
Vector<String> ans = new Vector<>();
String word = "" + s.charAt(0);
    for(int i=1;i<s.length();i++){
        if((Character.isLetter(s.charAt(i)) && Character.isDigit(s.charAt(i-1))) || (Character.isDigit(s.charAt(i)) && Character.isLetter(s.charAt(i-1)))) {
            ans.addElement(word);
            word = "" + s.charAt(i);
        }else {
            word = word + s.charAt(i);
        }
    }
ans.addElement(word);
    return ans;
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Vector<String> v = converttoarray(s);
        int ans = 0;
        for(String ch:v){
            if(Character.isDigit(ch.charAt(0))){
                int r = converttoint(ch);
                ans = ans + r;
            }
        }

        System.out.println("The answer is "+ans);
    }
}