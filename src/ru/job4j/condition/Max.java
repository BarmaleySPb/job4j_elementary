package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(fourth, max(first, max(second, third)));
    }

    public static void main(String[] args) {
        System.out.print(Max.max(4, 2));
    }
}
