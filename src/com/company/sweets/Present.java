package com.company.sweets;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

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
                String name = strM[0].replaceAll(String.valueOf('\uFEFF'), "");
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

        List<Sweet> comulat = new ArrayList<>();
//
//        present.stream().forEach(sweet -> {
//            if (comulat.stream().noneMatch(c -> c.getTitle().equals(sweet.getTitle()))) {
//                comulat.add(new Sweet(sweet.getTitle(), 0, 0));
//            }
//        });
//
//        present.stream().forEach(sweet -> {
//            comulat.stream().filter(f -> f.getTitle().equals(sweet.getTitle()))
//                    .forEach(s -> s.setWeight(s.getWeight() + sweet.getWeight()));
//        });
//
//
//        comulat.stream().forEach(sweet ->
//                System.out.printf("%s: %.2f руб. - стоимость за %.2f г, %.2f руб. цена за кг \n", sweet.getTitle(), sweet.getPriseGram(), sweet.getWeight(), sweet.getPrice()));


        System.out.println("Информация по позициям");
        present.stream().collect(Collectors.groupingBy(s -> (s.getTitle()))).entrySet().stream().forEach(e -> {
            double v = e.getValue().stream().mapToDouble(Sweet::getWeight).sum();
            double p=e.getValue().stream().mapToDouble(Sweet::getPrice).findFirst().getAsDouble();
            comulat.add(new Sweet(e.getKey(), p, v));
        });
        comulat.stream()
                .sorted((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()))
//              .filter(sweet -> sweet.getTitle().contains("Шоколад"))
                .forEach(sweet -> {
                    totalWeight.set(sweet.getWeight() + totalWeight.get());
                    totalCost.set(sweet.priceGram() + totalCost.get());
                    System.out.printf("%s: %.2f руб. - стоимость за %.2f г, %.2f руб. цена за кг \n", sweet.getTitle(), sweet.getPriseGram(), sweet.getWeight(), sweet.getPrice());
                });
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
