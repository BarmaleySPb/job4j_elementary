package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To4Then5() {
        int first = 5;
        int second = 4;
        int result = Max.max(first, second);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To8Then8() {
        int first = 3;
        int second = 8;
        int result = Max.max(first, second);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To7Then7() {
        int first = 7;
        int second = 7;
        int result = Max.max(first, second);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To7To5Then7() {
        int first = 1;
        int second = 7;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6To2To4To9Then9() {
        int first = 6;
        int second = 2;
        int third = 4;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}