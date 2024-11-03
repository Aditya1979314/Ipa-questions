public class Secondlargest{
    public static void main(String args[]){
        int[] arr = new int[] {2,4,1,9,10};

        int largest = -1;
        int Secondlargest = -2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                Secondlargest = largest;
                largest = arr[i];
            }

            if(arr[i]<largest && arr[i]>Secondlargest){
                Secondlargest = arr[i];
            }
        }

        System.out.println(largest+" "+Secondlargest);
    }
}