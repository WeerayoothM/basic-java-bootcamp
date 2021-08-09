package com.example.hellospring.exercise01;

public class FizzBuzzCondition implements MyCondition {
    public boolean check(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    public String print() {
        return "FizzBuzz";
    }
}
