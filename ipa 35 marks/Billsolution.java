import java.util.*;


public class Billsolution{

static Bill findBillWithMaxBillAmountBasedOnStatus(Bill[] arr,boolean status){
Bill ans = null;
double max = Double.MIN_VALUE;
for(int i=0;i<arr.length;i++){
    if(arr[i].getstatus() == status && arr[i].getbillamount() > max){
        max = arr[i].getbillamount();
        ans = arr[i];
    }
}
if(ans != null){
    return ans;
}else {
    return null;
}
} 

static int getCountWithTypeOfConnection(Bill[] arr,String connec){
int count = 0;
for(int i=0;i<arr.length;i++){
if(arr[i].getconnection().equalsIgnoreCase(connec)){
    count++;
}
}

return count;
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();sc.nextLine();
        Bill[] arr = new Bill[n];
        for(int i=0;i<n;i++){
            int billno = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String connection =sc.nextLine();
            double amount = sc.nextDouble();sc.nextLine();
            boolean status = sc.nextBoolean();sc.nextLine();
            Bill obj = new Bill(billno,name,connection,amount,status);
            arr[i] = obj;
        }
        boolean status = sc.nextBoolean();sc.nextLine();
        String connection = sc.nextLine();

        Bill billname = findBillWithMaxBillAmountBasedOnStatus(arr,status);
        if(billname != null){
            System.out.println("#"+billname.getname());
        }else{
            System.out.println("There are no bill with the given status");
        }

        int count = getCountWithTypeOfConnection(arr,connection);
        if(count > 0){
            System.out.println(count);
        }else{
            System.out.println("There are no bills with given type of connection");
        }
    }
}

class Bill{
   private int billNo;
 private String name, typeOfConnection;
private double billAmount;
 private boolean status;

public Bill(int billNo,String name, String typeOfConnection,double billAmount, boolean status){
    this.billNo = billNo;
    this.name = name;
    this.typeOfConnection = typeOfConnection;
    this.billAmount = billAmount;
    this.status = status;
}

public int getbillno(){
    return billNo;
}

public String getname(){
    return name;
}

public String getconnection(){
    return typeOfConnection;
}

public double getbillamount(){
    return billAmount;
}

public boolean getstatus(){
    return status;
}

}