
public class PerfectNumCheck {
	
	public static void main(String[] args) {
		
		// to check weather the number is Perfect or not 
		// means 6 the factors of 6 is 1 2 and 3 so addition of those is 6 
		// and factors of 6 is 1 2 3 
		
		int a = 496; 
		int b = a;
		int total = 0;
		for(int i=1; i < a; i++) {
			if(a%i == 0) {
				total = total + i;
			}
		}
		if(total == b) {
			System.out.println("The number is perfect");
		}
		else {
			System.out.println("The number is not perfect");
		}
		
	}

}
