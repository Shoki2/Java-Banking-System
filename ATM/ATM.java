package ATM;
import java.util.HashMap;
import Transactions.Transactions;
import java.util.Scanner;
import Security.Pins;;
public class ATM {
	static void login() {
		try {
		System.out.println("Welcome to Grace Bank -Where money makes sense");
		System.out.println("===============================================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last two digits of your bank card");
		System.out.println("===============================================");
		Integer d = sc.nextInt();
		System.out.println("Enter your Pin");
		System.out.println("===============================================");
		Integer P = sc.nextInt();
		Pins p = new Pins();
		p.retrivePin(P,d);//Function that checks if the bank card number matches the pin set to it.
		}
		catch(Exception e ) {
			System.out.println("Invalid - Pin");
			System.out.println("Try Again");
			
		}
		
	}

	public static void selectAccount() {
		System.out.println("Which account would you like to access ?");
		System.out.println("1.Savings Account");
		System.out.println("2.Fixed-Savings Account");
		System.out.println("===============================================");
		Scanner sc = new Scanner(System.in);
		int selection =sc.nextInt();
		switch(selection) {
		case 1:
			displaySavings();
			break;
		case 2 :
			displayfixedSavings();
			break;
		default :
			System.out.println("Invalid option");
		}
		
	}

	static void displaySavings() {
		System.out.println("What would you like to do ?");
		System.out.println("===============================================");
		String array[] = {  "1.Check Balance", "2.Deposit" , "3.WithDraw Cash","4.Exit" };
		for(String str : array) {
			System.out.println(str.toString());
		}
		Scanner sc = new Scanner(System.in);
		int option =sc.nextInt();
		switch(option) {
		case 1:
			Transactions.balanceSavings();
			returnMenue();
			break;
		case 2:
			Transactions.depositSavings();
			returnMenue();
			break;
		case 3:
			Transactions.withdrawSavings();
			returnMenue();
			break;
			
		case 4:
			System.out.println("THANK YOU FOR USING GRACE BANK :)");
			break;
		}
	}
	
	static void displayfixedSavings() {
		System.out.println("What would you like to do ?");
		System.out.println("===============================================");
		String array[] = {  "1.Check Balance", "2.Deposit" , "3.WithDraw Cash","4.Exit" };
		for(String str : array) {
			System.out.println(str.toString());
		}
		Scanner sc = new Scanner(System.in);
		int option =sc.nextInt();
		switch(option) {
		case 1:
			Transactions.balanceSavings();
			returnMenue();
			break;
		case 2:
			Transactions.depositFixedSavings();
			returnMenue();
			break;
		case 3:
			Transactions.withdrawfixedSavings();
			returnMenue();
			break;
			
		case 4:
			System.out.println("THANK YOU FOR USING GRACE :)");
			break;
		}
		
	}
	
	public static void returnMenue() {
		System.out.println("Would you like to do another transaction ?");
		System.out.println("===============================================");
		System.out.println("1.Yes                           2.No");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		switch(opt) {
		case 1:
			selectAccount();
			break;
		case 2:
		System.out.println("THANK YOU FOR CHOOSING GRACE BANK :)"
				+ "MONEY MAKES SENSE");
		}
	}
   
	public static void main(String[] args) {
		
       
	}

}
