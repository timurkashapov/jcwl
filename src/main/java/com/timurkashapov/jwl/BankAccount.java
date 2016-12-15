package com.timurkashapov.jwl;

/**
 * @author Timur Kashapov
 */
public class BankAccount {

    public int balance = 0;

    public void deposit(int i) {
        balance += i;
    }

    public void withdraw(int i) {
        balance -= i;
    }
}
