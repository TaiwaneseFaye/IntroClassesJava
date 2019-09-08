package introToClasses;

public class Account {
	private static int nextAvailableAcctNumber = 1000;
	private String accountName;
	private double accountBalance;
	private int accountNumber;
	
	Account(String acctName, double initAmt){
		setAccountName(acctName);
		setAccountBalance(initAmt);
		accountNumber = nextAvailableAcctNumber++;
		
	}
	
	public String getAccountName() {
		return accountName;
	}
	private void  setAccountName(String nm) {
		accountName = nm;
	}
	private void setAccountBalance(double bal) {
		accountBalance = bal;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double makeDeposit(double dep) {
		accountBalance += dep;
		return accountBalance;
	}
	public void processCheck(double amount) {
		if (amount > accountBalance) {//insufficient funds error
			accountBalance -= 30.0;
		}else {
			accountBalance-=amount;
		}
	}
	public String processWithdrawl(double amount) {
		String s;
		if (amount < accountBalance) {
			accountBalance -= amount;
			s="New Balance = $" + accountBalance;
		}
		else {
			s="Account balance " + accountBalance + " insufficient for withdrawl of $" + amount;
		}
		return s;
	}
	
	public String toString() {
		String s = "Account Number: " + accountNumber + " Account Name: " + accountName + " Account Balance $ " + accountBalance;
		return s;
	}
	

}
