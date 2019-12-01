package Lab1_oop.prog1;

public class Account {
	private double balance;
	private AccountType accountType;
	private Employee employee;

	public Account(Employee employee, AccountType accountType) {
		this.employee = employee;
		this.accountType = accountType;
	}

	public Account(double balance, Employee employee, AccountType accountType) {
		this.balance = balance;
		this.employee = employee;
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void makeDeposite(double amount) {
		balance = balance + amount;
	}

	public boolean makeWithdrawal(double amount) {
		if (amount > balance) {
			return false;
		} else
			return true;
	}
	public String toString() {
		String result= "Account type: " +accountType + "\n" +"Current bal: "+ balance +"\n" ;
		
		return result;
	}
}
