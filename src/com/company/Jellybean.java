package com.company;


public class Jellybean extends Sweet {
    private final int idJellybean;

    public Jellybean(String title, double price,double weight) {
        super(title, price,weight);
        this.idJellybean = 0002;
    }

    public int getIdJellybean() {
        return idJellybean;
    }
}
