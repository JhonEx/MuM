package lesson8.day2.problem2;

import java.util.Comparator;

public class SalesAmountComparator implements Comparator<Marketing>{

	@Override
	public int compare(Marketing marketing, Marketing otherMarketing) {
        if (Double.compare(marketing.getSalesAmount(), otherMarketing.getSalesAmount()) != 0) {
            return Double.compare(marketing.getSalesAmount(), otherMarketing.getSalesAmount());
        }

        if (marketing.getEmployeeName().compareTo(otherMarketing.getEmployeeName()) != 0) {
            return marketing.getEmployeeName().compareTo(otherMarketing.getEmployeeName());
        }

        return marketing.getProductName().compareTo(otherMarketing.getProductName());
	}
}
