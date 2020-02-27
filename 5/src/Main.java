/**
 * The Main class for creating objects and continue the program
 * *
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public class Main {

    // Method //

    public static void main(String[] args) {

        // Crete a Bank object
        Bank bank = new Bank();

        // Create five SavingsAccount objects
        SavingsAccount savingsAccount1 = new SavingsAccount(1001, 10);
        SavingsAccount savingsAccount2 = new SavingsAccount(1002, 20);
        SavingsAccount savingsAccount3 = new SavingsAccount(1003, 30);
        SavingsAccount savingsAccount4 = new SavingsAccount(1004, 40);
        SavingsAccount savingsAccount5 = new SavingsAccount(1005, 50);

        // Create five CurrentAccount objects
        CurrentAccount currentAccount1 = new CurrentAccount(2001, 10);
        CurrentAccount currentAccount2 = new CurrentAccount(2002, 20);
        CurrentAccount currentAccount3 = new CurrentAccount(2003, 30);
        CurrentAccount currentAccount4 = new CurrentAccount(2004, 40);
        CurrentAccount currentAccount5 = new CurrentAccount(2005, 50);

        // Add SavingsAccount objects to the bank
        bank.addAccount(savingsAccount1);
        bank.addAccount(savingsAccount2);
        bank.addAccount(savingsAccount3);
        bank.addAccount(savingsAccount4);
        bank.addAccount(savingsAccount5);

        // Add CurrentAccount objects to the bank
        bank.addAccount(currentAccount1);
        bank.addAccount(currentAccount2);
        bank.addAccount(currentAccount3);
        bank.addAccount(currentAccount4);
        bank.addAccount(currentAccount5);

        // Deposite and withdraw the amount of the balance of some of the accounts
        savingsAccount1.deposit(10);
        savingsAccount2.deposit(20);
        savingsAccount3.deposit(30);
        savingsAccount4.deposit(10);
        savingsAccount5.deposit(10);
        savingsAccount1.withdraw(20);
        savingsAccount1.deposit(300);

        currentAccount1.deposit(40);
        currentAccount2.deposit(50);
        currentAccount3.deposit(30);
        currentAccount4.deposit(60);
        currentAccount5.deposit(20);
        currentAccount1.withdraw(30);
        currentAccount1.deposit(10);

        // Update the account of the bank
        bank.update();

        // Print the information of some accounts
        savingsAccount1.print();
        savingsAccount2.print();
    }

}
