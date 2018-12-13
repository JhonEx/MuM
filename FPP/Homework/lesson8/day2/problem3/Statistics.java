package lesson8.day2.problem3;

import java.util.*;

public class Statistics {
	/**
	 * Polymorphically computes and returns the sum of all the salaries of all the
	 * staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double sumSalary = 0.0;
		for (EmployeeData employee : aList) {
			sumSalary += employee.getSalary();
		}
		return sumSalary;
	}
}
