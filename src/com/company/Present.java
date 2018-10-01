package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Present {
    public static void main(String[] args) {
        System.out.println("Введите вес конфет в граммах.");
        Scanner scanner = new Scanner(System.in);
        boolean bError = true;
        Sweet sweet = new Sweet();
        int weight = 0;

        Sweet[] present = {new Chocolates("Шоколадные", 250, weight), new Jellybean("Жевательные", 360, weight), new Lollipop("Леденцы", 300, weight)};
        for (int i = 0; i < present.length; i++) {
            System.out.print(present[i].getTitle() + ":");
            do {
                try {
                    weight = scanner.nextInt();
                    bError = true;
                } catch (Exception e) {
                    System.out.println("Вы ввели некорректное значение, ошибка: " + e);
                    System.out.print("Введите значение заново: ");
                    scanner.next();
                    bError = false;
                }
            } while (!bError);
            present[i].setWeight(weight);
            present[i].priceGram();
        }
        sweet.totalWeightAndCost();
        System.out.println("Информация по позициям");
        sweet.dataOutput(present);

//        System.out.print("Хотите убрать или добавить сладости из подарка? (yes/no)");
//        String delete = scanner.next();
//        if (delete.contains("yes")) {
//
//        for (int i=0; i< present.length;i++){
//            System.out.print(present[i].getTitle()+":");
//            weight = scanner.nextInt();
//            present[i].setWeight(weight);
//            present[i].priceGram();
//        }
//           sweet.totalWeightAndCost();
//
//            System.out.println("Информация по позициям");
//            sweet.dataOutput(present);
//
//        }
        scanner.close();
    }


}
