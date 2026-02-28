import java.util.Scanner;

public class Account {

    double balance = 500;

	private int pinExisting = 2323;

	private long mobileNumber = 8080727572l;

	Account() {

		System.out.println("Welcome to KATARI BANK");
	}

	// The method will be called from the Bank
	Scanner sn = new Scanner(System.in);

	public void createAccount() {

		System.out.print("Enter Name : ");
		String name = sn.nextLine();

		System.out.print("Enter Pan No: ");
		String panNum = sn.nextLine();

//		sn.nextLine();

		System.out.print("Enter Addhar No: ");
		long adharNum = sn.nextLong();

		System.out.println();
		System.out.println("****Account created Successfully****");
		System.out.print("Account Details : ");
		System.out.println("Name : " + name);
		System.out.println("Pan Number : " + panNum);
		System.out.println("Addhar Number : " + adharNum);

	}

	public void depositeMoney() {
		System.out.print("Enter the amount to Deposite : ");
		double deposit = sn.nextDouble();
		System.out.println("Amount " + deposit + " deposited successfully");
		this.balance = balance + deposit;

	}

	public void withdrawMoney() {

		System.out.print("Enter the Pin Number to Continue : ");
		int userPin = sn.nextInt();

		if (pinExisting == userPin) {

			System.out.print("Enter the amount to Withdraw : ");
			double withdraw = sn.nextDouble();
			if (this.balance < withdraw) {
				System.out.println("Insufficient Balance..");
			} else {
				System.out.print("Amount " + withdraw + " withdrawn successfully");
				this.balance = balance - withdraw;
			}

		} else {
			System.out.println("Incorrect Pin Entered...");
			System.out.println("Try Again or Change Pin..");
		}

	}

	public void checkBalance() {

		this.balance = balance;
		System.out.println("Balance : " + balance);

	}

	public long pinChange() {
		System.out.print("Enter Mobile number: ");
		long mobNum = sn.nextLong();

		if (this.mobileNumber == mobNum) {
			System.out.print("Enter New Pin number: ");
			int pinNew = sn.nextInt();
			this.pinExisting = pinNew;
			System.out.println("New Pin Number is set Successfully.");
		} else {
			System.out.println("Incorrect Mobile Number Entered.. Try Again!");
		}
		return mobNum;

	}

}
