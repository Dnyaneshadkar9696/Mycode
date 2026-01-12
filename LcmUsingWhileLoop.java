
public class LcmUsingWhileLoop {
	
	public static void main(String[] args) {
		// to print the lcm using while loop
		int a = 22; 
		int t = a;
		int b = 18;
		int u = b;
		int div = 1;
		int hcf = 0; // highest common factor
		
		// enter only when the values are greater than one
		while(a>=div && b>=div) {
			if(a%div == 0 && b%div == 0) {
				hcf = div;
			}
			div++;
		}
		int lcm = 0;
		lcm = (t*u)/hcf;
		System.out.println("The HCF is: "+hcf);
		System.out.println("The LCM is: "+ lcm);
	}

}
