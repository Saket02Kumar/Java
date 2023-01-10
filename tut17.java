import java.util.*;
public class tut17 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int button=sc.nextInt();
    //  int x=sc.nextInt();
    //   int y=sc.nextInt();

    //   if( x==y){
        //   System.out.println("no is same");
    //   }else if(x>y){
        //   System.out.println("no 1 is greater ");
    //   }else{
        //   System.out.println("no 1 is lesserr");
    //   }
      
      switch(button){
          case 1:System.out.println("hello");
          break;
          case 2:System.out.println("namaste");
          break;
          case 3:System.out.println("bonjour");
          break;
          default:System.out.println("ivalid n0o");

      }

    }
}
