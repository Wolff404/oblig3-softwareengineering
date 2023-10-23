package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapyearTest {

    @Test
    void isLeapyearDivisableBy4ButNot100(){
        assertTrue(Leapyear.isLeapyear(2024));

    }

    @Test
    void isLeapyearDivisableBy400() {
        assertTrue(Leapyear.isLeapyear(2000));
    }

    @Test
    void isNotLeapyearDivisableBy4() {
        assertFalse(Leapyear.isLeapyear(1900));
    }

    @Test
    void isNotLeapyearDivisableBy100ButNot400 () {
        assertFalse(Leapyear.isLeapyear(2100));
    }
}
