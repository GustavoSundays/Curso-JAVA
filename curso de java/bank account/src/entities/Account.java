package entities;

public class Account {
	
	public int accountNumber;
	public String accountName;
	public double accountBalance;
	
	public Account(String accountName, double accountBalance) {
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public double depositAccountBalance(double accountBalance) {
		
		return this.accountBalance += accountBalance;
	}
	
	public double withdrawAccountBalance(double accountBalance) {
		
		return this.accountBalance -= (accountBalance) + 5;
	}
	
	
}
