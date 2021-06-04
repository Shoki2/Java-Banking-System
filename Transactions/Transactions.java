package Transactions;

import Account.FixedSavings;


import Account.Savings;
import ATM.ATM;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Transactions implements Savings, FixedSavings {// To implement the behavior in both accounts

	public static void balanceSavings() {
		System.out.println("Account Balance :" + accBalance);// Deduct monthly fee on the 1st of each month

	}

	public static void balanceFixedSavings() {
		FixedSavings.trackMoney();

	}

	public static void depositSavings() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount :");
		long amount = sc.nextLong();
		if (amount >= 10) {
			System.out.println("Confirm deposit :" + amount);
			System.out.println("1.Yes           2.Change Amount                3.Cancel");
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Deposit :" + amount + " " + "into Savings Account --" + Savings.accNumber);
				System.out.println("===============================================");
				break;
			case 2:
				depositSavings();
				break;
			case 3:
				ATM.returnMenue();
				break;
			}
		} else {
			System.out.println("Please change deposit amount");
		}
	}

	public static void depositFixedSavings() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount :");
		long amount = sc.nextLong();
		if (amount >= 100) {
			System.out.print("Confirm deposit :" + amount);
			System.out.print("1.Yes                           2.Cancel");
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.print("Deposit " + amount + "to FixedSavings Account --" + accNumber);
				System.out.println("===============================================");
				break;
			case 2:
				ATM.returnMenue();
				break;
			}
		} else {
			System.out.println("Please change deposit amount");
		}

	}

	public static void withdrawSavings() {
		System.out.println("Enter amount :");
		Scanner sc = new Scanner(System.in);
		long amount = sc.nextLong();
		if (amount < accBalance && amount <= maxDrawal) {
			System.out.println("Confirm Withdrawal :" + amount);
			System.out.println("1.Yes        2.Change Amount          2.Cancel");
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Withdraw "+" "+ amount +"  "+"from Savings Account --" + Savings.accNumber);
				System.out.println("===============================================");
				break;
			case 2:
				ATM.returnMenue();
				break;
			}

		} else {
			System.out.println("Please change  withdrawal amount");

		}
	}

	public static void withdrawfixedSavings() {
		LocalDate today = LocalDate.now();
		if(today.compareTo(FixedSavings.maturityDate) != 0) {//Checking if the investment has matured or not
			System.out.println("Dear Customer :Cash withdrawals on a fixed account "+ '\n' +"should be withdrawn on the day of maturity date or after."+ '\n'+"If you would like to continue with the transaction please visit any local Grace Bank.");
			System.out.println("**************************************************");
		}
		else {
			System.out.println("Enter amount :");
			Scanner sc = new Scanner(System.in);
			long amount = sc.nextLong();
			if (amount < accBalance && amount <= maxDrawal) {
				System.out.print("Confirm withdrawal :" + amount);
				System.out.print("1.Yes                           2.Cancel");
				int opt = sc.nextInt();
				switch (opt) {
				case 1:
					System.out.println("Withdraw " + amount + "from FixedSavings Account --" + Savings.accNumber);
					System.out.println("===============================================");
					break;
				case 2:
					ATM.returnMenue();
					break;
				}

			} else {
				System.out.println("Please change  withdrawal amount");

			}
			
		}
		}
		
	public void displayReciept() {
		System.out.println("=============================================");
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println("Grace Bank - where money makes sense");
		System.out.println("Available Balance :" + accBalance);
		System.out.println("=============================================");

	}

}
