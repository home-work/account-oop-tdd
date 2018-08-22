package tiendat.thinkpad.account;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Test
    public void testDisplayDateCreatedOfAccount() {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date expect = null;
        try {
            expect = simpleDateFormat.parse("2018-08-20 12:49:39");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        account.setDateCreated("2018-08-20 12:49:39");
        Date actual = account.getDateCreated();
        assertEquals(expect, actual);
    }
}
