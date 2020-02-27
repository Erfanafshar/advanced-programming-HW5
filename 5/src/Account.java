/**
 * The Account class have information of the account like
 * Balance and account number
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public class Account {

    // Fields //

    // The current balance
    private long balance;

    // The account number
    private long accountNumber;

    // Constructor //

    /**
     * Create an account with given account number
     *
     * @param num The account number
     */
    public Account(long num) {
        balance = 0;
        accountNumber = num;
    }

    // Methods //

    /**
     * This method increase the amount of the balance of the account
     *
     * @param amount The increased amount
     */
    public void deposit(long amount) {
        if (amount > 0)
            balance += amount;
        else
            System.err.println("Invalid deposit amount!");
    }

    /**
     * This method decrease the amount of the balance of the account
     *
     * @param amount The decreased amount
     */
    public void withdraw(long amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.err.println("Invalid withdraw amount!");
    }

    /**
     * Get the balance
     *
     * @return The current balance
     */
    public long getBalance() {
        return balance;
    }

    /**
     * Get the Account Number
     *
     * @return The account number
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * This method turns the account class informations to String
     *
     * @return account class informations String
     */
    public String toString() {
        return "Account Number #" + accountNumber
                + "--> balance = " + balance;
    }

    /**
     * This method print the output of the toString method
     */
    public final void print() {
        // Don't override this.
        // Override the toString method.
        System.out.println(toString());
    }

}
