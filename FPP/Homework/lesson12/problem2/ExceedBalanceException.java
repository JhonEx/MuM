package lesson12.problem2;

@SuppressWarnings("serial")
public class ExceedBalanceException extends Exception {
	public ExceedBalanceException() {
		super("You have withdraw over balance.");
	}
	public ExceedBalanceException(String message) {
		super(message);
	}
}
