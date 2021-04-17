package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println("10 is positive: " + LogicNot.isPositive(10));
        System.out.println("-11 is positive: " + LogicNot.isPositive(-11));
        System.out.println("15 is not even: " + LogicNot.notEven(15));
        System.out.println("14 is not even: " + LogicNot.notEven(14));
        System.out.println("4 is even: " + LogicNot.isEven(4));
        System.out.println("5 is even: " + LogicNot.isEven(5));
        System.out.println("-6 is not positive: " + LogicNot.notPositive(-6));
        System.out.println("6 is not positive: " + LogicNot.notPositive(6));
        System.out.println("-9 is even or not positive: " + LogicNot.evenOrNotPositive(-9));
        System.out.println("9 is even or not positive: " + LogicNot.evenOrNotPositive(9));
        System.out.println("17 is not even and positive: " + LogicNot.notEvenAndPositive(17));
        System.out.println("-14 is not even and positive: " + LogicNot.notEvenAndPositive(-14));

    }

}
