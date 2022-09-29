
public class Main {

	public static void main(String[] args) {
		
		
		int[] numbers = { 2, 4, 6, 12, 17, 21 };
		
		int findingNumber = 4;
		
		boolean result = false;
		
		
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] == findingNumber) {
				
				result = true;
				
				
			}
			
		}
		
		if (result) {
			System.out.println(findingNumber + " is here !");
		}else {
			System.out.println(findingNumber + " is not here !");

		}
		
		
		
		
	}

}
