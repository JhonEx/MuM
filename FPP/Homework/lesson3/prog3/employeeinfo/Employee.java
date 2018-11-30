package prog3.employeeinfo;

import java.time.LocalDate;

//	Program 3

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		StringBuilder acctInfo = new StringBuilder();
		acctInfo.append("ACCOUNT INFO FOR " + name + "\n\n");
		if (checkingAcct != null)
			acctInfo.append(checkingAcct.toString());
		if (savingsAcct != null)
			acctInfo.append(savingsAcct.toString());
		if (retirementAcct != null)
			acctInfo.append(retirementAcct.toString());
		return acctInfo.toString();
	}
	
	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public void deposit(AccountType acctType, double amt) {
		switch (acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		default:
			return;
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		boolean result = false;
		
		switch (acctType) {
		case CHECKING:
			if (amt <= checkingAcct.getBalance()) {
				checkingAcct.makeWithdrawal(amt);
				result = true;
			}
			break;
		case SAVINGS:
			if (amt <= savingsAcct.getBalance()) {
				savingsAcct.makeWithdrawal(amt);
				result = true;
			}
			break;
		case RETIREMENT:
			if (amt <= retirementAcct.getBalance()) {
				retirementAcct.makeWithdrawal(amt);
				result = true;
			}
			break;
		default:
			result = false;
			break;
		}
		return result;
	}
}
