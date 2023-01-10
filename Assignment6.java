import java.util.*;

abstract class Shape{
Scanner sc=new Scanner(System.in);
    int l;
    int b;
    int r;
   abstract void  printArea();
}

class Rectangle extends Shape{
    void printArea(){
        System.out.print("enter length:");
        l=sc.nextInt();
        System.out.print("enter breadth:");
        b=sc.nextInt();




        System.out.println("AREA OF RECTANGLE IS=> " + l*b);
    }

    
}
class Triangle extends Shape{
    void  printArea(){
        System.out.print("enter length:");
        l=sc.nextInt();
        System.out.print("enter breadth:");
        b=sc.nextInt();
        System.out.println("area of triangle =>" + l*b/2);
    }
}
class Circle extends Shape{
    void  printArea(){
        System.out.print("enter radius:");
        r=sc.nextInt();
        
        System.out.println("area of circle =>" + 3.14*r*r);
    }
}




public class Assignment6 {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.printArea();
        Rectangle r1=new Rectangle();
        r1.printArea();
        Circle c1=new Circle();
        c1.printArea();
    }
    
}
