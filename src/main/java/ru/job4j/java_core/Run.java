package ru.job4j.java_core;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(Math.sqrt(7));
        Scanner scanner = new Scanner(System.in);
        System.out.println(Math.sqrt(Math.pow(scanner.nextInt(), 2) + Math.pow(scanner.nextInt(), 2)));
    }
}
