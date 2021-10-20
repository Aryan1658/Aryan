package oop.encapack;

import java.util.Locale;

public class BankAccount {
    private String accountHolderName;
    private String mobileNumber;
    private String email;

    private double balance;

    private double overDraftAmount;

    public BankAccount() {


    }

    public BankAccount(String accountHolderName,
                       String mobileNumber,
                       String email,
                       double balance,
                        double overDraftAmount) {
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.balance = balance;
        this.overDraftAmount = overDraftAmount;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName.toUpperCase(Locale.ROOT);
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        if (mobileNumber.length() == 10)
            this.mobileNumber = mobileNumber;
        else {
            this.mobileNumber = "XXX-XXX-0000";
            System.out.println("Invalid mobile number");

        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverDraftAmount() {
        return overDraftAmount;
    }

    public void setOverDraftAmount(double overDraftAmount) {
        if (overDraftAmount < 1000) {
            this.overDraftAmount = 1000;
        } else {
            this.overDraftAmount = overDraftAmount;
        }

    }
}
