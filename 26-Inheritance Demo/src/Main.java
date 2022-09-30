
public class Main {

	public static void main(String[] args) {
		
		LoanUI loanUI = new LoanUI();
		loanUI.calculate(new AggricultureLoanManager());
		loanUI.calculate(new PublicLoanManager());
		loanUI.calculate(new CooperativeLoanManager());
	}

}
