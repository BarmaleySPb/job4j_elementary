package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        if (n == 0) {
            return 1;
        }
        for (int i = n; i >= 1; i--) {
            if (result == 0) {
                result = 1;
            }
            result = result * i;
        }
        return result;
    }
}
