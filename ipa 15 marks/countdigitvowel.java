import java.util.*;



public class countdigitvowel{

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int v=0,c=0,num=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                    v++;
                }else{
                    c++;
                }
            }else if(Character.isDigit(s.charAt(i))){
                num++;
            }
        }

        System.out.println("Vowel ="+v);
        System.out.println("Consonant ="+c);
        System.out.println("Digits ="+num);
    }
}