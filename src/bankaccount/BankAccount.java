package bankaccount;

/**
 * create a class named BankAccount , add three state account holder name ,  account number ,
 * balance.Create a method called depositAmount that takes parameter double amount and
 * add it to balance create a method withdraw and deduct it from balance
 * there should be method to see the account details with current balance
 * switch cases with options for user like create account , withdraw , deposit ,
 * show details will be better
 */

public class BankAccount {
    String customerName;
    int accountNumber;
    String accountType1 = "Checking";
    String accountType2 = "Saving";
    int balance;
    int previousTransaction;

    public void BankAccount(String cName, int aNumber, String aType1, String aType2) {
        customerName = cName;
        accountNumber = aNumber;
        accountType1 = aType1;
        accountType2 = aType2;
    }

    public void depositAmount(int amount) {
        if (amount >= 0) {
            balance += amount;
        }else {
            balance = balance;
        }
            previousTransaction = amount;

    }

    public void withDraw(int amount2) {
        if (amount2 <= balance) {
            balance -= amount2;
            previousTransaction = -amount2;
        }else {
            System.out.println("Insufficient funds.");
        }

        }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited amount is: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn amount is: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction is performed.");
        }

    }

}

