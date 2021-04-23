package ru.job4j.condition;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2.0) + Math.pow(this.y - that.y, 2.0));
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2.0) + Math.pow(this.y - that.y, 2.0)
                + Math.pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point pointA = new Point(1, 2);
        Point pointB = new Point(4, 2);
        Point pointA3d = new Point(1, 4, 5);
        Point pointB3d = new Point(2, 5, 9);
        System.out.println("result (1, 2) to (4, 2) " + pointA.distance(pointB));
        System.out.println("result (1, 4, 5) to (2, 5, 9) " + pointA3d.distance3d(pointB3d));
    }
}
