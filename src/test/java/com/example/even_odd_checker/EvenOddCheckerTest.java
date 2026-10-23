
package com.example.even_odd_checker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EvenOddCheckerTest {

    @Test
    void testEvenNumber() {
        assertEquals("Even", EvenOddChecker.checkEvenOdd(8));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", EvenOddChecker.checkEvenOdd(7));
    }

    @Test
    void testZeroIsEven() {
        assertEquals("Even", EvenOddChecker.checkEvenOdd(0));
    }

    @Test
    void testNegativeEvenNumber() {
        assertEquals("Even", EvenOddChecker.checkEvenOdd(-4));
    }

    @Test
    void testNegativeOddNumber() {
        assertEquals("Odd", EvenOddChecker.checkEvenOdd(-3));
    }
}
