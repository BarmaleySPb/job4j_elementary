package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double debt = 0;

        do {
            if (debt == 0) {
                debt = amount * (1 + (percent / 100));
            }
            debt = (debt - salary) * (1 + (percent / 100));
            year++;
        } while (debt > 0);
        return year;
    }
}
