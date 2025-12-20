import java.util.Scanner;
// in this class we will see how to get an user input 
public class Userinput {
	public static void main(String[] args) {
		// we have to create an object to store the input
		
		Scanner ut = new Scanner(System.in);
		int a = 0;
		System.out.println("Enter the number:  ");
		// now store that  value in a;
		a = ut.nextInt(); // Because it is an integer
		System.out.println("The value entered by the user is: " + a);
	}

}
