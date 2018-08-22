package tiendat.thinkpad.account;

import java.util.Date;

public class Account {
    //    ưu id cho mỗi account
    private int id;

    //    lưu số dư tài khoản
    private double balance;

    //    lưu tỉ lệ lãi xuất hằng năm hiện tại
    private double annualInterestRate;

    //    lưu ngày tạo tài khoản
    private Date dateCreated;

    //    tạo một tài khoản mặc định
    public Account() {
    }

    //    tạo một tài khoản với id và số dư cho trước.
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    //    trả về tỉ lệ lãi xuất gửi theo tháng
    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12 / 100;
    }

    //    trả về lãi xuất hàng tháng
    public double getMonthlyInterest() {
        return this.balance * getMonthlyInterestRate();
    }

    //    rút một khoản tiền từ tài khoản
    public double withdraw(int amountOfMoney) {
        return this.balance - amountOfMoney;
    }

    //    gửi vào một khoản tiền
    public double deposit(int amountOfMoney) {
        return this.balance + amountOfMoney;
    }
}
