package ua.ithillel.lonzhansky.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask1 {

    @Test
    public void test1() {
        assertEquals(3, Task1.getArithmeticMeanOfArrayElements(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test2() {
        assertEquals(4.333333333333333, Task1.getArithmeticMeanOfArrayElements(new int[]{3, 8, 2}));
    }

    @Test
    public void test3() {
        assertEquals(0.0, Task1.getArithmeticMeanOfArrayElements(new int[]{}));
    }

    @Test
    public void test4() {
        assertEquals(-1.0, Task1.getArithmeticMeanOfArrayElements(null));
    }

    @Test
    public void test5() {
        assertEquals(411.6, Task1.getArithmeticMeanOfArrayElements(new int[]{123, 232, 345, 569, 789}));
    }

}
