package lesson12.problem2;

public class CustomerAccount {
	private static final int BALANCE_LIMIT = 100;
	private String cusName;
	private String accNo;
	private double balance;
	
	public CustomerAccount(String cusName, String accNo) {
		this.cusName = cusName;
		this.accNo = accNo;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;	
		}
	}
	
	public void withdraw(double amount) throws ReachLimitException, ExceedBalanceException {
		if (amount > balance) {
			throw new ExceedBalanceException();
		}
		if ((balance - amount) < BALANCE_LIMIT) {
			throw new ReachLimitException();
		}
		
		balance -= amount;
	}
	
	public String getCusName() {
		return cusName;
	}
	
	public String accNo() {
		return accNo;
	}
	
	public double getBalance() {
		return balance;
	}
}
