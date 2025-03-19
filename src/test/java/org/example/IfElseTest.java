package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class IfElseTest {
    @Test
    public void testPositiveNumber() {
        assertEquals("Positive", App.checkNumber(10));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("Negative", App.checkNumber(-5));
    }

    @Test
    public void testZero() {
        assertEquals("Zero", App.checkNumber(0));
    }
}
