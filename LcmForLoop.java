
public class LcmForLoop {
	
	public static void main(String[] args) {
		// to print lcm using the for loop
		// formula for LCM is given values / hcf i.e highest common factor
		int a = 198;
		int g=a;
		int b = 18;
		int x=b;
		int hcf = 0;
		
		// we will execute the for loop for saving the time complexity
		if(a > b) {
			for(int i=1; i < a; i++) {
				// the loop will continue until a 
				// the condition is so much important for hcf and lcm
				if(a%i ==0 && b%i==0) {
					// when the number  is found the both number is divided by that number
					hcf = i;
				}
			}
			int lcf =0;
			lcf = (g*x)/hcf;
			System.out.println("HCF - "+hcf);
			System.out.println("LCM -"+ lcf);
		}
		else {
			for(int j = 1; j < b; j++) {
				// here we take the b as it is smaller
				if(b%j == 0 && a%j == 0) {
					hcf = j;
				}
			}
			int lcff = 0;
			lcff = (g*x)/hcf;
			System.out.println("Hcf: "+hcf);
			System.out.println("Lcm: "+lcff);
		}
		
	}

}
