import java.util.*;


public class Solution{

public static class Motel{
private int motelId,noOfRoomsBooked;
private String motelName,cabFacility,dateOfBooking;
private double totalBill;

public Motel(int motelId,String motelName,String dateOfBooking,int noOfRoomsBooked,String cabFacility,double totalBill){
    this.motelId = motelId;
    this.noOfRoomsBooked = noOfRoomsBooked; 
    this.motelName = motelName;
    this.cabFacility = cabFacility;
    this.dateOfBooking = dateOfBooking;
    this.totalBill = totalBill;
}

int getmotelid(){
    return motelId;
}

int getnoofrooomsbooked(){
    return noOfRoomsBooked;
}

String getmotelname(){
    return motelName;
}

String getcabfacility(){
    return cabFacility;
}

String getdateofbooking(){
    return dateOfBooking;
}

double gettotalbill(){
    return totalBill;
}


}

static int totalNoOfRoomsBooked(Motel[] arr, String cabfacility){
int count = 0;

for(int i=0;i<arr.length;i++){
    if(arr[i].getcabfacility().equals(cabfacility) && arr[i].getnoofrooomsbooked() > 5){
        count++;
    }
}

return count;
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lenght of arra");

        int n = sc.nextInt();
        Motel[] m = new Motel[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            int id = sc.nextInt();sc.nextLine();
            String motelName = sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int roomsbooked = sc.nextInt();sc.nextLine();
            String cabFacility = sc.nextLine();
            double totalBill = sc.nextDouble();sc.nextLine();
            Motel obj = new Motel(id,motelName,dateOfBooking,roomsbooked,cabFacility,totalBill);
            m[i] = obj;
        }
    String cab = sc.nextLine();
    if(totalNoOfRoomsBooked(m,cab) > 0){
        System.out.println(totalNoOfRoomsBooked(m,cab));
    }else{
        System.out.println("No such rooms booked");
    }
    }
}

