import java.util.*;


public class Countword{


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] arr = s.split(" ");

        String word = sc.nextLine();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            String ch = "";
           for(int j=0;j<arr[i].length();j++){
            if(Character.isLetter(arr[i].charAt(j))){
                ch = ch + arr[i].charAt(j);
            }
           }

           if(ch.equals(word)){
            count++;
            ch = "";
           }
        }

        System.out.println("number of words similar = "+count);
    }
}