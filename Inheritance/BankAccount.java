package Inheritance;

class Bank{
	long accNO = 2326986768456l;
	int balance = 5000;
	public void cus01() {
		
		System.out.println("Account No - "+ accNO);
		System.out.println("Balance : "+ balance);
	}
}

class SavingsAcount extends Bank
{
	public void interestCal() {
		double interest = 0;
		
		interest = ( balance )* 3.5/100;
		System.out.println("Money with Interest : "+interest);
	}
}



public class BankAccount {
	
	public static void main(String[] args)
	{
		SavingsAcount ht = new SavingsAcount();
		ht.cus01();
		ht.interestCal();
	}

}
