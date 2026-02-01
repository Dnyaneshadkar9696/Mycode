package volopay;

import java.util.Scanner;
import java.util.Stack;

public class FirstNonReapetingCharacter {

	public void repeatCharfound() {

		// aabbcde
		// output is c
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// simple logic relate with the count

		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			int count = 0;

			// the value at index i is stored in current

			for (int j = 0; j < str.length(); j++) {

				if (current == str.charAt(j)) {
					count++;
				}

			}
			
			if (count == 1) {
				System.out.println(current);
				break;
			} 

		}

		

	}

}
