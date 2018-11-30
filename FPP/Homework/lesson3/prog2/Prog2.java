package prog2;

//	Program 2

public class Prog2 {

	public static void main(String[] args) {
		Employee emp = new Employee("David", "Jimmy", 8000, 2017, 4, 20);
		
		Account accounts[] = new Account[3]; 
		
		accounts[0]	= new Account(emp, AccountType.CHECKING, 300);
		accounts[1] = new Account(emp, AccountType.SAVINGS, 300);
		accounts[2] = new Account(emp, AccountType.RETIREMENT, 300);
		
		accounts[0].makeDeposit(100);
		accounts[1].makeDeposit(50);
		accounts[2].makeWithdrawal(200);
		
		for(Account account: accounts) {
			System.out.println(account);
		}
	}
}


//	result
//	type = CHECKING, balance = 400.0
//	type = SAVINGS, balance = 350.0
//	type = RETIREMENT, balance = 100.0
