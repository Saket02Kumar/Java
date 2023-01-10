import java.util.*;
class Vehicle{
    Scanner sc=new Scanner(System.in);
    String registration_no;
    String color;
    String type;
    void getdata(){
        System.out.println("enter registration no=>");
        registration_no=sc.nextLine();
        System.out.println("enter color=>");
        color=sc.nextLine();
        System.out.println("enter type");
        type=sc.nextLine();
    }
    void putdata(){
        System.out.println("registration no="+ registration_no);
        System.out.println("color="+ color);
        System.out.println("type="+ type);
    }
}


class Car extends Vehicle{
    int cc;
    String fueltype;
    void getccFuel(){
        System.out.print("enter fueltype=>");
        fueltype=sc.nextLine();
        System.out.print("enter cc=>");
    cc=sc.nextInt();
       
    }
        

    
        void putccFuel(){
            System.out.println("enter cc="+ cc);
            System.out.println("fueltype="+fueltype );
           
        }
        
    
    

}

class Truck extends Vehicle{
    int cc;
    String fueltype;
    void getccFuel(){
        System.out.println("enter fueltype=>");
        fueltype=sc.nextLine();
        System.out.println("enter cc=>");
    cc=sc.nextInt();
        
    }
        void putccFuel(){
            System.out.println("enter cc="+ cc);
            System.out.println("fueltype="+fueltype );
           
        }
        
    
    
}


class Motorcycle extends Vehicle{
    int cc;
    String fueltype;
    void getccFuel(){
        System.out.print("enter fueltype=>");
        fueltype=sc.nextLine();
        System.out.print("enter cc=>");
    cc=sc.nextInt();
        
    }
        void putccFuel(){
            System.out.println("enter cc="+ cc);
            System.out.println("fueltype="+fueltype );
           
        }
    
    
    
}





public class Assignment3 {
    public static void main(String[] args) {
        
        Car car=new Car();
        car.getdata();
        car.putdata();
        car.getccFuel();
        car.putccFuel();
        Truck truck=new Truck();
    truck.getdata();
        truck.putdata();
        truck.getccFuel();
        truck.putccFuel();
     Motorcycle bike=new Motorcycle();
        bike.getdata();
        bike.putccFuel();

    }
}