package com.company;

public class Sweet {
    private double price;
    private String title;
    private double weight;

    public Sweet(double price, String title, double weight) {
        this();
        this.price = price;
        this.title = title;
        this.weight = weight;
    }

    public Sweet() {
        this.price = 0;
        this.title = "";
        this.weight = 0;
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

    public static double totalCost;
    public static double totalWeight;

    public static double priceGram(double price, double weight) {
        double cost = weight / 1000 * price;
        totalCost += cost;
        totalWeight += weight;
        return cost;
    }

    public static void totalWeightAndCost(){
        System.out.println("Общий вес:" + PriceSweets.totalWeight);
        System.out.println("Общая цена:" + PriceSweets.totalCost);
    }
}
