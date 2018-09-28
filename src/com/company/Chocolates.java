package com.company;

public class Chocolates extends Sweet {
    private final int idChocolates;

    public Chocolates(String title, double price,double weight) {
        super(title, price,weight);
        this.idChocolates = 0001;
    }

    public Chocolates(double weight) {
        super(weight);
        this.idChocolates = 0001;
    }

    public int getIdChocolates() {
        return idChocolates;
    }
}