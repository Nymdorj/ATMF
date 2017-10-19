
/**
 * A account has a balance that can be changed by deposits and withdraws
 * @author Nyamdorj on 09/22/17
 */	

public class Account {
	
/**
 * Declaring variables
 */
	double balance;
	int accountNumber;
	

/**
 *  Construct a bank account with a given balance.
 *  @param balance the account balance of this account
 *  @param accountNumber the account number for this account
 */	
	Account(double balance, int accountNumber){
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
/**
 *  Deposits money into account
 *  @param deposit the amount to deposit
 *  @param oldBalance the amount to old balance
 *  @return the new balance
 */
	public double deposit(double deposit, double oldBalance) {
		double newBalance = deposit + oldBalance;
		
		return newBalance;
	}
	
/**
 *  Withdraws money from the account.
 *  @param withdraw the amount to withdraw
 *  @param oldBalance the amount to old balance
 *  @return the new balance
 */
	public double withdraw(double withdraw, double oldBalance) {
		double newBalance = oldBalance - withdraw;
		
		return newBalance;
	}
	
/**
 *  Gets the balance of this account.
 *  @return balance
 */
	public double getBalance() {
		return balance;
	}
	
/**
 *  Set the balance of this account.
 *  @param balance define balance of this account
 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
/**
 *  Gets the account number of this account.
 *  @return account number
 */
	public int getAccountNumber() {
		return accountNumber;
	}
	
/**
 *  Set the account number of this account.
 *  @param accountNumber define account number of this account
 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
