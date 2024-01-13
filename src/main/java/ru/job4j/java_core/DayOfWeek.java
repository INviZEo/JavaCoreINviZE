package ru.job4j.java_core;

public enum DayOfWeek {
    Spring("Осень"),
    Winter("Зима"),
    Summer("Лето"),
    Autumn("Весна");

    private String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DayOfWeek{'" + title + '\'' +
                '}';
    }
}
