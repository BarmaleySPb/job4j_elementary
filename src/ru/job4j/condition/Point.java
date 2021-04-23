package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2.0) + Math.pow(this.y - that.y, 2.0));
    }

    public static void main(String[] args) {
        Point pointA = new Point(1, 2);
        Point pointB = new Point(4, 2);
        System.out.println("result (1, 2) to (4, 2) " + pointA.distance(pointB));
    }
}
