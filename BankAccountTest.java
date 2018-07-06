public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();
        BankAccount acc4 = new BankAccount();

		System.out.println("acc1 Number:" + acc1.getAccountNumber());
		acc1.deposit(100, "checking");
		acc1.deposit(500, "savings");
		acc2.deposit(300, "savings");
		acc1.withdraw(50, "checking");
		System.out.println();
		acc1.withdraw(300, "savings");
		System.out.println("Number of accounts: " + BankAccount.numberOfAccounts);

	}
}
