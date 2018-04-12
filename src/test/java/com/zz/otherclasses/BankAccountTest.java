package com.zz.otherclasses;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public final class BankAccountTest {
    @Test
    public void ShouldAllowCustomersToDepositMooonies() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(20);
        bankAccount.depositMoonies(30);
        MatcherAssert.assertThat(bankAccount.getBalance(), Is.is(50));
    }

    @Test
    public void ShouldAllowCustomersToTakeMooniesOut() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(30);
        bankAccount.withdrawMoonies(10);
        MatcherAssert.assertThat(bankAccount.getBalance(), Is.is(20));
    }

    @Test (expected = IllegalArgumentException.class)
    public void ShouldNotAllowCustomersToTakeMooniesTheyDontHave() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(20);
        bankAccount.withdrawMoonies(30);
    }
}
