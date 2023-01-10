import java.util.*;
class Student{
  
    String name;
    String city;
    int age;

    Student(String name, String city, int age){
        this.name = name;
        this.city = city;
        this.age = age;
    }
    void printData(){
        System.out.println("Name => " + name);
        System.out.println("City => " + city);
        System.out.println("Age => "+ age);
    }

    
}




public class assignment4 {
    public static void main(String[] args) {
        Student s1= new Student("saket","muzaffarpur",22);
        s1.printData();
        Student s2= new Student("sanidhya","rewa",13);
        s2.printData();
    }
}
