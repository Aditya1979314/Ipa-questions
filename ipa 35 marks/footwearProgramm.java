import java.util.*;


public class footwearProgramm{

static int getCountByType(Footwear[] arr,String type){
    int count = 0;
    for(int i=0;i<arr.length;i++){
        if(arr[i].getfootweartype().equals(type)){
            count++;
        }
    }

    return count;
}

static Footwear getSecondHighestPriceByBrand(Footwear[] arr,String name){
    int firstlargest = arr[0].getprice();
    int secondlargest = arr[0].getprice();
    Footwear[] a = new Footwear[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i].getfootwearname().equals(name)){
            a = Arrays.copyOf(a,a.length+1);
            a[a.length -1] = arr[i];
        }
    }
    Footwear second = new Footwear(0,"","",0) ;
    Footwear first = new Footwear(0,"","",0) ;
    for(int i=0;i<a.length;i++){
        if(firstlargest < a[i].getprice()){
            secondlargest = firstlargest;
            firstlargest = a[i].getprice();
            first.setfootwearid(a[i].getfootwearid());
            first.setfootwearname(a[i].getfootwearname());
            first.setprice(a[i].getprice());
            first.setfootweartype(a[i].getfootweartype());

            second.setfootwearid(a[i].getfootwearid());
            second.setfootwearname(a[i].getfootwearname());
            second.setprice(a[i].getprice());
            second.setfootweartype(a[i].getfootweartype());

        }else if(firstlargest > a[i].getprice() && secondlargest < a[i].getprice() ){
            second = new Footwear(a[i].getfootwearid(),a[i].getfootweartype(),a[i].getfootwearname(),a[i].getprice());
        }
    }

    return second;
}

    public static void main(String args[]){
        Footwear obj1 = new Footwear(1,"leather","reebok",200);
        Footwear obj2 = new Footwear(2,"plastic","reebok",400);
        Footwear obj3 = new Footwear(3,"leather","reebok",300);
        Footwear obj4 = new Footwear(4,"leather","puma",200);

        Footwear[] arr = new Footwear[4];
        arr[0] = obj1;
        arr[1] = obj2;
        arr[2] = obj3;
        arr[3] = obj4;

        Footwear ans = getSecondHighestPriceByBrand(arr,"reebok");
        System.out.println(ans.getprice());
    }
}

 class Footwear{
    private int footwearId,price;
    private String footwearType,footwearName;

    public Footwear(int footwearId,String footwearType , String footwearName, int price){
        this.footwearId = footwearId;
        this.footwearType = footwearType;
        this.footwearName = footwearName;
        this.price = price;
    }

      int getfootwearid(){
        return footwearId;
    }

      int getprice(){
        return price;
    }

      String getfootwearname(){
        return footwearName;
    }

      String getfootweartype(){
        return footwearType;
    }

     void setfootwearid(int id){
        this.footwearId = id;
    }

      void setprice(int p){
        this.price =p;
    }

     void setfootwearname(String name){
        this.footwearName = name;
    }

     void setfootweartype(String t){
        this.footwearType = t;
    }

}


// class Footwear

// private
//footwearId = int
//footwearType = String
// footwearName String
// price int


// footwearProgramm

// getCountByType(Footwear[] arr,String type){

//     return count of the footwears from the arr;
// }

// getSecondHighestPriceByBrand(Footwear[] arr,String name){


//     return second highest footwear object by price;
// }


