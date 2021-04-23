package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test

    public void when00to40then4() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double expected = 4;
        double result = a.distance(b);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test

    public void when01to09then8() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 9);
        double expected = 8;
        double result = a.distance(b);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test

    public void when21to59then8() {
        Point a = new Point(2, 1);
        Point b = new Point(5, 9);
        double expected = 8.54;
        double result = a.distance(b);
        Assert.assertEquals(expected, result, 0.01);
    }

}