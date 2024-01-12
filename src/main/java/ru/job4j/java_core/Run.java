package ru.job4j.java_core;

public class Run {
    public static void main(String[] args) {
        String ln = System.lineSeparator();
        int i = 1;
        long l = 100;
        float f = 140.14f;
        double d = 1231.4D;
        byte b = 7;
        String s = "St";
        char c = 'c';
        boolean rsl = false;
        var v = (byte) 127;
        byte varByte = 16;
        short varShort = varByte;
        final int month = 9;
        System.out.println("varByte = " + varByte + ln + "varShort = " + varShort + ln + "Месяц: " + month);
    }
}
