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

    @Test
    @DisplayName("Input is 6")
    void case06() {
        int input = 6;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("Fizz",actual);
    }

    @Test
    @DisplayName("Input is 7")
    void case07() {
        int input = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("KBTG",actual);
    }

    @Test
    @DisplayName("Input is 8")
    void case08() {
        int input = 8;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("8",actual);
    }

    @Test
    @DisplayName("Input is 9")
    void case09() {
        int input = 9;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("Fizz",actual);
    }

    @Test
    @DisplayName("Input is 10")
    void case10() {
        int input = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("Buzz",actual);
    }

    @Test
    @DisplayName("Input is 11")
    void case11() {
        int input = 11;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("11",actual);
    }

    @Test
    @DisplayName("Input is 12")
    void case12() {
        int input = 12;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("Fizz",actual);
    }

    @Test
    @DisplayName("Input is 13")
    void case13() {
        int input = 13;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("13",actual);
    }

    @Test
    @DisplayName("Input is 14")
    void case14() {
        int input = 14;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("14",actual);
    }

    @Test
    @DisplayName("Input is 15")
    void case15() {
        int input = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.getResult(input);
        assertEquals("FizzBuzz",actual);
    }
}