package tiendat.thinkpad.account;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccountTest {
    @Test
    public void testWithdrawAccount() {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        double expect = 17500;
        double actual = account.withdraw(2500);
        assertEquals(expect, actual);
    }

    @Test
    public void testDepositAccount() {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        double expect = 23000;
        double actual = account.deposit(3000);
        assertEquals(expect, actual);
    }

    @Test
    public void testDisplayBalanceOfAccount() {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        double expect = 20000;
        double actual = account.getBalance();
        assertEquals(expect, actual);
    }

    @Test
    public void testDisplayMonthlyInterestOfAccount() {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        double expect = 75;
        double actual = account.getMonthlyInterest();
        assertEquals(expect, actual);
    }
}
