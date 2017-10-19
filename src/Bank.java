import java.util.ArrayList;

/**
 * A bank contains customer with bank accounts
 * @author Nyamdorj on 09/22/17
 */

public class Bank {

/**
 * Declaring variables
 */
	String name;
	private ArrayList<Customer> customers;
	
/**
 *  Construct a bank with no customers
 */	
	Bank() {
	    customers = new ArrayList<Customer> ();
	}
	
/**
 *  Adds a customer to the bank.
 *  @param cus the customer to add
 */

	public void addCustomer(Customer cus) {
		customers.add(cus);
	}
	
/**
 *  Find a customer in the bank.
 *  @param currentNumber a customer number
 *  @return the matching customer, or null if no customer matches
 */
	public Customer getCustomer(int currentNumber) {
		for(int i = 0; i < customers.size(); i++) {
			if(customers.get(i).getCustomerNumber()==currentNumber) {
				return customers.get(i);
			}
		}
		
		return null;
	}
	
/**
 *  Gets the name of this bank.
 *  @return name of bank
 */
	public String getName() {
		return name;
	}
	
/**
 *  Set the name of this bank.
 *  @param name define name of this bank
 */
	public void setName(String name) {
		this.name = name;
	}
}
