

public class BankAccount{

    public double checkingBalance = 0.0;
    public double savingsBalance = 0.0;
    public static int totalAccounts = 0;
    public static double totalMoney = 0;
    public BankAccount(double checkingInit, double savingsInit){
        checkingBalance = checkingInit;
        savingsBalance = savingsInit;
        totalAccounts++;
        totalMoney = totalMoney + checkingBalance + savingsBalance;
    }

    public double displayCheckingBalance(){
        System.out.println("Your balance is $" + this.checkingBalance);
        return this.checkingBalance;
    }

    public double displaySavingsBalance(){
        System.out.println("Your balance is $" + this.savingsBalance);
        return this.savingsBalance;
    }

    public double depositCheck(double amount, String type){
        if (type == "checking"){
        this.checkingBalance += amount;
        System.out.println("Added $" + amount + " to your checking balance.");
        // return this.checkingBalance;
        }
        if (type == "savings"){
        this.savingsBalance += amount;
        System.out.println("Added $" + amount + " to your savings balance.");
        // return this.savingsBalance;
        }
        return this.savingsBalance;
    }

    public double withdrawMoney(double amount, String type){
        if (type == "checking"){
            if (this.checkingBalance - amount < 0){
                System.out.println("Insufficient Funds. Your available balance is: $" + this.checkingBalance);
            }
            else {
                this.checkingBalance -= amount;
                System.out.println("Withdrew $" + amount + " from your checking balance.");
                System.out.println("Your new balance is: $" + this.checkingBalance);
                return this.checkingBalance;
            }
        }
        else if (type == "savings"){
            if (this.savingsBalance - amount < 0){
                System.out.println("Insufficient Funds. Your available balance is: $" + this.savingsBalance);
            }
            else {
                this.savingsBalance -= amount;
                System.out.println("Withdrew $" + amount + " from your savings balance.");
                System.out.println("Your new balance is: $" + this.savingsBalance);
                // return this.savingsBalance;
            }
        }
        return this.savingsBalance;
    }

    public double checkTotals(){
        double total = this.checkingBalance + this.savingsBalance;
        System.out.println("Your balance totals are: " + total);
        return total;
    }

    public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance() {
		this.checkingBalance = checkingBalance;
	}
	public double getSavngingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance() {
		this.savingsBalance = savingsBalance;
    }
    
    // public static int getTotalAccounts() {
	// 	return totalAccounts;
	// }
	// public void setTotalAccounts() {
	// 	return totalAccounts;
	// }
	// public static double getTotalMoney() {
	// 	return totalMoney;
	// }
	// public void setTotalMoney() {
	// 	return totalMoney;
	// }




}