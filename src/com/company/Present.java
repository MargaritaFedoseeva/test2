package com.company;

import java.util.Scanner;

public class Present {
    public static void main(String[] args) {
        System.out.println("Введите вес конфет в граммах.");
        Scanner scanner = new Scanner(System.in);
        Sweet sweet = new Sweet();
        int weight = 0;
        Sweet[] present = {new Chocolates("Шоколадные", 250, weight), new Jellybean("Жевательные", 360, weight), new Lollipop("Леденцы", 300, weight)};
        for (int i = 0; i < present.length; i++) {
            System.out.print(present[i].getTitle() + ":");
            try {
                weight = scanner.nextInt();
            } catch (Exception e) {
                System.out.print("Возникло иключение" + e);
            }

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
