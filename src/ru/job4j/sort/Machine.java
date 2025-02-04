package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;

        for (int i = 0; i < coins.length; i++) {
            while (money - price >= coins[i]) {
                money -= coins[i];
                result[size] = coins[i];
                size++;
                }
            }
        return Arrays.copyOf(result, size);
    }
}
