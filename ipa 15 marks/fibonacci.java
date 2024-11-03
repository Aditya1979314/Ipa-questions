import java.util.*;



public class fibonacci{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prev = 0;
        int next = 1;
        System.out.println(prev);
        System.out.println(next);
        while(next < n){
           int temp = next;
           System.out.println(temp); 
           next = next + prev;
           prev = temp;
        }
    }
}