package com.banahaw.strategy;

/**
 * Hello world!
 */
public class TestStrategy {
    public static void main(String[] args) {
        Cart cart = new Cart(1512.75);
        // to show that payment has polymorphic behaviour
        Payment online = new Online("mark.reyes@gmail.com", "Wasd8456!");
        cart.pay(online);

        Payment mobile = new Mobile("1234", 123456);
        cart = new Cart(375.25);
        cart.pay(mobile);
    }
}
