import java .util.*;
public class tut29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
// input
        int numbers[][]=new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }

        }

// output
 int x=sc.nextInt();
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        if(numbers[i][j]==x){
            System.out.println("x is found at locations ("+i+","+j+")");
        }System.out.print(numbers[i][j]+" ");
    }System.out.println();

}
    } 
}
