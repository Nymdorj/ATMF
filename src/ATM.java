
/**
 * An ATM that accesses a bank.
 * @author Nyamdorj on 09/22/17
 */

public class ATM {

/**
 * Declaring variables
 */
	Bank bank;
	int state;
	Customer currentCustomer;
	Account currentAccount;

/**
 * Construct an ATM for a given bank
 * @param bank the bank to which this ATM
 * @param state define state of ATM
 * @param currentCustomer define current Customer of Bank
 * @param currentAccount define current Account of Customer
 */
	ATM(Bank bank, int state, Customer currentCustomer, Account currentAccount){
		this.bank = bank;
		this.state = state;
		this.currentCustomer = currentCustomer;
		this.currentAccount = currentAccount;
	}
	
/**
 *  Withdraws amount from current account.
 *  @param withdraw the amount to withdraw
 *  @param oldBalance the amount to old balance
 */

	public void withdraw(double withdraw, double oldBalance) {
		currentAccount.withdraw(withdraw, oldBalance);
	}

/**
 *  Gets the bank of this ATM.
 *  @return the bank
 */
	public Bank getBank() {
		return bank;
	}

/**
 *  Set the bank of this ATM.
 *  @param bank the bank to which this ATM
 */
	public void setBank(Bank bank) {
		this.bank = bank;
	}

/**
 *  Gets the current state of this ATM.
 *  @return the current state
 */
	public int getState() {
		return state;
	}

/**
 *  Set the state of this ATM.
 *  @param state define state of this ATM
 */
	public void setState(int state) {
		this.state = state;
	}

/**
 *  Gets the current customer of this ATM.
 *  @return the current customer
 */
	public Customer getCurrentCustomer() {
		return currentCustomer;
	}

/**
 *  Set the current customer of this ATM.
 *  @param currentCustomer define current Customer of Bank
 */
	public void setCurrentCustomer(Customer currentCustomer) {
		this.currentCustomer = currentCustomer;
	}

/**
 *  Gets the current account of this ATM.
 *  @return the current account
 */
	public Account getCurrentAccount() {
		return currentAccount;
	}

/**
 *  Set the current account of this ATM.
 *  @param currentAccount define current Account of Customer
 */
	public void setCurrentAccount(Account currentAccount) {
		this.currentAccount = currentAccount;
	}
}
