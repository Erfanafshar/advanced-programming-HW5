// Add ArrayList Class

import java.util.ArrayList;

/**
 * The Bank class have information of the accounts
 * *
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public class Bank {

    // Field //

    // An ArrayList of accounts are in Bank
    private ArrayList<Account> accounts;

    // Constructor //

    /**
     * Create a Bank object
     */
    public Bank() {
        accounts = new ArrayList<Account>();
    }

    // Method //

    /**
     * Add account to the Bank
     *
     * @param account The added account
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }

    /**
     * This method update all of the Bank accounts into the next situation
     */
    public void update() {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i) instanceof SavingsAccount) {
                ((SavingsAccount) accounts.get(i)).depositOfProfit(((SavingsAccount) accounts.get(i)).getInterestRate());
            }
            if (accounts.get(i) instanceof CurrentAccount) {
                if (accounts.get(i).getBalance() < ((CurrentAccount) accounts.get(i)).getOverDraftLimit()) {
                    accounts.get(i).print();
                }
            }
        }
    }

}
