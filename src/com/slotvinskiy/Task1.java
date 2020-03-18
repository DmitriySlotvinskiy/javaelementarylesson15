package com.slotvinskiy;

//1.) Создать список случайных чисел. Используя Stream Api подсчитать среднее арифиметическое квадратов этих чисел.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Task1 {

    public static final int BOUND = 50;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        initList(list);
        System.out.println(list);
        double average = list.stream()
                .map(x -> x * x)
                .flatMapToInt(x -> IntStream.of(x))
                .average()
                .getAsDouble();
        System.out.println("Average is " + average);
    }

    private static void initList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(BOUND));
        }
    }
}
