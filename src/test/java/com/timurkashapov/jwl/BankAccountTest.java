package com.timurkashapov.jwl;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Timur Kashapov
 */
public class BankAccountTest {

    @Test
    public void test() {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(50);

        System.out.println(bankAccount.balance);
        assertEquals(bankAccount.balance, 50);

        bankAccount.withdraw(30);

        System.out.println(bankAccount.balance);
        assertEquals(bankAccount.balance, 20);
    }

}
