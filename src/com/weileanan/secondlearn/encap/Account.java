package com.weileanan.secondlearn.encap;

public class Account {
    public String name;
    private int account;
    private String password;

    public Account(String name, int account, String password) {
        this.name = name;
        this.account = account;
        this.password = password;
        setAccount(account);
        setName(name);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        } else {
            System.out.println("Rewrite the name!");
        }
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        if (account > 20) {
            this.account = account;
        } else {
            System.out.println("Rewrite the password");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("Rewrite the password");
        }
    }

    public void printinfo() {
        System.out.println(this.name + this.account + this.password);
    }

}
