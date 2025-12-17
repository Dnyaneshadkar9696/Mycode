import java.util.Scanner;
public class Evenodd {
	
	public static void main(String[] arg) {
		// here we have to check the even odd number
		
		// using if else statement
		// for receiving the input we use Scanner class to accept the input
		Scanner ty = new Scanner(System.in);
		int a =0;
		System.out.println("Enter the Real number: ");
		a = ty.nextInt();
		if(a%2==0) {
			System.out.println("It is a even number");
		}
		else {
			System.out.println("It is a odd number");
		}
		
		
	}

}
