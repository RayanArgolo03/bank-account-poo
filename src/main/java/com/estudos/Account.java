package com.estudos;

import java.util.Random;

public class Account {

    private String clientName;
    private String accountNumber;
    protected double balance;
    
    //Construtor
    public Account() {
    }

    //Cálculo Privado
    private boolean calculate(double withdrawValue) {
        if (withdrawValue < this.balance && withdrawValue > 0) {
            this.balance -= withdrawValue;
            //Saque True
            return true;
        }

        return false;
    }

    
    //Testing
    public void toWithdraw(double value) {
        if (calculate(value)) {
            System.out.println("Saque realizado!! Saldo após o saque: " + this.balance);
        } else {
            System.out.println("Saldo insuficiente para saque!! Seu saldo: " + this.balance);
        }
    }

    //Depositar
    public void deposit(double depositValue) {
        if (depositValue > 0) {
            this.balance += depositValue;
            System.out.println("Depósito realizado!! Saldo após depósito: " +this.balance);
        } else {
            System.out.println("Valor depositado inválido!! Deposite valor válido!!");
        }
    }

   
     //toString
    @Override
    public String toString() {
        return "Bank Account: " +"\n"+
                "Client Name:" +this.clientName+ "\n"+
                "Account Number:" +this.accountNumber+ "\n"+ 
                "Balance: " +this.balance+ "\n";
    }

    //Getters e Setters 
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
