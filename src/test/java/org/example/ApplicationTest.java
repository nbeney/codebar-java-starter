package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationTest {
    @Test
    void testIsEven() {
        assertTrue(Application.isEven(0));
        assertFalse(Application.isEven(1));
        assertTrue(Application.isEven(2));
        assertFalse(Application.isEven(3));
        assertTrue(Application.isEven(4));
        assertTrue(Application.isEven(1234));
        assertFalse(Application.isEven(1235));
    }

    @Test
    void testIsOdd() {
        assertFalse(Application.isOdd(0));
        assertTrue(Application.isOdd(1));
        assertFalse(Application.isOdd(2));
        assertTrue(Application.isOdd(3));
        assertFalse(Application.isOdd(4));
        assertFalse(Application.isOdd(1234));
        assertTrue(Application.isOdd(1235));
    }
}
