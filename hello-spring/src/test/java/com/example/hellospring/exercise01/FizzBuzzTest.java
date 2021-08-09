package com.example.hellospring.exercise01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("Input is 1")
    void case01() {
        int input = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("1", actual);
    }
}