package com.example.multiplyintegers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MultiplyIntegersTest {

    @Test
    public void testSingleNumber() {
        int result = MultiplyIntegers.multiply("5");
        assertEquals(7, result);
    }

    @Test
    public void testTwoNumbers() {
        int result = MultiplyIntegers.multiply("5", "6");
        assertEquals(30, result);
    }

    @Test
    public void testThreeNumbers() {
        int result = MultiplyIntegers.multiply("5", "6", "7");
        assertEquals(210, result);
    }

    @Test
    public void testNoNumber() {
        assertThrows(IllegalArgumentException.class, () -> MultiplyIntegers.multiply());
    }
}
