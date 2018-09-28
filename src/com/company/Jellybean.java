package com.company;


public class Jellybean extends Sweet {
    private final int IDJELLYBEAN;

    public Jellybean(String title, double price,double weight) {
        super(title, price,weight);
        this.IDJELLYBEAN = 2;
    }

    public int getIdJellybean() {
        return IDJELLYBEAN;
    }
}
