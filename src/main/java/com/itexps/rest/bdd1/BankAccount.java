/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.rest.bdd1;

/**
 *
 * @author 212616565
 */
public class BankAccount {
    private String id;
    private String name;
    private String type;
    private double balance;
    public BankAccount(String id, String name, String type,  double balance){
        this.id=id;
        this.name=name;
        this.type=type;
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void withdraw(double money){
        this.balance-=money;
    }
    public void deposit(double money){
        this.balance+=money;
    }
    public void transfer(double money,BankAccount acc){
        this.withdraw(money);
        acc.deposit(money);
    }
    
    
}
