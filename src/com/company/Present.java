package com.company;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Present {
    public static void main(String[] args) {
        AtomicReference<Double> totalWeight = new AtomicReference<>((double) 0);
        AtomicReference<Double> totalCost = new AtomicReference<>((double) 0);
        String line;
        List<Sweet> present = new ArrayList<>();
//        Sweet ch = new Chocolates("Шоколад", 450, 100);
//        Field[] fs = ch.getClass().getFields();
//        for (Field f : fs) {
//            if (f.getDeclaredAnnotation(ControlledObject.class).def() == 1) {
//                String name = f.getDeclaredAnnotation(ControlledObject.class).name();
//                Method[] ms = ch.getClass().getDeclaredMethods();
//                for (Method m : ms) {
//                    if (m.getName().equals("set" + name)) {
//                        m.invoke(ch, "color");
//                    }
//                }
//            }
//        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\project-testing\\Sweets.txt"));
            while ((line = reader.readLine()) != null) {
                String[] strM = line.split(",");
               String name=strM[0].replaceAll(String.valueOf('\uFEFF'), "");
                switch (name) {
                    case "Шоколад":
                        present.add(new Chocolates(name, Double.valueOf(strM[1]), Double.valueOf(strM[2])));
                        break;
                    case "Жевательные конфеты":
                        present.add(new Jellybean(name, Double.valueOf(strM[1]), Double.valueOf(strM[2])));
                        break;
                    case "Леденцы":
                        present.add(new Lollipop(name, Double.valueOf(strM[1]), Double.valueOf(strM[2])));
                        break;
                    default:
                        System.out.println("Такого значения нету");
                        break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Информация по позициям");
        present.stream()
//              .filter(sweet -> sweet.getTitle().contains("Шоколад"))
                .forEach(sweet ->{
                    totalWeight.set(sweet.getWeight()+totalWeight.get());
                    totalCost.set(sweet.priceGram()+totalCost.get());
                        System.out.printf("%s: %.2f руб. - стоимость за %.2f г, %.2f руб. цена за кг \n", sweet.getTitle(), sweet.getPriseGram(), sweet.getWeight(), sweet.getPrice());});

        System.out.println("Общий вес:" + totalWeight);
        System.out.println("Общая цена:" + totalCost);

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
