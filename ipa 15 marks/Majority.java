import java.util.*;


public class Majority{

    public static void main(String args[]){
        Map<Integer,Integer> m = new HashMap<Integer,Integer>(0);

        int[] arr = new int[]{3, 3, 4, 2, 4, 4, 2, 4, 4};

        for(int i=0;i<arr.length;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);

            if(m.get(arr[i]) > arr.length/2){
                System.out.println(arr[i]);
            }
        }
    }
}