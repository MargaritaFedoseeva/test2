package com.company;


public class Lollipop extends Sweet{
    private final int IDLOLLIPOP;

    public Lollipop(String title, double price,double weight) {
        super(title, price,weight);
        this.IDLOLLIPOP = 3;
    }

    public int getIdLollipop() {
        return IDLOLLIPOP;
    }
}
