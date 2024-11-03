import java.util.*;


public class countWordvowel{

static Boolean isvowel(char c){
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ){
        return true;
    }
    return false;
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.trim();
        s = ' '+s;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ' && isvowel(s.charAt(i+1))){
                count++;
            }
        }

        System.out.println("Number of words = "+count);
    }
}