package com.weileanan.encap;

public class Account {
    public String name;
    private double balance;
    private String password;

    public Account(String name,double balance,String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }


    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        if (name.length() > 2 && name.length() < 6) {
            this.name = name;
        } else {
            System.out.println("名字长度需在2到6之间");
        }

    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("账户余额需大于20");
        }
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        }
        else{
            System.out.println("密码需为六位");
        }
    }
}