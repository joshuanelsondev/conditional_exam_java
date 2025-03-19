package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


public class SwitchTest {
    @Test
    public void testGradeA() {
        assertEquals("A", App.getGrades(95));
        assertEquals("A", App.getGrades(100)); // Edge case
    }

    @Test
    public void testGradeB() {
        assertEquals("B", App.getGrades(85));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", App.getGrades(72));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", App.getGrades(65));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", App.getGrades(50));
    }
}
