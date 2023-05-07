package com.estudos;

import java.util.Random;

public class EspecialAccount extends Account  {

    private double limit;

    //Constructor
    public EspecialAccount() {
    }

    //randomNumbers
    public int randomNumber() {
        Random random = new Random();
        int min = 100;
        int max = 1000;
        int randomNumber = random.nextInt(max - min) + min;

        return randomNumber;
    }

    //Calculate
    private boolean calculate(double valueWithdraw) {
        
        if (super.balance <= 0 && valueWithdraw > 0 && valueWithdraw < this.limit) {
            this.limit -= valueWithdraw;
            return true;
        }
        
        return false;
    }

    //Withdraw Especial Account
    @Override
    public void toWithdraw(double valueWithdraw) {
        if (calculate(valueWithdraw)) {
            System.out.println("Você sacou " + valueWithdraw + " do seu limite!!");
            System.out.println("Limite atual: " + this.limit);
        } else {
            System.out.println("Valor de saque de limite insuficiente!!");
        }
    }

    @Override
    public String toString() {
        return "Type - Especial Account"
                + super.toString()
                + "Day Performance: " + this.limit + "\n";

    }

    //Getters e Setters
    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

}
