
public class Main {

	public static void main(String[] args) {

//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DatabaseLogger(), new ConsoleLogger(), new EmailLogger(), new PhoneLogger()};
//		
//		for (BaseLogger logger : loggers) {
//			
//			logger.log("Log mesajı...");
//			
//		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
			
	}

}
