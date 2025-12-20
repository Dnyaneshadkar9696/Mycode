
public class SwapNum {
	
	public static void main(String[] args) {
		// Swapping the numbers with and without using third variable
		// 1st lets see with using third variable
		
		int a = 3;
		int b = 7;
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("Swapping the values with using the third variable.");
		System.out.println("value of a is: "+ a);
		System.out.println("value of b is: "+ b);
		
		// now we have to swap without using third variable
		// we can do so using Arithmetic operations
		System.out.println(" ");
		System.out.println("Swapping the values without using the third variable.");
		 int t = 34;
		 int g = 83;
		 
		 t = t + g; // now the value of t is 117
		 g = t - g; // now the value of g is 34
		 t = t - g; // now the value of t is 83
		 System.out.println("value of t is: " + t);
		 System.out.println("Value of g is: " + g);
		 
		 // we successfully swapped the values without using the third variable.
		

		
		
	}

}
