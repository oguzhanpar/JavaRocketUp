
public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.email = "dasda@dasda.com";
		employee.salary = 21312;
		
		//-------//
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		customerManager.List();
		employeeManager.bestEmployee();
		
	}

}
