package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class TernaryTest {
    @Test
    public void testAdult() {
        assertEquals("Adult", App.checkAge(20));
    }

    @Test
    public void testMinor() {
        assertEquals("Minor", App.checkAge(16));
    }

    @Test
    public void testEdgeCase() {
        assertEquals("Adult", App.checkAge(18)); // Edge case: 18 is an adult
    }
}

