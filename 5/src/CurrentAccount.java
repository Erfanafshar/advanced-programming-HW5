/**
 * The CurrentAccount class extends from Account class
 * And have some personal fields and methods too
 * *
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public class CurrentAccount extends Account {

    // Field //

    // The over draft limit of the account
    private long overDraftLimit;

    // Constructor //

    /**
     * Create CurrentAccount object with given account number and over draft limit
     *
     * @param num          The account number
     * @param overDraftLim The over draft limit of the account
     */
    public CurrentAccount(long num, int overDraftLim) {
        super(num);
        overDraftLimit = overDraftLim;
    }

    // Methods //

    /**
     * Get the OverDraftLimit of the account
     *
     * @return The over draft limit of the account
     */
    public long getOverDraftLimit() {
        return overDraftLimit;
    }

    /**
     * This method turns the currentaccount class informations to String
     *
     * @return currentaccount class informations String
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
