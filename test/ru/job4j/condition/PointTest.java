package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to32then36() {
        int x1 = 0;
        int x2 = 3;
        int y1 = 0;
        int y2 = 2;
        double expected = 3.6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to47then5() {
        int x1 = 1;
        int x2 = 4;
        int y1 = 3;
        int y2 = 7;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when04to16then223() {
        int x1 = 0;
        int x2 = 1;
        int y1 = 4;
        int y2 = 6;
        double expected = 2.23;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}