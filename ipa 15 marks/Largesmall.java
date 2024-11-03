import java.util.*;


public class Largesmall{

    public static void main(String args[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array length");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
        System.out.println("Enter the number "+i);
        int num = sc.nextInt();
        if(num > max){
            max = num;
        }

        if(num<min){
            min = num;
        }
        }

        System.out.println("max number = "+max);
        System.out.println("min number = "+min);
    }
}