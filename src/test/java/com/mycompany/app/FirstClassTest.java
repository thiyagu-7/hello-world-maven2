package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * FirstClass Test.
 */
public class FirstClassTest {
    private FirstClass firstClass = new FirstClass();

    @Test
    public void test_add_with_negative_number() {
        assertEquals(-1, firstClass.add(2, -3));

    }

    @Test
    public void test_add_with_positive_number() {
        assertEquals(5, firstClass.add(2, 3));
    }
}