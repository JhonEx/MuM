package lesson5.prog2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	double overTimeHours;
	
	public Secretary(String name, double salary, LocalDate hireDate) {
		super(name, salary, hireDate);
		
	}
	
	public double getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(double overTimeHours) {
		this.overTimeHours = overTimeHours;
	}

	@Override
	public double computeSalary() {
		return salary + 12 * overTimeHours;
	}
}
