package com.bank.bank;

public class CheckingAccount extends Account {

    static final double InterestRate = 15;    
    public CheckingAccount(String accountOwner, String AccountNumber, double balance) {
        super(accountOwner, AccountNumber, balance);
    }
    // create a method to calculate interest
    public double Interest(){
        return (getBalance() * InterestRate) / 100;
    }
    // override the toString method
    // @Override
    // public String toString(){
    //     return "Account Owner: " + getOwner() + "\nAccount Number: " + getAccountNumber() + "\nBalance: " + getBalance() +"\nInterest: " + Interest()+"\n";
    // }
}
