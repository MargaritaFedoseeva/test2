package com.company;
@ControlledObject(name="Шоколад")
public class Chocolates extends Sweet {
//    @ControlledObject(name="Шоколад",def=1)
//    public String name;

//    public void setName(String name) {
//        this.name = name;
//    }

    private final int IDCHOCOLATES;

    public Chocolates(String title, double price,double weight) {
        super(title, price,weight);
        this.IDCHOCOLATES = 1;
    }

    public int getIdChocolates() {
        return IDCHOCOLATES;
    }
}