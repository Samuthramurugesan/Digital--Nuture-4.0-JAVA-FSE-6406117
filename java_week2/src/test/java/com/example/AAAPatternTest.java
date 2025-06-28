package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AAAPatternTest {

    private int a;
    private int b;

    @Before
    public void setUp() {
        // Arrange
        a = 10;
        b = 5;
        System.out.println("Setup complete");
    }

    @Test
    public void testAddition() {
        // Act
        int result = a + b;

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = a - b;

        // Assert
        assertEquals(5, result);
    }

    @After
    public void tearDown() {
        System.out.println("Teardown complete");
    }
}
