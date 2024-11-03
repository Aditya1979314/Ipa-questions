import java.util.*;
import java.lang.Math;


public class Armstrong{
     static void armstrong(int n){
        int count=0;
        int temp = n;
        while(temp != 0){
        temp = temp/10;
            count++;
        }

        double a = 0;
        temp = n;
        while(temp != 0){
            int r = temp % 10;
            a = a + Math.pow(r,count);
            temp = temp/10;
        }

        if(a == n){
            System.out.println("It is a armstrong number");
        }else{
            System.out.println("Not a armstrong number");
        }
    }

    public static void main(String args[]){
        armstrong(120);
    }
}