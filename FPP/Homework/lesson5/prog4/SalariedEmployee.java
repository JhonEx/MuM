package lesson5.prog4;

public class SalariedEmployee extends Employee {
	double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
	}

	@Override
	double getPayment() {
		return weeklySalary * 4;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	public String toString() {
		return "(Salary) " + firstName + "'s salary is: " + getPayment();
	}
}
