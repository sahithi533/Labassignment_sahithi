
public class SavingsAccount extends Account {

	public SavingsAccount(long accountNum, double initialBalance,Person name) {
		super(accountNum, initialBalance, name);
		accNum=accountNum;
		balance=initialBalance;
		accHolder=name;
	}
	private static final double minimumBalance=500;
	/**
	 * method to check minimum balance and withdrawing amount
	 */
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		if(minimumBalance!=0) {
			if(balance>amount) {
				double newAmount=balance-amount;
				balance=newAmount;
			}
		}
	}
}