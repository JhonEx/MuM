package lesson5.prog4;

public class CommissionEmployee extends Employee {
	double grossSales;
	double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	double getPayment() {
		return grossSales * commissionRate;
	}

	public String toString() {
		return "(Commission) " + firstName + "'s salary is: " + getPayment();
	}
}
