package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter account name: ");
		sc.next();
		String accountName = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		String isInitialDeposit = sc.next();
		double accountBalance = 0;
		Account account = new Account(accountName, accountBalance);
		
		
		
		if (isInitialDeposit.equalsIgnoreCase("y")) {
			System.out.println("Enter initial deposit value: ");
			accountBalance = sc.nextDouble();
			account.depositAccountBalance(accountBalance);
		}
		
		System.out.println("Account data:");
		System.out.println("Account "+ accountNumber +", Holder: "+ accountName + ", Balance: "+ account.accountBalance);
		
		System.out.println("Enter a deposit value: ");
		accountBalance = sc.nextDouble();
		account.depositAccountBalance(accountBalance);
		
		System.out.println("Account data:");
		System.out.println("Account "+ accountNumber +", Holder: "+ accountName + ", Balance: "+ account.accountBalance);
		
		System.out.println("Enter a withdraw value: ");
		accountBalance = sc.nextDouble();
		account.withdrawAccountBalance(accountBalance);
		
		System.out.println("Account data:");
		System.out.println("Account "+ accountNumber +", Holder: "+ accountName + ", Balance: "+ account.accountBalance);
		sc.close();

	}

}
