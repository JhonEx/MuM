package lesson12.problem2;

@SuppressWarnings("serial")
public class ReachLimitException extends Exception {
	public ReachLimitException() {
		super("You have reached balance limit.");
	}
	
	public ReachLimitException(String message) {
		super(message);
	}
}
