package com.estudos;

import java.util.Calendar;
import java.util.Random;

public class SavingsAccount extends Account {

    private int performanceDay;

    //Construtor
    public SavingsAccount() {
    }

    
    //randomNumbers
    public int randomNumber() {
        Random random = new Random();
        int min = 1;
        int max = 31;
        int randomNumber = random.nextInt(max - min) + min;

        return randomNumber;
    }

    //Cálculo Privado
    private boolean calculate(double performanceRate) {
        Calendar calendar = Calendar.getInstance();
        int today = calendar.get(Calendar.DAY_OF_MONTH);

        if (today == performanceDay) {
            this.balance += this.balance * performanceRate;
            return true;
        }

        return false;

    }

    //Testing
    public void calculateNewBalance(double performanceRate) {
        if (calculate(performanceRate)) {
            System.out.println("Hoje é o dia do rendimento!! Seu dinheiro rendeu " + performanceRate + "% !!");
            System.out.println("Saldo após rendimento: " + this.balance);
        } else {
            System.out.println("Hoje não é dia de rendimento!!");
        }
    }

    @Override
    public String toString() {
        return "Type - Savings Account"
                + super.toString()
                + "Day Performance: " + this.performanceDay + "\n";
    }

    //Getters e Setters
    public int getPerformanceDay() {
        return performanceDay;
    }

    public void setPerformanceDay(int performanceDay) {
        this.performanceDay = performanceDay;
    }
}
