package lesson5.prog4;

public class HourlyEmployee extends Employee {
	double wage;
	double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
	}

	@Override
	double getPayment() {
		return wage * hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public String toString() {
		return "(Hourly Wage) " + firstName + "'s salary is: " + getPayment();
	}
}
