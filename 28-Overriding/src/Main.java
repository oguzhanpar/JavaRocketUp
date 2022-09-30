
public class Main {

	public static void main(String[] args) {

		BaseLoanManager[] loanManagers = new BaseLoanManager[] { new MortgageLoanManager(),
				new SmallBusinessLoanManager(), new StudentLoanManager() };

		for (BaseLoanManager baseLoanManager : loanManagers) {

			System.out.println(baseLoanManager.calculateLoan(1000));

		}

	}

}
