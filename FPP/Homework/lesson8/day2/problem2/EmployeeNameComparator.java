package lesson8.day2.problem2;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Marketing> {

	@Override
	public int compare(Marketing marketing, Marketing otherMarketing) {
        if (marketing.getEmployeeName().compareTo(otherMarketing.getEmployeeName()) != 0) {
            return marketing.getEmployeeName().compareTo(otherMarketing.getEmployeeName());
        }

        if (Double.compare(marketing.getSalesAmount(), otherMarketing.getSalesAmount()) != 0) {
            return Double.compare(marketing.getSalesAmount(), otherMarketing.getSalesAmount());
        }

        return marketing.getProductName().compareTo(otherMarketing.getProductName());
	}
}
