package volopay;

import java.util.Scanner;
import java.util.Stack;
// we import the stack;

public class CheckBalanceParanthesis {

	// programm to check the braces match or not
	// using scanner class take the input from the user

	public void practise() {

		Scanner sc = new Scanner(System.in);
		String sf = sc.nextLine();

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < sf.length(); i++) {

			// first we have to store the value of 0th index int the string

			char ch = sf.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				// we push into the stack

				// we access through reference variable
				st.push(ch);

			} else {

				// here are two cases we are getting one is stack is empty and one is closing
				// bracket we have to check using pop method

				if (st.isEmpty()) {
					System.out.println("Not Balanced");
					return;
				}

				char top = st.pop();
				// we are taking one one element out of the stack as the top
				// update hokar ch value will be ) this and at that point we check if top is not
				if ((ch == ')' && top != '(') || 
				    (ch == '}' && top != '{') || 
				    (ch == ']' && top != '[')) {
					System.out.println(" Not Balaced");
					return;
				}

			}

		}

		// lastly we have to print the result

		if (st.isEmpty()) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balaced");
		}

		// last condition for empty of single element

	}
}
