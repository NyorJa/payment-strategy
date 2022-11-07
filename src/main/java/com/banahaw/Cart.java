package com.banahaw;

public class Cart {

    private double amount;

    public Cart(double amount) {
        this.amount = amount;
//        System.out.println("Paid using online account: " + amount);
    }

    public void pay(Payment mode) {
        mode.pay(amount);
    }
}
