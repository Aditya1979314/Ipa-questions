import java.util.*;


public class countPrime{

static Boolean isprime(int n){
    int count = 0;
    for(int i=1;i<=n;i++){
        if(n%i ==0){
            count++;
        }
    }
    if(count == 2){
        return true;
    }else{
        return false;
    }
}

static int countp(int n){
    int count = 0;
    int temp = n;
    while(temp != 0){
        int r = temp % 10;
        if(isprime(r)){
        count++;
        }
        temp = temp/10;
    }

return count;
    
}


    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();sc.nextLine();
    System.out.println(countp(n));
    }
}