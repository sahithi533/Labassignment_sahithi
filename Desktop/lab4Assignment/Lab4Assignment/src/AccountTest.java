public class AccountTest {
	public static void main(String[] args) {
		Person person1=new Person("Smith",24);
		Person person2=new Person("Kathy",25);
		Account account1=new Account(System.currentTimeMillis(), 2000, person1);
		SavingsAccount account2=new SavingsAccount(System.currentTimeMillis(), 3000, person2);
		CurrentAccount account3=new CurrentAccount(System.currentTimeMillis(), 3000, person2);
		/**
		 * initial balance
		 */
		System.out.println("Initial balance in Smith Account is: "+account1.getBalance());
		/**
		 * depositing 2000 in smith's account
		 */
		account1.deposit(2000);
		System.out.println("Balance in Smith Account after deposition is: "+account1.getBalance());
		/**
		 * withdrawing 2000 from kathy's account
		 */
		account2.withdraw(2000);
		System.out.println("Balance in Kathy Savings Account after withdrawal is: "+account2.getBalance());
		account3.withdraw(2000);
	}
}