
public class Main {

	public static void main(String[] args) {
		
		// Mini Project: Find A Perfect Number
		
		int number = 28;
		
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			
			if(number % i == 0) {
				
				total = total + i;
				
			}
			
		}
		
		if(number == total) {
			
			System.out.println(number + ": Is A Perfect Number !");
			
		}else {
			
			System.out.println(number + ": Is Not A Perfect Number !");
			
		}

	}

}
