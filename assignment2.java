import java.util.*;

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter four nos");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        if(num1==num2&&num2==num3&&num3==num4){
            
            System.out.println(" Numbers are equal");

        }
        else{
            System.out.println("Numbers are not equal");
        }
    }
}
