
public class Main {

	public static void main(String[] args) {

		// Mini Project: Find A Prime Number
		int number = -1;

		int remainder = number % 2;

		boolean isPrime = true;

		if (number == 1) {

			System.out.println(number + " Is Not A Prime Number !");

			return; // If number is 1, Stops the method !

		}

		if (number < 1) {

			System.out.println(number + " Is Not Valid Number !");

			return; // If number is 1, Stops the method !

		}

		// System.out.println(remainder);

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				isPrime = false;

			}

		}

		if (isPrime) {

			System.out.println(number + " Is A Prime Number !");

		} else {

			System.out.println(number + " Is Not A Prime Number !");

		}

	}

}
