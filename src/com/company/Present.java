package com.company;

import java.util.*;

public class Present {
    public static void main(String[] args) {
        System.out.println("Введите номер конфеты, далее ее вес. Для прекращения ввода конфет нажмите 'stop'");
        System.out.println("Шоколадная(№1), Жевательные(№2), Леденцы(№3)");
        Scanner scanner = new Scanner(System.in);
        String id;
        double totalWeight = 0;
        double totalCost = 0;
        int weight = 0;
        List<Sweet> present = new ArrayList<>();
        do{
            System.out.print("Введите номер конфеты: ");
            id = scanner.next();
            switch (id){
                case "1":
                    System.out.print("Шоколадные, вес: ");
                    weight = getWeight(scanner, weight);
                    present.add(new Chocolates("Шоколадные",250, weight));
                    break;
                case"2":
                    System.out.print("Жевательные, вес: ");
                    weight = getWeight(scanner, weight);
                    present.add(new Jellybean("Жевательные",360, weight));
                    break;
                case "3":
                    System.out.print("Леденцы, вес: ");
                    weight = getWeight(scanner, weight);
                    present.add(new Lollipop("Леденцы",300, weight));
                    break;
                case "stop":
                    System.out.println("Наполнение подарка завершено.");
                    break;
                default:
                    System.out.println("Такого значения нету");
                    break;
            }

        }while (!id.contains("stop"));

        System.out.println("Информация по позициям");
        for(Sweet sweet: present) {
            totalWeight +=sweet.getWeight();
            totalCost+=sweet.priceGram();
            System.out.printf("%s: %.2f руб. - стоимость за %.2f г, %.2f руб. цена за кг \n", sweet.getTitle(), sweet.getPriseGram(), sweet.getWeight(), sweet.getPrice());
        }
        System.out.println("Общий вес:" + totalWeight);
        System.out.println("Общая цена:" + totalCost);

        scanner.close();
    }
    private static int getWeight(Scanner scanner, int weight) {
        boolean bError;
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
        return weight;
    }


}
