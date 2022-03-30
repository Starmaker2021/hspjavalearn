package com.weileanan.oopExercise01.Exercise04;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;

    }
}
