package prog1;

// Program 1

public class Prog1 {

	public static void main(String[] args) {
		Customer[] customers = new Customer[3];
		customers[0] = new Customer("Susi", "Pho", "99XXXX");
		Address address = new Address("Burlington Ave", "Fairfield", "Iowa", "52556");
		customers[0].setBillingAddress(address);
		customers[0].setShippingAddress(address);
		
		customers[1] = new Customer("Wengu", "Li", "98XXXX");
		address = new Address("W Adams St", "Chicago", "Illinois", "60603");
		customers[1].setBillingAddress(address);
		customers[1].setShippingAddress(address);
		
		customers[2] = new Customer("Rock", "Ford", "97XXXX");
		address = new Address("1401 Sacramento", "Chicago", "Illinois", "60623");
		customers[2].setBillingAddress(address);
		customers[2].setShippingAddress(address);
		
		for (Customer customer: customers) {
			String city = customer.getBillingAddress().getCity();
			if (city.equals("Chicago")) {
				System.out.println(customer);
			}
		}
	}
}

// result
// [Wengu, Li, ssn: 98XXXX]
// [Rock, Ford, ssn: 97XXXX]
