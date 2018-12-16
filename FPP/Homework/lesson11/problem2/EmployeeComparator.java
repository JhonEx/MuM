package lesson11.problem2;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSsn().compareTo(e2.getSsn());
	}
}
