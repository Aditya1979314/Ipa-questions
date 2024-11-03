import java.util.*;


public class firstNotrepeated{

static char returnfirst(String s){
    int n = 26;
    int[] arr = new int[n];

    for(int i=0;i<s.length();i++){
        arr[s.charAt(i) - 'a']++;
    }

    for(int i=0;i<arr.length;i++){
        if(arr[s.charAt(i) - 'a'] == 1){
            return s.charAt(i);
        }
    }
   char re = '1';
    return re;
}

    public static void main(String args[]){
        System.out.println(returnfirst("minimum"));
    }
}