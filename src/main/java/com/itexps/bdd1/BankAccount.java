/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.bdd1;

/**
 *
 * @author Owner
 */
public class BankAccount {
    private int id;
    private BankCustomer cust;
    private String type;
    private double balance;

    public BankAccount(int id, BankCustomer cust, String type, double balance) {
        this.id = id;
        this.cust = cust;
        this.type = type;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BankCustomer getCust() {
        return cust;
    }

    public void setCust(BankCustomer cust) {
        this.cust = cust;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public boolean transferMoney(double amount, BankAccount acc){
        if(amount>this.getBalance()){
            return false;
        }
        this.balance-=amount;
        acc.setBalance(acc.getBalance()+amount);
        return true;
    }
    
    
}
