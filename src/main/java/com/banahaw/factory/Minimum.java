package com.banahaw.factory;

public class Minimum extends Laptop {

    private int ram;
    private int ssd;
    private String cpu;

    public Minimum(int ram, int ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    @Override
    public int getRAM() {
        return this.ram;
    }

    @Override
    public int getSSD() {
        return this.ssd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
