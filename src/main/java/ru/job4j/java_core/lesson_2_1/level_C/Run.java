package ru.job4j.java_core.lesson_2_1.level_C;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double s = (a + b + c ) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double heightA = 2 * area / a;
        System.out.println(heightA);

    }
}
