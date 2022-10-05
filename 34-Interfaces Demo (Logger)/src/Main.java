
public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new DatabaseLogger()};
			
		Customer customer = new Customer();
		
		customer.setFirstName("Oğuzhan");
		customer.setLastName("Parlak");
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		customerManager.add(customer);

	}

}
