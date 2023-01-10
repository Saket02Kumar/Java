/*class pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing some thing");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}*/
class Student {
String name;
int age;
public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
}

public class oops {
    public static void main(String[] args) {
     Student s1=new Student();
     s1.name="aman";
     s1.age=24;
     s1.printInfo();
      
      
    }
}
