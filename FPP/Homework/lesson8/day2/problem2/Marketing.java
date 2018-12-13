package lesson8.day2.problem2;

import java.util.Objects;

public class Marketing {
	private String employeename;
	private String productname;
	private double salesamount;

	public Marketing(String employeename, String productname, double salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	public String toString() {
		return "[" + employeename + ", " + productname + ", " + salesamount + "]";
	}

	public boolean equals(Object object) {
		if (object == null)
			return false;
		if (!(object instanceof Marketing))
			return false;
		Marketing other = (Marketing) object;
		return other.getEmployeeName().equals(employeename)
				&& other.getProductName().equals(productname)
				&& other.getSalesAmount() == salesamount;
	}

	public Object hasCode() {
		return Objects.hash(employeename, productname, salesamount);
	}

	public double getSalesAmount() {
		return salesamount;
	}

	public String getEmployeeName() {
		return employeename;
	}

	public String getProductName() {
		return productname;
	}
}
