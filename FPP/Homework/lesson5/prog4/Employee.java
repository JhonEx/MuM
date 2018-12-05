package lesson5.prog4;

public abstract class Employee {
	String firstName;
	String lastName;
	String socialSecurityNumber;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	abstract double getPayment();
}
