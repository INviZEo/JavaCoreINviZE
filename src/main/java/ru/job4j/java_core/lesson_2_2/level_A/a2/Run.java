package ru.job4j.java_core.lesson_2_2.level_A.a2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 1) {
            System.out.println("Понедельник");
        } else if (i == 2) {
            System.out.println("Вторник");
        } else if (i == 3) {
            System.out.println("Среда");
        } else if (i == 4) {
            System.out.println("Четверг");
        } else if (i == 5) {
            System.out.println("Пятница");
        } else if (i == 6) {
            System.out.println("Суббота");
        } else if (i == 7) {
            System.out.println("Воскресенье");
        }
    }
}
// "c else if нужно вводить 7 раз цифру 7 чтобы дошла очередь до воскресенья" значит у тебя ошибка в коде. посмотри с помощью дебага что у тебя не так.
// else if и просто if отличаются по своей сути и тому, как они работают. с помощью дебага легко можно понять чем именно.

    /*без else if получается даже лучше, c else if нужно вводить 7 раз цифру 7 чтобы дошла очередь до воскресенья
    и соответственно для других так же */
   /* Scanner scanner = new Scanner(System.in);
        while (true) {
                if (scanner.hasNextInt()) {
                if (scanner.nextInt() == 1) {
                System.out.println("Понедельник");
                }
                if (scanner.nextInt() == 2) {
                System.out.println("Вторник");
                }
                if (scanner.nextInt() == 3) {
                System.out.println("Среда");
                }
                if (scanner.nextInt() == 4) {
                System.out.println("Четверг");
                }
                if (scanner.nextInt() == 5) {
                System.out.println("Пятница");
                }
                if (scanner.nextInt() == 6) {
                System.out.println("Суббота");
                }
                if (scanner.nextInt() == 7) {
                System.out.println("Воскресенье");
                }
                } else {
                if (scanner.nextLine().equals("stop")) {
                break;
                }
*/