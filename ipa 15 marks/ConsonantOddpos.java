import java.util.*;


public class ConsonantOddpos{

static Boolean isvowel(char s){
    s = Character.toLowerCase(s);
    if(s == 'a'|| s=='e'||s=='i'||s=='o'||s=='u'){
        return true;
    }
    return false;
}

static String countConsonant(String s){
    String ans = "";
    for(int i=0;i<s.length();i++){
        if((i+1)%2 != 0 && !isvowel(s.charAt(i))){
            ans = ans + s.charAt(i);
        }
    }
    return ans;
}

    public static void main(String args[]){
     System.out.println(countConsonant("Arijit Ghosh"));
    }
}