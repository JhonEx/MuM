package lesson5.prog4;

//	Program 4

public class Driver {

	public static void main(String[] args) {
		BasePlusCommissionEmployee basePlusEmp = new BasePlusCommissionEmployee("Andrew", "Leu", "98XXXX");
		CommissionEmployee commissionEmp = new CommissionEmployee("Nene", "Sah", "97XXXX");
		HourlyEmployee hourlyEmp = new HourlyEmployee("Hye", "Myung", "96XXX");
		SalariedEmployee salaryEmp = new SalariedEmployee("Bahu", "Bali", "95XXX");
		HourlyEmployee hourlyEmp1 = new HourlyEmployee("Jeu", "Ze", "94XXX");
		
		basePlusEmp.setBaseSalary(7000);
		basePlusEmp.setCommissionRate(0.10);
		basePlusEmp.setGrossSales(50000);
		
		commissionEmp.setCommissionRate(0.30);
		commissionEmp.setGrossSales(30000);
		
		hourlyEmp.setHours(160);
		hourlyEmp.setWage(60);
		
		salaryEmp.setWeeklySalary(3000);
		
		hourlyEmp1.setHours(160);
		hourlyEmp1.setWage(85);
		
		Employee emps[] = {
				basePlusEmp,
				commissionEmp,
				hourlyEmp,
				salaryEmp,
				hourlyEmp1
		};
		
		double totalSalary = 0.0;
		
		for (Employee emp: emps) {
			System.out.println(emp);
			totalSalary += emp.getPayment();
		}
		System.out.println("\nTotal Salary: " + totalSalary);
	}

}


//	result
//	(Base + Commission) Andrew's salary is: 12000.0
//	(Commission) Nene's salary is: 9000.0
//	(Hourly Wage) Hye's salary is: 9600.0
//	(Salary) Bahu's salary is: 12000.0
//	(Hourly Wage) Jeu's salary is: 13600.0
//	
//	Total Salary: 56200.0
