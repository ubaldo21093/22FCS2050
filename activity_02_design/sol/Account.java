/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 02 - Account
 */

public class Account {

    // A bank account is defined by a number (integer), the name of the owner, and a balance.
    private int number;
    private String owner;
    private double balance;

    // Users should have the ability to create an account by specifying its number and owner. Balance is always initialized to zero.
    public Account(int number, String owner) {
        this.number = number;
        this.owner = owner;
        balance = 0;
    }

    // The class should provide methods to allow deposit (amount informed as parameter)
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        else
            return false; // deposit failed
    }

    // withdraw (amount informed as parameter; balance cannot become negative).
    public boolean withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= 0) {
                balance -= amount;
                return true;
            }
        }
        return false;
    }

    // You should also implement the “toString” method.
    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
