import java.util.ArrayList;

/**
 * A bank customer with a checking and a savings account.
 * @author Nyamdorj on 09/22/17
 */
public class Customer {

/**
 * Declaring variables	
 */
	String name;
	int customerNumber;
	int pin;
	private ArrayList<Account> accounts;

/**
 *  Construct a customer with no accounts
 */
	Customer(){
		accounts = new ArrayList<Account> ();
	}

/**
 *  Construct a customer with a given accounts, PIN, customer number, and name.
 *  @param customerNumber the customer number
 *  @param pin the personal identification number
 *  @param name the customer name
 *  @param accounts the customer account
 */
	Customer(String name, int customerNumber, int pin, ArrayList<Account> accounts) {
		this.name = name;
		this.customerNumber = customerNumber;
		this.pin = pin;
		this.accounts = accounts;
	}
	
/**
 *  Find a account of current customer.
 *  @param currentAccount a account number of customer
 *  @return the matching account, or null if no account matches
 */
	public Account getAccount(int currentAccount) {
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNumber() == currentAccount) {
				return accounts.get(i);
			}
		}
		
		return null;
	}
	
/**
 *  Gets the name of this customer.
 *  @return name
 */	
	public String getName() {
		return name;
	}
	
/**
 *  Set the name of this customer.
 *  @param name define name of this customer
 */
	public void setName(String name) {
		this.name = name;
	}

/**
 *  Gets the customer number of this customer.
 *  @return customer number
 */
	public int getCustomerNumber() {
		return customerNumber;
	}

/**
 *  Set the customer number of this customer.
 *  @param customerNumber define customer number of this customer
 */
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

/**
 *  Gets the pin of this customer.
 *  @return pin
 */
	public int getPin() {
		return pin;
	}

/**
 *  Set the pin of this customer.
 *  @param pin define pin of this customer
 */
	public void setPin(int pin) {
		this.pin = pin;
	}

/**
 *  Gets the accounts of this customer.
 *  @return array of accounts
 */
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

/**
 *  Set the array of accounts of this customer.
 *  @param accounts define array of accounts of this customer
 */
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
}
