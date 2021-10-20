package oop.encapack;

public class BankFunctions {

    BankAccount[] bankAccounts = new BankAccount[5];

    public void createBankAccount(String accountHolderName,
                                  String emailAddress,
                                  String mobileNumber,
                                  double initialBalance) {
        BankAccount newAccount = new BankAccount();
        newAccount.setAccountHolderName(accountHolderName);
        newAccount.setEmail(emailAddress);
        newAccount.setMobileNumber(mobileNumber);
        newAccount.setBalance(initialBalance);
        newAccount.setOverDraftAmount(1000);

        int newIndex = getAvailableIndexOfBankAccount();
        if (newIndex != 100) {
            bankAccounts[newIndex] = newAccount;
            System.out.println("=====================================");
            System.out.println("Bank account is created successfully.");
            System.out.println("=====================================");
        } else {
            System.out.println("Bank account creating limit is exceeded. ");
        }
    }

    public void displayAccountDetails() {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount != null) {
                System.out.println("--------------------------");
                System.out.println("Account Holder Name: " + bankAccount.getAccountHolderName());
                System.out.println("Account Holder Email: " + bankAccount.getEmail());
                System.out.println("Account Holder Mobile Number: " + bankAccount.getMobileNumber());
                System.out.println("Account Holder Current Balance: " + bankAccount.getBalance());
                System.out.println("--------------------------");
            }
        }
    }

    public int getAvailableIndexOfBankAccount() {
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i] == null) {
                return i;
            }
        }
        return 100;
    }

    public double depositAmount(double depositAmount,
                                String mobileNumber,
                                String email) {
        int currentBankIndex = findBankAccountIndex(mobileNumber, email);
        if (currentBankIndex == 100) {
            System.out.println("Bank account didn't found.");
            return 0;
        } else {
            bankAccounts[currentBankIndex].setBalance
                    (bankAccounts[currentBankIndex].getBalance() + depositAmount);
            return bankAccounts[currentBankIndex].getBalance();

        }


    }

    public double withDrawAmount(double withDrawAmount,
                                 String mobileNumber,
                                 String email) {
        int currentBankIndex = findBankAccountIndex(mobileNumber, email);
        if (currentBankIndex == 100) {
            System.out.println("Bank account didn't found.");
            return 0;
        } else {
            bankAccounts[currentBankIndex].setBalance
                    (bankAccounts[currentBankIndex].getBalance() - withDrawAmount);
            return bankAccounts[currentBankIndex].getBalance();

        }
    }

    public int findBankAccountIndex(String mobileNumber, String email) {
        int currentBankIndex = 100;
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i] != null) {
                if (bankAccounts[i].getMobileNumber().equals(mobileNumber) &&
                        bankAccounts[i].getEmail().equals(email)) {
                    currentBankIndex = i;
                    break;
                }
            }
        }
        return currentBankIndex;
    }
}
