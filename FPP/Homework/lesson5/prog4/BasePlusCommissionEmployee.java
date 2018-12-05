package lesson5.prog4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
	}

	@Override
	public double getPayment() {
		return baseSalary + (grossSales * commissionRate);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public String toString() {
		return "(Base + Commission) " + firstName + "'s salary is: " + getPayment();
	}
}
