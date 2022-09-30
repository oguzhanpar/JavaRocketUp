
public class MortgageLoanManager extends BaseLoanManager {

	// This function overrides baseLoanManager's same name function !
	public double calculateLoan(double amount) {

		return amount * 0.15;

	}
}
