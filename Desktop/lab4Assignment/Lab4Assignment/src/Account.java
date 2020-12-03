public class Account {
	static long accNum;
	double balance;
	Person accHolder=new Person(Person.name, Person.age);
	
	public Account(long accountNum,double initialBalance,Person name) {
		accNum=accountNum;
		balance=initialBalance;
		accHolder=name;
	}
	/**
	 * 
	 * method to deposit amount
	 */
	public void deposit(double amount) {
		double newBalance=balance+amount;
		balance=newBalance;
	}
	/**
	 * 
	 * method to withdraw amount
	 */
	public void withdraw(double amount) {
		double newBalance=balance-amount;
		balance=newBalance;
	}
	/**
	 * 
	 * get Account holder details
	 */
	public Person getAccHolder() {
		return accHolder;
	}
	/**
	 * 
	 * set Account number details
	 */
	public void setAccNum(long accNum) {
		Account.accNum = accNum;
	}
	/**
	 * 
	 * get account number details
	 */
	public long getAccNum() {
		return accNum;
	}
	/**
	 * set balance
	 * 
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * return balance
	 * 
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * set Account holder details
	 *
	 */
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
}
