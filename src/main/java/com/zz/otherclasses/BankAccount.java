package com.zz.otherclasses;

public final class BankAccount {
    int accountnumber;
    int balance;
    String customername;
    String customeremail;
    String customerphonenumber;

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void depositMoonies(int moonies) {
        balance += moonies;
    }

    public void withdrawMoonies(int drawMoonies) {
        if(drawMoonies> balance)
            throw new IllegalArgumentException("Your current balance is "+balance +" less than "+drawMoonies);
        else
            balance -= drawMoonies;
    }
}
