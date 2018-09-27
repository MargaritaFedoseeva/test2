package com.company;

import java.util.Scanner;

public class Present {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес конфет в граммах.");

        System.out.print("Шоколадные:");
        Chocolates chocolates = new Chocolates();
        int weight = scanner.nextInt();
        chocolates.setWeight(weight);
        chocolates.setPriseGram(PriceSweets.priceGram(chocolates.getPrice(), weight));

        System.out.print("Жевательные:");
        Jellybean jellybean = new Jellybean();
        weight = scanner.nextInt();
        jellybean.setWeight(weight);
        jellybean.setPriseGram(PriceSweets.priceGram(jellybean.getPrice(), weight));

        System.out.print("Леденцы:");
        Lollipop lollipop = new Lollipop();
        weight = scanner.nextInt();
        lollipop.setWeight(weight);
        lollipop.setPriseGram(PriceSweets.priceGram(lollipop.getPrice(), weight));

        PriceSweets.totalWeightAndCost();

        System.out.println("Информация по позициям");
        dataOutput(chocolates, jellybean, lollipop);


        System.out.print("Хотите убрать или добавить сладости из подарка? (yes/no)");
        String delete = scanner.next();
        if (delete.equals("yes")) {
            System.out.print("Шоколадные:");
            weight = scanner.nextInt();
            chocolates.setWeight(weight);
            chocolates.setPriseGram(PriceSweets.priceGram(chocolates.getPrice(), weight));

            System.out.print("Жевательные:");
            weight = scanner.nextInt();
            jellybean.setWeight(weight);
            jellybean.setPriseGram(PriceSweets.priceGram(jellybean.getPrice(), weight));

            System.out.print("Леденцы:");
            weight = scanner.nextInt();
            lollipop.setWeight(weight);
            lollipop.setPriseGram(PriceSweets.priceGram(lollipop.getPrice(), weight));

            PriceSweets.totalWeightAndCost();

            System.out.println("Информация по позициям");
            dataOutput(chocolates, jellybean, lollipop);


        }
        scanner.close();
    }

    private static void dataOutput(Chocolates chocolates, Jellybean jellybean, Lollipop lollipop) {
        System.out.println(chocolates.getName() + ": " + chocolates.getPriseGram() + " руб. - стоимость за " + chocolates.getWeight() + " г, " + chocolates.getPrice() + " руб. цена за кг");
        System.out.println(jellybean.getName() + ": " + jellybean.getPriseGram() + " руб. - стоимость за " + jellybean.getWeight() + " г, " + jellybean.getPrice() + " руб. цена за кг");
        System.out.println(lollipop.getName() + ": " + lollipop.getPriseGram() + " руб. - стоимость за " + lollipop.getWeight() + " г, " + lollipop.getPrice() + " руб. цена за кг");
    }

}
