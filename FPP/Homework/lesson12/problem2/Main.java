package lesson12.problem2;

public class Main {
	public static void main(String[] args) {
		CustomerAccount account = new CustomerAccount("John", "99-XX-XX");
		
		System.out.println("Account Name: " + account.getCusName());
		account.deposit(500);
		System.out.println("Current balance: " + account.getBalance());
		
		try {
			System.out.println("Attempt to withdraw: 600.0");
			account.withdraw(600.0);	
		} catch (ExceedBalanceException exceedBalanceException) {
			System.out.println(exceedBalanceException.getMessage());
		} catch (ReachLimitException reachLimitException) {
			System.out.println(reachLimitException.getMessage());
		}
		
		try {
			System.out.println("Attempt to withdraw: 450.0");
			account.withdraw(450.0);	
		} catch (ExceedBalanceException exceedBalanceException) {
			System.out.println(exceedBalanceException.getMessage());
		} catch (ReachLimitException reachLimitException) {
			System.out.println(reachLimitException.getMessage());
		}
		
		try {
			System.out.println("Attempt to withdraw: 400.0");
			account.withdraw(400.0);
		} catch (ExceedBalanceException exceedBalanceException) {
			System.out.println(exceedBalanceException.getMessage());
		} catch (ReachLimitException reachLimitException) {
			System.out.println(reachLimitException.getMessage());
		}
		
		System.out.println("Your withdraw is accepted.");
		System.out.println("Current balance: " + account.getBalance());
	}
}

//	result
//	Account Name: John	
//	Current balance: 500.0
//	Attempt to withdraw: 600.0
//	You have withdraw over balance.
//	Attempt to withdraw: 450.0
//	You have reached balance limit.
//	Attempt to withdraw: 400.0
//	Your withdraw is accepted.
//	Current balance: 100.0