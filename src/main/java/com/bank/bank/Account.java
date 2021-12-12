package com.bank.bank;

public class Account{
    // private instance variables Account Owner,Balance,Account number
    private String AccountOwner;
    private double balance;
    private String AccountNumber;
    // create a constructor
    public Account(String AccountOwner, String AccountNumber, double balance){
        this.AccountOwner = AccountOwner;
        this.balance = balance;
        this.AccountNumber = AccountNumber;
    }
        // getters for all instances variables
    public String getOwner(){
        return AccountOwner;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return AccountNumber;
    }
}
