import java.util.*;
import java.io.*;


public class consecutiveVowels{

static Boolean isvowel(char c){
    if(c == 'a'|| c=='e' || c=='i' || c=='o'|| c=='u'){
        return true;
    }else {
        return false;
    }
}

static Boolean isconsecutivevowel(String s){
    for(int i=1;i<s.length();i++){
        if(isvowel(s.charAt(i)) && isvowel(s.charAt(i-1))){
            return true;
        }
    }

    return false;
}

static String isconsecutivesentence(String s){
    s = s.trim();
    String word = "";
    int count = 0;
    String ansstring = "";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) == ' '){
            if(isconsecutivevowel(word)){
                count++;
                ansstring = ansstring + word;
            }
            word = "";
        }else{
            word = word + s.charAt(i);
        }
    }

    return ansstring;
}

    public static void main(String args[]){
        System.out.println(isconsecutivesentence("I enjoy eating spaghetti and meatballs for dinner"));
    }
}