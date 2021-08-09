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
        assertEquals("1",actual);
    }

    @Test
    @DisplayName("Input is 2")
    void case02() {
        int input = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("2",actual);
    }

    @Test
    @DisplayName("Input is 3")
    void case03() {
        int input = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("Fizz",actual);
    }

    @Test
    @DisplayName("Input is 4")
    void case04() {
        int input = 4;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("4",actual);
    }

    @Test
    @DisplayName("Input is 5")
    void case05() {
        int input = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("Buzz",actual);
    }
}