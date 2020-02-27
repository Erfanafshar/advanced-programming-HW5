/**
 * The SavingsAccount class extends from Account class
 * And have some personal fields and methods too
 * *
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public class SavingsAccount extends Account {

    // Field //

    // The interest rate of the account
    private long interestRate;

    // Constructor //

    /**
     * Create SavingsAccount object with given account number and interest rate
     *
     * @param num         The account number
     * @param interestRat The interest rate of the account
     */
    public SavingsAccount(long num, int interestRat) {
        super(num);
        interestRate = interestRat;
    }

    // Methods //

    /**
     * This method increase the amount of the balance with given interest rate
     *
     * @param interestRate The interest rate of the account
     */
    public void depositOfProfit(long interestRate) {
        deposit((interestRate * getBalance()) / 100);
    }

    /**
     * This method increase the amount of the balance
     *
     * @param amount The increased amount
     */
    @Override
    public void deposit(long amount) {
        super.deposit(amount);
    }

    /**
     * Get the intererstrate of the account
     *
     * @return The intererstrate of the account
     */
    public long getInterestRate() {
        return interestRate;
    }

}
