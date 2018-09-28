package com.company;

public class Chocolates extends Sweet {
    private final int IDCHOCOLATES;

    public Chocolates(String title, double price,double weight) {
        super(title, price,weight);
        this.IDCHOCOLATES = 1;
    }

    public int getIdChocolates() {
        return IDCHOCOLATES;
    }
}