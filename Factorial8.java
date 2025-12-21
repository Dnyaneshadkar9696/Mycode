//import java.util.Scanner;

public class Factorial8 {
	

	public static void main(String[] args) {
		
		// here we have to print the factorial of the number
		// factorial means the number is multiplied by the smaller number till it reaches to the one
		// for example 5! = 5 * 4 * 3 * 2 * 1
		int a = 5;
		int b = 1;
		
		// lets take input from the user 
//		Scanner ey = new Scanner(System.in);
//		System.out.println("Enter the positive value: ");
//		System.out.println("Enter the number fot the factorial : ");
//		a = ey.nextInt();
		
		
		// we can use for loop here 
		// mala number la ak digit ni kami karaicha ahee 
		
		for( int i = a; i >= 1;i--) {
			b = b * i;
			// the answer is getting multiplid, the loop is reducing the number we have to focus on the calculation.
		}
		System.out.println("The factorial of the number is as follows: " + b);
		
		
		
		
	}

}
