
import java.util.*;


public class Assignment1 {
	

	public static void main(String[] args) {
		char operation, con;
		Double num1,num2,answer;
		
		Scanner scanner= new Scanner(System.in);
		
		do {
			System.out.print("Enter First Number: ");
			num1=scanner.nextDouble();
			
			System.out.print("Enter Second Number: ");
			num2=scanner.nextDouble();
			System.out.println("============================");
			System.out.print("Choose an operation: ");
			operation=scanner.next().charAt(0);
		switch(operation) {
		
		case '+':
			
			answer=num1+num2;
			
			System.out.println("Addition of Number = "+answer);
			break;
		
		case '-':
			answer=Math.abs(num1-num2);
			System.out.println("Subtraction of Number = "+answer);
			break; 
			
		case '*':
			answer=num1*num2;
			System.out.println("Multiplication of Number = "+answer);
			break;
		case '/':
			answer=num1/num2;
			System.out.println("Division of Number = "+answer);
			break;
		default:
			System.out.println("Invalid Operation selected");
			
			}
		System.out.println("===============================");
		System.out.print("Do you want to continue: ");
			con=scanner.next().charAt(0);
			
			System.out.println("==============================");
		}
		while(con=='y'||con=='y');
		

	}

}
