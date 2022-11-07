package com.banahaw;

public class Mobile implements Payment {

    private String number;
    private int pin;

    public Mobile(String number, int pin) {
        this.number = number;
        this.pin = pin;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid using mobile account: " + amount);
    }
}
