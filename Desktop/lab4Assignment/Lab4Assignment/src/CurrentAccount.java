
public class CurrentAccount extends Account {

	
	public CurrentAccount(long accountNum, double initialBalance,Person name) {
		super(accountNum, initialBalance,name);
	}
	double overdraftLimit=1000;
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		boolean result=limitReachedOrNot(amount);
		System.out.println(result);	
	}	
	public boolean limitReachedOrNot(double money) {
		if(money<=overdraftLimit) {
			return false;                             
		}
		else{
			return true;
		}
	}
}
