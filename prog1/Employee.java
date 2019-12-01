package Lab1_oop.prog1;

import java.time.LocalDate;

public class Employee {

	private Account savingAcc;
	private Account checkingAcc;
	private Account retirementAcc;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public String getFormattedAccountInfo() {
		String result = "ACCOUNT INFO FOR " + this.getName()+":" +"\n\n";
		result += savingAcc.toString();
		result += checkingAcc.toString();
		result += retirementAcc.toString()+ "\n\n";
		return result;
	}

	public void deposite(AccountType type, double amount) {
		switch (type) {
		case CHECKING:
			checkingAcc.makeDeposite(amount);
			break;
		case SAVING:
			savingAcc.makeDeposite(amount);
			break;
		case RETIREMENT:
			retirementAcc.makeDeposite(amount);
			break;
		default:
			break;
		}
	}

	public boolean withdraw(AccountType type, double amount) {
		switch (type) {
		case CHECKING:
			checkingAcc.makeWithdrawal(amount);
			break;
		case SAVING:
			savingAcc.makeWithdrawal(amount);
			break;
		case RETIREMENT:
			retirementAcc.makeWithdrawal(amount);
			break;
		default:
			break;
		}
		return false;
	}

	public void createNewSavings(double startingBalance) {
		savingAcc = new Account(startingBalance, this, AccountType.SAVING);
	}

	public void createNewRetirement(double startingBalance) {
		retirementAcc = new Account(startingBalance, this, AccountType.RETIREMENT);
	}
	public void createNewChecking(double startingBalance) {
		checkingAcc = new Account(startingBalance, this, AccountType.CHECKING);
	}
}
