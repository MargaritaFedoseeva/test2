package com.company;

import sun.nio.cs.UTF_32;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Present {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
//        String id;
        double totalWeight = 0;
        double totalCost = 0;
//        int weight = 0;
        String line;
//        Scanner scanner;
        List<Sweet> present = new ArrayList<>();

        try {
//            BufferedReader reader = new BufferedReader (new InputStreamReader(new FileInputStream("C:\\project-testing\\Sweets.txt"), StandardCharsets.UTF_8));
            BufferedReader reader = new BufferedReader(new FileReader("C:\\project-testing\\Sweets.txt"));
            while ((line = reader.readLine()) != null) {
                String[] strM = line.split(",");
                //Iterator iterator = present.listIterator();
                //if (iterator.hasNext()) {
                    /*for (Sweet sweet : present) {
                        if (sweet.getTitle().contains(strM[0])) {
                            sweet.setWeight(Double.valueOf(strM[2]));
                        }
                        else   present.add(new Sweet(strM[0], Double.valueOf(strM[1]), Double.valueOf(strM[2])));
                    }*/

                //} else
                    present.add(new Sweet(strM[0], Double.valueOf(strM[1]), Double.valueOf(strM[2])));
        }
        } catch (IOException e) {
            e.printStackTrace();
        }


//        List<Sweet> present = new ArrayList<>();
//        do{
//            System.out.print("Введите номер конфеты: ");
//            id = scanner.next();
//            switch (id){
//                case "1":
//                    System.out.print("Шоколадные, вес: ");
//                    weight = getWeight(scanner, weight);
//                    present.add(new Chocolates("Шоколадные",250, weight));
//                    break;
//                case"2":
//                    System.out.print("Жевательные, вес: ");
//                    weight = getWeight(scanner, weight);
//                    present.add(new Jellybean("Жевательные",360, weight));
//                    break;
//                case "3":
//                    System.out.print("Леденцы, вес: ");
//                    weight = getWeight(scanner, weight);
//                    present.add(new Lollipop("Леденцы",300, weight));
//                    break;
//                case "stop":
//                    System.out.println("Наполнение подарка завершено.");
//                    break;
//                default:
//                    System.out.println("Такого значения нету");
//                    break;
//            }
//
//        }while (!id.contains("stop"));

        System.out.println("Информация по позициям");
        for (Sweet sweet : present) {
            totalWeight += sweet.getWeight();
            totalCost += sweet.priceGram();
            System.out.printf("%s: %.2f руб. - стоимость за %.2f г, %.2f руб. цена за кг \n", sweet.getTitle(), sweet.getPriseGram(), sweet.getWeight(), sweet.getPrice());
        }
        System.out.println("Общий вес:" + totalWeight);
        System.out.println("Общая цена:" + totalCost);
//        scanner.close();
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
