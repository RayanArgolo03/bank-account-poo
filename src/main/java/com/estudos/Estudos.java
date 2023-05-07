package com.estudos;

import java.util.Scanner;

public class Estudos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Testing first class - Normal Account
        Account account = new Account();
        account.setAccountNumber("123");
        account.setClientName("Jorge");

        account.deposit(1000);
        account.toWithdraw(1500);
        account.toString();

        //Testing second class - Savings Account
        SavingsAccount savingsAccount = new SavingsAccount();
        account.setAccountNumber("321");
        account.setClientName("Marie");

        savingsAccount.setPerformanceDay(savingsAccount.randomNumber());
        savingsAccount.deposit(1000);
        savingsAccount.calculateNewBalance(2.1d);
        savingsAccount.toString();

        //Testing third class - Especial Account
        EspecialAccount especialAccount = new EspecialAccount();
        especialAccount.
        especialAccount.setLimit(especialAccount.randomNumber());
    }
}
