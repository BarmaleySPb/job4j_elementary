package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        for (int i = 0; i < array.length - 1; i++) {
            int ind = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[ind]) {
                    ind = j;
                }
            }
            int min = array[ind];
            array[ind] = array[i];
            array[i] = min;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
