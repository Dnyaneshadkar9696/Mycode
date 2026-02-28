import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// this class will contain the main method and menu for which handles the
		// operation

//		Show options to user
//
//		Take input using Scanner
//
//		Call methods from Account class

		Scanner sd = new Scanner(System.in);

		boolean run = true;

		Account ac = new Account();

		while (run) {
			System.out.println();
			System.out.println("Select one of the option to perform Action : ");
			System.out.println("1. Create Account ");
			System.out.println("2. Deposite Money ");
			System.out.println("3. Withdraw Money ");
			System.out.println("4. Check Balance ");
			System.out.println("5. Change Pin");
			System.out.println("6. Exit ");

			int h = sd.nextInt();

			switch (h) {
			case 1:
				ac.createAccount();
				break;
			case 2:
				ac.depositeMoney();
				break;
			case 3:
				ac.withdrawMoney();
				break;
			case 4:
				ac.checkBalance();
				break;
			case 5:
				ac.pinChange();
				break;
			case 6:
				run = false;
				System.out.println("Thank You for visiting Katari Bank.");
				break;
			default:
				System.out.println("Enter the Accurate Porsitive number.");
				break;
			}

		}

	}

}
