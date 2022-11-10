package com.banahaw.factory;

public class LaptopFactory {

    public static Laptop getSpec(String type, int ram, int ssd, String cpu) {
        Laptop laptop = null;
        if ("min".equalsIgnoreCase(type)) {
            laptop =  new Minimum(ram, ssd, cpu);
            System.out.println("Minimum Specs:");
        } else if ("reco".equalsIgnoreCase(type)) {
            laptop = new Recommended(ram, ssd, cpu);
            System.out.println("Recommended Specs:");
        }
        System.out.println(laptop);
        return laptop;
    }
}
