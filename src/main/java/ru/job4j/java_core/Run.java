package ru.job4j.java_core;

public class Run {
    private DayOfWeek dayOfWeek;

    public DayOfWeek TimeOfYear(int month) {
            if (month == 1 || month == 2 || month == 3) {
                dayOfWeek = DayOfWeek.Winter;
            }
            if (month == 4 || month == 5 || month == 6) {
                dayOfWeek = DayOfWeek.Autumn;
            }
            if (month == 7 || month == 8 || month == 9) {
                dayOfWeek = DayOfWeek.Summer;
            }
            if (month == 10 || month == 11 || month == 12) {
                dayOfWeek = DayOfWeek.Spring;
        }
        return dayOfWeek;
    }

    public static void main(String[] args) {
        Container container = new Container();
        Container container1 = new Container();
        container1.setObject("А тут где то");
        System.out.println("Объект равен: " + container.getObject());
        container.setObject("Что-то");
        System.out.println("Объект равен: " + container.getObject() + " Объект 2 = " + container1.getObject());
        container.setObject(123);
        System.out.println("Объект равен: " + container.getObject());
    }
}
