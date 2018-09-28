package com.company;

import java.util.Scanner;

public class Present {
    public static void main(String[] args) {
        System.out.println("Введите вес конфет в граммах.");
        Scanner scanner = new Scanner(System.in);
        Sweet sweet = new Sweet();
        System.out.print("Шоколадные:");
        int weight = scanner.nextInt();
        Chocolates chocolates = new Chocolates("Шоколад",365,weight);
        chocolates.priceGram();


        System.out.print("Жевательные:");
        weight = scanner.nextInt();
        Jellybean jellybean = new Jellybean("Жевательные",225,weight);
        jellybean.priceGram();

        System.out.print("Леденцы:");
        weight = scanner.nextInt();
        Lollipop lollipop = new Lollipop("Леденцы",150,weight);
        lollipop.priceGram();

        sweet.totalWeightAndCost();

        System.out.println("Информация по позициям");
        dataOutput(chocolates, jellybean, lollipop);


        System.out.print("Хотите убрать или добавить сладости из подарка? (yes/no)");
        String delete = scanner.next();
        if (delete.equals("yes")) {

            System.out.print("Шоколадные:");
            weight = scanner.nextInt();

            chocolates.priceGram();


            System.out.print("Жевательные:");
            weight = scanner.nextInt();

            jellybean.priceGram();

            System.out.print("Леденцы:");
            weight = scanner.nextInt();

            lollipop.priceGram();

            sweet.totalWeightAndCost();

            System.out.println("Информация по позициям");
            dataOutput(chocolates, jellybean, lollipop);

        }
        scanner.close();

    }

    private static void dataOutput(Chocolates chocolates, Jellybean jellybean, Lollipop lollipop) {
        System.out.printf("%s(%d) : %.2f руб. - стоимость за %.2f г, %.2f руб. цена за кг \n",chocolates.getTitle(),chocolates.getIdChocolates(),chocolates.getPriseGram(),chocolates.getWeight(),chocolates.getPrice());
        System.out.printf("%s(%d) : %.2f руб. - стоимость за %.2f г, %.2f руб. цена за кг \n",jellybean.getTitle(),jellybean.getIdJellybean(),jellybean.getPriseGram(),jellybean.getWeight(),jellybean.getPrice());
        System.out.printf("%s(%d) : %.2f руб. - стоимость за %.2f г, %.2f руб. цена за кг \n",lollipop.getTitle(),lollipop.getIdLollipop(),lollipop.getPriseGram(),lollipop.getWeight(),lollipop.getPrice());
    }
}
