package com.company;


public class Lollipop extends Sweet{
    private final int idLollipop;

    public Lollipop(String title, double price,double weight) {
        super(title, price,weight);
        this.idLollipop = 0003;
    }

    public int getIdLollipop() {
        return idLollipop;
    }
}
