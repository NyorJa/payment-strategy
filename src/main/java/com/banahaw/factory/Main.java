package com.banahaw.factory;

public class Main {
    public static void main(String[] args) {
        Laptop min = LaptopFactory.getSpec("min", 8, 256, "i5-12450Hz");
        Laptop reco = LaptopFactory.getSpec("reco", 16, 512, "i7-12700Hz");

        // for checking only if min is instantiated by factory as minimum
        if (min instanceof Minimum) {
            System.out.println("its minimum!!");
        }
    }
}
