package tiendat.thinkpad.account;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccountTest {
    @Test
    public void testWithdrawAccount() {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        double expect = 17500;
        double actual=account.withdraw(2500);
        assertEquals(expect, actual);
    }
}
