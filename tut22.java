

import java.util.*;
public class tut22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();

        
        if(n<=127){
            System.out.println("class a");

        }else if(n<=128 && n<192){
            System.out.println("class b");

        }else if(n<=192 && n<223) {
            System.out.print("class c\nits network id id ");
        }
        
    }
}
