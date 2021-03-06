package com.company.sweets;

public class Sweet {
    private double price;
    private String title;
    private double weight;
    private double priseGram;


    public Sweet(String title, double price, double weight) {
        this();
        this.title = title;
        this.price = price;
        this.weight = weight;
    }

    public Sweet() {
        this.price = 0;
        this.title = "";
        this.weight = 0;
        this.priseGram = 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPriseGram() {
        return priseGram;
    }

    public void setPriseGram(double priseGram) {
        this.priseGram = priseGram;
    }

    public double priceGram() {
        priseGram = weight / 1000 * price;
        setPriseGram(priseGram);
        return priseGram;
    }
}
