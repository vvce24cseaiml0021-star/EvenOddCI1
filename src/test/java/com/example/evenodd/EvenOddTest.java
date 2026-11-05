package com.example.evenodd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTest {
	@Test
    void testEvenNumber() {
        assertEquals("Even", EvenOdd.checkEvenOdd(4));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", EvenOdd.checkEvenOdd(5));
    }
	
}
