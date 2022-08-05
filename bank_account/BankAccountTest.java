
public class BankAccountTest {
	
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100.01, 100.01);
        BankAccount account2 = new BankAccount(200.00, 200.00);
        System.out.println(BankAccount.totalAccounts);
        System.out.println(BankAccount.totalMoney);

    account1.withdrawMoney(10, "checking");
    account1.depositCheck(1000, "savings");
    account1.displayCheckingBalance();
    account1.displaySavingsBalance();
    account1.checkTotals();


    }
}