
public class Main {

	public static void main(String[] args) {

		char grade = 'C';

		switch (grade) {
		case 'A':
			// grade is 'A' here runs.
			System.out.println("High - Well Done ! You passed the exam with " + grade);
			break;
		case 'B':
		case 'C':
			// grade is 'B' or 'C' here runs.
			System.out.println("Medium - Great ! You passed the exam with " + grade);
			break;
		case 'F':
			// grade is 'F' here runs.
			System.out.println("Low - Fail ! You failed the exam with " + grade);
			break;
		default:
			// grade is unknown here runs.
			System.out.println("Error: Please enter a valid grade !");
		}

	}

}
